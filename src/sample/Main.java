package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/fxml/ResetScreen.fxml"));
        Pane pane;
        try {
            pane = loader.load();
            Scene scene = new Scene(pane);
            scene.getStylesheets().add("fxml/style.css");
            primaryStage.setMaximized(true);
            primaryStage.setScene(scene);
            primaryStage.setTitle("StockExchange");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
