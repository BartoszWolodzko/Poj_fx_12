package com.example.POJ_12lab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage){
        var table = Table.createTable();
        var vBox = new VBox(ButtonAboveTable.createButton(table), table);
        var stackPane = new StackPane(vBox);
        var scene = new Scene(stackPane, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
