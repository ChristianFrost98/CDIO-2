package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    private Label labelTest;

    @FXML
    private ColorPicker colorPicker;

    public void btnGudPressed(ActionEvent actionEvent) {
        labelTest.setTextFill(colorPicker.getValue());
        labelTest.setText("GUD KLIKKET");
    }
}

