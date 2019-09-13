package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class DoctorController implements Initializable {
    @FXML private ChoiceBox<String> west;
    ObservableList<String> types = FXCollections.observableArrayList("麻醉药品处方","急诊处方","儿科处方","普通处方");
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        west.setItems(types);
    }
}
