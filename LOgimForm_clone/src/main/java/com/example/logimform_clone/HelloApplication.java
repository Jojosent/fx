package com.example.logimform_clone;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Stage window;
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        window = primaryStage;
        window.setTitle("Login Form");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10));
        grid.setVgap(10);

        Text wlcmTxt = new Text("Welcome");
        wlcmTxt.setFont(Font.font("Jomart", FontWeight.LIGHT,25));
        grid.add(wlcmTxt ,0 ,0);

        Label lblUser=new Label("Username");
        grid.add(lblUser ,0 ,1);

        TextField txtUser=new TextField();  
        txtUser.setPromptText("username");
        grid.add(txtUser,1,1);

        Label lblPass=new Label("Password");
        grid.add(lblPass ,0 ,2);

        PasswordField txtPass=new PasswordField();
        txtPass.setPromptText("password");
        grid.add(txtPass,1,2);

        Button loginBtn = new Button("Login");
        grid.add(loginBtn, 1, 3);
        loginBtn.setOnAction(e->{
            System.out.println(txtUser.getText());
            System.out.println(txtPass.getText());
        });

        Scene scene = new Scene(grid,500,500);
        window.setScene(scene);
        window.show();
    }
}