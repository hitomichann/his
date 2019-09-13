package controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import java.io.IOException;

public class LoginController {
    @FXML private RadioButton registerRb;
    @FXML private RadioButton doctorRb;
    @FXML private Button login;
    @FXML private TextField passwordText;
    @FXML private TextField nameText;

    public void loginHandler(ActionEvent event) throws IOException {
        String password = passwordText.getText();
        String name = nameText.getText();

        if(registerRb.isSelected()){
            //调用挂号登录校验+跳转界面
            new Login().registerLogin(name,password);
        }
        else if(doctorRb.isSelected()){
           //调用医生登录校验+跳转界面
            new Login().doctorLogin(name,password);
        }
    }
}
