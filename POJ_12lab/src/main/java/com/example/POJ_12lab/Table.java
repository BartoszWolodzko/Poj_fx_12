package com.example.POJ_12lab;

import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Table {
    static TableView<Person> createTable() {
        var table = new TableView<Person>();
        table.getItems().addAll(
                new Person("Name1","Surname1", 19, Person.Gender.MALE),
                new Person("Name2","Surname2", 31, Person.Gender.FEMALE),
                new Person("Name3","Surname3", 30, Person.Gender.MALE),
                new Person("Name4","Surname4", 45, Person.Gender.FEMALE)

        );
        var nameColumn = new TableColumn<Person, String>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        var surnameColumn = new TableColumn<Person, String>("Surname");
        surnameColumn.setCellValueFactory(new PropertyValueFactory<>("surname"));

        var ageColumn = new TableColumn<Person, Integer>("Age");
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));

        var genderColumn = new TableColumn<Person, Person.Gender>("Gender");
        genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));

        table.getColumns().addAll(nameColumn, surnameColumn, ageColumn, genderColumn);

        table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        return table;
    }
}
