package controllers;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class StartScreenController {

    private ResetScreenController resetScreenController;

    @FXML
    private TextField loginField, passwordField;

    @FXML
    private Button login, create;

    @FXML
    public void logIn(){

    }

    @FXML
    public void createAccount(){
        Stage popUp = new Stage();

        popUp.initModality(Modality.APPLICATION_MODAL);
        popUp.setTitle("Create new account.");
        popUp.setWidth(450);
        popUp.setHeight(300);

        Button returnButton = new Button("Back");
        returnButton.setOnAction(e -> popUp.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(returnButton);
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
