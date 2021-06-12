package com.example.POJ_12lab;

import javafx.scene.control.*;

public class ButtonAboveTable {
    static Button createButton(TableView<Person> table) {
        var button = new Button("Print info");
        button.setOnMouseClicked(mouseEvent -> {
            var sb = new StringBuilder();

            int numberOfPeopleUnder30 = 0;
            for(Person p: table.getSelectionModel().getSelectedItems()) {
                if (p.getAge()>=30){
                    sb.append(p);
                    sb.append(System.lineSeparator());
                }
                else{
                    numberOfPeopleUnder30++;
                }
            }

            new AlertButonAboveTable(sb.toString(),numberOfPeopleUnder30);
        });

        return button;
    }
}
