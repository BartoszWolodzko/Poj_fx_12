package com.example.POJ_12lab;

import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class AlertButonAboveTable {
    public AlertButonAboveTable(String textSelected, int numberOfPeopleSelected) {
        var alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("People selected for vaccination");
        alert.setHeaderText("Selected Persons:");

        TextArea textArea = new TextArea(textSelected);
        textArea.setWrapText(true);
        textArea.setEditable(false);

        var anchor=new AnchorPane();
        var vBox=new VBox();
        var label = new Label();
        label.setText("Number of people under 30: "+ numberOfPeopleSelected);

        anchor.getChildren().add(vBox);
        vBox.getChildren().add(textArea);
        vBox.getChildren().add(label);
        alert.getDialogPane().setContent(anchor);

        alert.showAndWait();
    }
}
