package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class StartScreenController {

    private ResetScreenController resetScreenController;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button login, create;

    @FXML
    private Label info;

    @FXML
    public void logIn(){
        info.setText("");
        String login = loginField.getText();
        String password = passwordField.getText();
        if(login.equals("admin") && password.equals("admin"))
        {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/App.fxml"));
            TabPane tabPane = null;
            try {
                tabPane = loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }
            AppController appController = loader.getController();
            appController.setResetScreenController(resetScreenController);
            resetScreenController.setScreenTab(tabPane);
        }
        else
        {
            info.setText("Nieprawidłowy login lub hasło");
            info.setTextFill(Color.RED);
        }

    }

    @FXML
    public void createAccount(){
        Stage popUp = new Stage();

        popUp.initModality(Modality.APPLICATION_MODAL);
        popUp.setTitle("Create new account.");
        popUp.setWidth(800);
        popUp.setHeight(600);

        Label info = new Label("");
        info.setPadding(new Insets(0,0,0,0));
        info.setFont(Font.font("BatmanForeverAlternate",20));
        Label registrationLabel = new Label("Registration");
        registrationLabel.setFont(Font.font("BatmanForeverAlternate",35));
        TextField username = new TextField();
        username.setMaxWidth(500);
        username.setPromptText("Username");
        username.setPadding(new Insets(10,10,10,10));
        username.setFont(Font.font("BatmanForeverAlternate",25));
        PasswordField password = new PasswordField();
        password.setMaxWidth(500);
        password.setPromptText("Password");
        password.setPadding(new Insets(10,10,10,10));
        password.setFont(Font.font("BatmanForeverAlternate",25));
        PasswordField repeatPassword = new PasswordField();
        repeatPassword.setMaxWidth(500);
        repeatPassword.setPromptText("Repeat password");
        repeatPassword.setPadding(new Insets(10,10,10,10));
        repeatPassword.setFont(Font.font("BatmanForeverAlternate",25));
        TextField email = new TextField();
        email.setMaxWidth(500);
        email.setPromptText("Email");
        email.setPadding(new Insets(10,10,10,10));
        email.setFont(Font.font("BatmanForeverAlternate",25));

        Button returnButton = new Button("Back");
        returnButton.setPadding(new Insets(10,10,10,10));
        returnButton.setFont(Font.font("BatmanForeverAlternate",30));
        returnButton.setOnAction(e -> popUp.close());

        Button registerButton = new Button("Register");
        registerButton.setPadding(new Insets(10,10,10,10));
        registerButton.setFont(Font.font("BatmanForeverAlternate",30));

        VBox layout = new VBox(25);
        layout.getChildren().addAll(registrationLabel,username,email,password,repeatPassword,info,registerButton,returnButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        popUp.setScene(scene);
        popUp.showAndWait();
    }

    @FXML
    public void changeLoginBorder(){
       // loginField.getStyleClass().add("pressedTextField");
       // passwordField.getStyleClass().remove("pressedTextField");
    }

    @FXML
    public void changePasswordBorder(){
      //  passwordField.getStyleClass().add("pressedTextField");
       // loginField.getStyleClass().remove("pressedTextField");
    }

    public void setResetScreenController(ResetScreenController resetScreenController) {
        this.resetScreenController = resetScreenController;
    }

}
