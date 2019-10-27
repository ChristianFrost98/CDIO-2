package sample.game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.converter.IntegerStringConverter;
import sample.die.DieModel;
import sample.player.PlayerController;
import sample.player.PlayerModel;

import java.io.IOException;

public class GameController {
    @FXML
    private Button throwDiceBtn;
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
    private Label currentPlayerLabel;

    private PlayerModel p1,p2;
    private PlayerModel currentPlayer;

    public void throwDiceBtn(ActionEvent event) throws IOException {
        setCurrentPlayerName();

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
                break;
            case 3:
                currentPlayer.addMoney(-100);
                break;
            case 4:
                currentPlayer.addMoney(100);
                break;
            case 5:
                currentPlayer.addMoney(-20);
                break;
            case 6:
                currentPlayer.addMoney(180);
                break;
            case 7:
                currentPlayer.addMoney(0);
                break;
            case 8:
                currentPlayer.addMoney(-70);
                break;
            case 9:
                currentPlayer.addMoney(60);
                break;
            case 10:
                currentPlayer.addMoney(-80);
                break;
            case 11:
                currentPlayer.addMoney(-50);
                break;
            case 12:
                currentPlayer.addMoney(650);
                break;
        }
        playerOneMoney.setText(Integer.toString(p1.getMoney()));
        playerTwoMoney.setText(Integer.toString(p2.getMoney()));
        if (p1.getMoney()>=3000 || p2.getMoney()>=3000){
            System.exit(0);
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
}
