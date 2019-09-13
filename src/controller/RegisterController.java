package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;


public class RegisterController implements Initializable {
    @FXML private ChoiceBox<String> gender,settlement,level,department,doctor;

    //选项
    ObservableList<String> genders = FXCollections.observableArrayList("男","女");
    ObservableList<String> settlements = FXCollections.observableArrayList("自费","医保");
    ObservableList<String> levels = FXCollections.observableArrayList("普通","专家");

    //初始化
    public void initialize(URL location, ResourceBundle resources){
        gender.setItems(genders);
        settlement.setItems(settlements);
        level.setItems(levels);
    }



}
