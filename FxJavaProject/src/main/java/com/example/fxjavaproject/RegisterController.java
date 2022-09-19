package com.example.fxjavaproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterController {
    @FXML
    TextField nameTextField,surTextField,emailTextField,numberTextField,passTextField;
    @FXML
    Button registerButton, loginButton;

    @FXML
    protected void loginOnClicked(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("login-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),356,410);
            Stage stage = new Stage();
            stage.setTitle("Registration for our group");
            stage.setScene(scene);
            stage.show();
            ((Node)event.getSource()).getScene().getWindow().hide();

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    @FXML
    protected void registerOnClicked(ActionEvent event){
        registerButton.setText("Clicked");
    }
}