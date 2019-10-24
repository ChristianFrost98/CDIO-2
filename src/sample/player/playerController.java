package sample.player;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

//Alt dette er bare lige for at lære at bruge JavaFX og Scene  Builder..
public class playerController {

    @FXML
    private TextField Spiller1TextFelt;

    @FXML
    private TextField Spiller2TextFelt;

    @FXML
    private Button btnStart;
    //btnGud bliver lige nu ikke brugt. Set btnGudPressed. I SceneBuilder der kan man enten sætte ID på noget eller kalde en funktion når man gør noget. (Se under code i Scene Builder)

    @FXML
    private Label startGameLabel;


    //knap til at skifte scene
    public void btnStartPressed(ActionEvent event) throws IOException {
        //laver spiller 1 og 2 ud fra navnene i textboksene
        Spiller s1 = new Spiller();
        s1.setName(Spiller2TextFelt.getText());
        Spiller s2 = new Spiller();
        s2.setName(Spiller2TextFelt.getText());

        Parent gameViewParent = FXMLLoader.load(getClass().getResource("../game/gameView.fxml"));
        Scene gameViewScene = new Scene(gameViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.hide();
        window.setScene(gameViewScene);
        window.show();
    }

    //spiller class'en fra terningespillet. point er ændret til penge
    public class Spiller {
        private String name;
        private int penge;

        public int getMoney() {
            return this.penge;
        }
        public void addMoney(int penge){
            this.penge += penge;
        }
        public void setMoney(int penge){
            this.penge = penge;
        }

        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
    }
}

