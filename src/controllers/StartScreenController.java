package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;

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
