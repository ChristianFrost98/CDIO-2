package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label labelTest;

    public void btnGudPressed(ActionEvent actionEvent) {
        labelTest.setText("GUD KLIKKET");
    }
    public void btnBetterPressed(ActionEvent actionEvent) {
        labelTest.setText("NOGET ANDET KLIKKET");
    }
}

