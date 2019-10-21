package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

//Alt dette er bare lige for at lære at bruge JavaFX og Scene Builder..
public class Controller {

    @FXML
    private Label labelTest;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private Button btnGud;
    //btnGud bliver lige nu ikke brugt. Set btnGudPressed. I SceneBuilder der kan man enten sætte ID på noget eller kalde en funktion når man gør noget. (Se under code i Scene Builder)

    public void btnGudPressed(ActionEvent actionEvent) {
        labelTest.setTextFill(colorPicker.getValue());
        labelTest.setText("GUD KLIKKET");
    }
}

