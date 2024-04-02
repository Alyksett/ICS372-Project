package aya.reviews;

import javafx.application.Application;
import javafx.stage.Stage;
import aya.reviews.GUI.Launch;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Launch l = new Launch();
        l.start(stage);
    }
}