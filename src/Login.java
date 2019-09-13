import controller.StageController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import model.Doctor;
import model.Hospital;
import model.Register;

import java.io.IOException;

public class Login {
    public void doctorLogin(String name, String password) throws IOException {
        for (Doctor doctor : Hospital.getDoctors()) {
            if (doctor.getName().equals(name) && doctor.getPassword().equals(password)) {
                Parent root = FXMLLoader.load(getClass().getResource("fxml/Doctor.fxml"));
                Scene scene = new Scene(root);
                Stage primaryStage = StageController.getStage();
                primaryStage.setScene(scene);
                primaryStage.setTitle("model.Doctor");
                primaryStage.show();
                return;
            }
        }
        final Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert");
        alert.setHeaderText("");
        alert.setContentText("用户名不存在或密码输入错误");
        alert.showAndWait();

    }
    public void registerLogin(String name, String password) throws IOException {
        for (Register register : Hospital.getRegisters()) {
            {
                if (register.getName().equals(name) && register.getPassword().equals(password)) {
                    Parent root = FXMLLoader.load(getClass().getResource("fxml/Register.fxml"));
                    Scene scene = new Scene(root);
                    Stage primaryStage = StageController.getStage();
                    primaryStage.setScene(scene);
                    primaryStage.setTitle("model.Register");
                    primaryStage.show();
                    return;
                }
            }
            final Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Alert");
            alert.setHeaderText("");
            alert.setContentText("用户名不存在或密码输入错误");
            alert.showAndWait();
        }
    }
}



