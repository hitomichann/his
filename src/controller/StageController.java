package controller;

import javafx.stage.Stage;
import java.util.HashMap;

public class StageController {
    private static Stage theStage;
    public static void setStage(Stage stage) {
        theStage = stage;
    }

    public static Stage getStage(){
        return theStage;
    }
}
