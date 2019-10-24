package sample.player;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.player.playerModel;

import javax.swing.*;
import java.io.IOException;

//Alt dette er bare lige for at lære at bruge JavaFX og Scene  Builder..
public class playerController {

    @FXML
    private TextField Spiller1TextFelt;

    @FXML
    private TextField Spiller2TextFelt;

    @FXML
    private AnchorPane PlayerAnchorPane;

    @FXML
    private Button btnStart;
    //btnGud bliver lige nu ikke brugt. Set btnGudPressed. I SceneBuilder der kan man enten sætte ID på noget eller kalde en funktion når man gør noget. (Se under code i Scene Builder)

    @FXML
    private Label startGameLabel;

    public void changed(ObservableValue arg0, Object arg1, Object arg2)    {
        double height = (double) arg2;

    }


    //knap til at skifte scene
    public void btnStartPressed(ActionEvent event) throws IOException {
        //laver spiller 1 og 2 ud fra navnene i textboksene
        playerModel s1 = new playerModel();
        s1.setName(Spiller2TextFelt.getText());
        playerModel s2 = new playerModel();
        s2.setName(Spiller2TextFelt.getText());

        Parent gameViewParent = FXMLLoader.load(getClass().getResource("../game/gameView.fxml"));
        Scene gameViewScene = new Scene(gameViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.hide();
        window.setScene(gameViewScene);
        window.show();
    }

}

