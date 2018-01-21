package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class ResetScreenController {

    @FXML
    private Pane mainPane;

    @FXML
    public void initialize(){
        loadStartScreen();
    }

    public void loadStartScreen(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/StartScreen.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e){
            e.printStackTrace();
        }
        StartScreenController startScreenController = loader.getController();
        startScreenController.setResetScreenController(this);
        setScreen(pane);
    }

    public void setScreen(Pane pane){
        mainPane.getChildren().clear();
        mainPane.getChildren().add(pane);
    }
}
