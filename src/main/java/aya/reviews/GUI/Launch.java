package aya.reviews.GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import aya.reviews.Controller;
public class Launch extends Application{

    PasswordField pwBox;
    TextField userTextField;

    @Override public void start(Stage primaryStage) {
        primaryStage.setTitle("Example Login screen"); // Set Title

        //Create Grid
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // create Scene
        Scene scene = new Scene(grid, 350, 200);
        primaryStage.setScene(scene); // Set Scene

        // Create and add Title
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        // Create and add User field
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);
        this.userTextField = new TextField();
        grid.add(this.userTextField, 1, 1);

        // Create and add Pass field
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);
        this.pwBox = new PasswordField();
        grid.add(this.pwBox, 1, 2);

        // Create and add Sign in button
        Button signButton = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_LEFT);
        hbBtn.getChildren().add(signButton);
        grid.add(hbBtn, 1, 4);
        signButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                handleLoginAttempt();
            }
        });

        // Create and add register button
        Button registerButton = new Button("Register");
        HBox rBtn = new HBox(10);
        rBtn.setAlignment(Pos.BOTTOM_LEFT);
        rBtn.getChildren().add(registerButton);
        grid.add(rBtn, 1, 5);

        registerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                handleRegisterAttempt();
            }
        });


        // Show the stage
        primaryStage.show();
    }
    private void handleLoginAttempt(){
        String user = this.userTextField.getText();
        String pass = this.pwBox.getText();
        Controller.onLoginAttempt(user, pass);

    }

    private void handleRegisterAttempt(){
        String user = this.userTextField.getText();
        String pass = this.pwBox.getText();
        Controller.onRegisterAttempt(user, pass);
    }


    public static void main(String[] args) {
        launch(args);
    }
}