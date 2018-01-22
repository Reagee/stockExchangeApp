package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class AppController {

    ResetScreenController resetScreenController;

    @FXML
    private AnchorPane wig20tab,wig30tab,zlotoTab,srebroTab,eurplnTab,eurusdTab;

    public void initialize(){
        WebView browser =new WebView();
        browser.setPrefSize(1920,1020);
        WebEngine webEngine = browser.getEngine();
        webEngine.load("https://www.bankier.pl/inwestowanie/profile/quote.html?symbol=WIG20");
        wig20tab.getChildren().addAll(browser);
    }

    @FXML
    public void wig20Choose(){
        WebView browser =new WebView();
        browser.setPrefSize(1920,1020);
        WebEngine webEngine = browser.getEngine();
        webEngine.load("https://www.bankier.pl/inwestowanie/profile/quote.html?symbol=WIG20");
        wig20tab.getChildren().addAll(browser);
    }

    @FXML
    public void wig30Choose(){
        WebView browser =new WebView();
        browser.setPrefSize(1920,1020);
        WebEngine webEngine = browser.getEngine();
        webEngine.load("https://www.bankier.pl/inwestowanie/profile/quote.html?symbol=WIG30");
        wig30tab.getChildren().addAll(browser);
    }

    @FXML
    public void goldChoose(){
        WebView browser =new WebView();
        browser.setPrefSize(1920,1020);
        WebEngine webEngine = browser.getEngine();
        webEngine.load("https://www.bankier.pl/inwestowanie/profile/quote.html?symbol=ZLOTO");
        zlotoTab.getChildren().addAll(browser);
    }

    @FXML
    public void silverChoose(){
        WebView browser =new WebView();
        browser.setPrefSize(1920,1020);
        WebEngine webEngine = browser.getEngine();
        webEngine.load("https://www.bankier.pl/inwestowanie/profile/quote.html?symbol=SREBRO");
        srebroTab.getChildren().addAll(browser);
    }

    @FXML
    public void eurplnChoose(){
        WebView browser =new WebView();
        browser.setPrefSize(1920,1020);
        WebEngine webEngine = browser.getEngine();
        webEngine.load("https://www.bankier.pl/waluty/kursy-walut/forex/EURPLN");
        eurplnTab.getChildren().addAll(browser);
    }

    @FXML
    public void eurusdChoose(){
        WebView browser =new WebView();
        browser.setPrefSize(1920,1020);
        WebEngine webEngine = browser.getEngine();
        webEngine.load("https://www.bankier.pl/waluty/kursy-walut/forex/EURGBP");
        eurusdTab.getChildren().addAll(browser);
    }













    public void setResetScreenController(ResetScreenController resetScreenController) {
        this.resetScreenController = resetScreenController;
    }
}
