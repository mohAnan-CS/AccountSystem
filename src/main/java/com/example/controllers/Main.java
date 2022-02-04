package com.example.controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;


import model.Login;
import model.TransactionModel;
import sql.DataBaseConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main extends Application {

    //Hello

    public static Stage STAGE ;

    @Override
    public void start(Stage stage) throws IOException, SQLException {

        STAGE = stage ;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/com/example/view/login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Account Program");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();

    }

    public static void main(String[] args) throws SQLException {

        //launch();

       TransactionModel t =  new TransactionModel();
       t.GetDebittAndCredit1(100,100,"Cash","Cash");

    }

    
}