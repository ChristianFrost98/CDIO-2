package sample.game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.converter.IntegerStringConverter;
import sample.die.DieModel;
import sample.player.PlayerController;
import sample.player.PlayerModel;

import java.io.IOException;

import static javafx.scene.paint.Color.BLUE;
import static javafx.scene.paint.Color.GREEN;

public class GameController {
    @FXML
    private Button throwDiceBtn;
    @FXML
    private Label feltTo;
    @FXML
    private Label feltTre;
    @FXML
    private Label feltFire;
    @FXML
    private Label feltFem;
    @FXML
    private Label feltSeks;
    @FXML
    private Label feltSyv;
    @FXML
    private Label feltOtte;
    @FXML
    private Label feltNi;
    @FXML
    private Label feltTi;
    @FXML
    private Label feltElve;
    @FXML
    private Label feltTolv;
    @FXML
    private Label playerOneName;
    @FXML
    private Label playerTwoName;
    @FXML
    private Label playerOneMoney;
    @FXML
    private Label playerTwoMoney;
    @FXML
    private Label resultatTekstFelt;
    @FXML
    private Label currentPlayerLabel;

    private PlayerModel p1,p2;
    private PlayerModel currentPlayer;

    public void throwDiceBtn(ActionEvent event) throws IOException {
        setCurrentPlayerName();
        resetColor();

        DieModel dice1 = new DieModel();
        dice1.rollDice();
        int dice1Number = dice1.getDice();

        DieModel dice2 = new DieModel();
        dice2.rollDice();
        int dice2Number = dice2.getDice();

        if(dice1Number != dice2Number){
            GameController.this.setNextPlayer();
        }

        switch (dice1Number + dice2Number) {
            case 2:
                currentPlayer.addMoney(250);
                feltTo.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du reddede prinsessen i tårnet, og kongen giver dig 250 mønter!");
                break;
            case 3:
                currentPlayer.addMoney(-100);
                feltTre.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du faldt ned i et krater, og tabte 100 mønter derned");
                break;
            case 4:
                currentPlayer.addMoney(100);
                feltFire.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Portene til Paladset åbner for dig, og som velkomst får du 100 mønter");
                break;
            case 5:
                currentPlayer.addMoney(-20);
                feltFem.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du er faret vildt i den kolde ørken, og bruger 20 mønter på at holde varmen");
                break;
            case 6:
                currentPlayer.addMoney(180);
                feltSeks.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du finder sikkerhed i en by omringet af mure, +180");
                break;
            case 7:
                currentPlayer.addMoney(0);
                feltSyv.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du overnatter i et kloster, +0");
                break;
            case 8:
                currentPlayer.addMoney(-70);
                feltOtte.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du falder ned i en sort grotte, -70");
                break;
            case 9:
                currentPlayer.addMoney(60);
                feltNi.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du finder ly i en hytte i bjergene, +60");
                break;
            case 10:
                currentPlayer.addMoney(-80);
                feltTi.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du bliver overfaldet af ulve-muren, de stjæler 80 mønter men du får en ekstra tur");
                break;
            case 11:
                currentPlayer.addMoney(-50);
                feltElve.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du bliver smidt i “hullet” og mister samtidigt 50 mønter");
                break;
            case 12:
                currentPlayer.addMoney(650);
                feltTolv.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du fandt en guldmine og får 650 mønter!");
                break;
        }
        playerOneMoney.setText(Integer.toString(p1.getMoney()));
        playerTwoMoney.setText(Integer.toString(p2.getMoney()));
        if (p1.getMoney()>=3000 || p2.getMoney()>=3000){
            resultatTekstFelt.setText("GAMEOVER...Vinderen er: " + currentPlayer);
        }
    }

    public void GameController(PlayerModel p1,PlayerModel p2){
        this.p1 = p1;
        this.p2 = p2;
        this.currentPlayer = this.p1;
        playerOneName.setText(p1.getName());
        playerTwoName.setText(p2.getName());

        setCurrentPlayerName();

        playerOneMoney.setText(Integer.toString(p1.getMoney()));
        playerTwoMoney.setText(Integer.toString(p2.getMoney()));
    }

    private void setCurrentPlayerName(){
        currentPlayerLabel.setText(this.currentPlayer.getName());
    }
    private void setNextPlayer(){
        if (GameController.this.currentPlayer.getName().equals(GameController.this.p1.getName())) {
            GameController.this.currentPlayer = GameController.this.p2;
        } else {
            GameController.this.currentPlayer = GameController.this.p1;
        }
        GameController.this.setCurrentPlayerName();
    }
    public void resetColor(){
        feltTo.setStyle("-fx-background-color:rgba(0,0,0,0);");
        feltTre.setStyle("-fx-background-color:rgba(0,0,0,0);");
        feltFire.setStyle("-fx-background-color:rgba(0,0,0,0);");
        feltFem.setStyle("-fx-background-color:rgba(0,0,0,0);");
        feltSeks.setStyle("-fx-background-color:rgba(0,0,0,0);");
        feltSyv.setStyle("-fx-background-color:rgba(0,0,0,0);");
        feltOtte.setStyle("-fx-background-color:rgba(0,0,0,0);");
        feltNi.setStyle("-fx-background-color:rgba(0,0,0,0);");
        feltTi.setStyle("-fx-background-color:rgba(0,0,0,0);");
        feltElve.setStyle("-fx-background-color:rgba(0,0,0,0);");
        feltTolv.setStyle("-fx-background-color:rgba(0,0,0,0);");
    }

}
