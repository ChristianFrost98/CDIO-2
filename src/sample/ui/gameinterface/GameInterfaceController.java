package sample.ui.gameinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import sample.logic.AccountModel;
import sample.logic.DieModel;
import sample.logic.GameModel;
import sample.logic.PlayerModel;

import java.io.IOException;

public class GameInterfaceController {
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

    private GameModel game;

    public void throwDiceBtn(ActionEvent event) throws IOException {
        if(game.isGameOver()){
            return;
        }

        setCurrentPlayerName();
        resetColor();

        DieModel dice1 = new DieModel();
        dice1.rollDice();
        int dice1Number = dice1.getDice();

        DieModel dice2 = new DieModel();
        dice2.rollDice();
        int dice2Number = dice2.getDice();

        int sumDice = dice1Number + dice2Number;

        switch (sumDice) {
            case 2:
                game.getCurrentPlayer().getAccountModel().addBalance(250);
                feltTo.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du reddede prinsessen i tårnet, \n og kongen giver dig 250 mønter!");
                break;
            case 3:
                game.getCurrentPlayer().getAccountModel().addBalance(-100);
                feltTre.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du faldt ned i et krater,\n og tabte 100 mønter derned");
                break;
            case 4:
                game.getCurrentPlayer().getAccountModel().addBalance(100);
                feltFire.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Portene til Paladset åbner for dig,\n og som velkomst får du 100 mønter");
                break;
            case 5:
                game.getCurrentPlayer().getAccountModel().addBalance(-20);
                feltFem.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du er faret vildt i den kolde ørken,\n og bruger 20 mønter på at \n holde varmen");
                break;
            case 6:
                game.getCurrentPlayer().getAccountModel().addBalance(180);
                feltSeks.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du finder sikkerhed i en by \n omringet af mure, +180");
                break;
            case 7:
                feltSyv.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du overnatter i et kloster, +0");
                break;
            case 8:
                game.getCurrentPlayer().getAccountModel().addBalance(-70);
                feltOtte.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du falder ned i en sort grotte, -70");
                break;
            case 9:
                game.getCurrentPlayer().getAccountModel().addBalance(60);
                feltNi.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du finder ly i en hytte i bjergene, +60");
                break;
            case 10:
                game.getCurrentPlayer().getAccountModel().addBalance(-80);
                feltTi.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du bliver overfaldet af ulve-muren,\n de stjæler 80 mønter men du får \n en ekstra tur");
                break;
            case 11:
                game.getCurrentPlayer().getAccountModel().addBalance(-50);
                feltElve.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du bliver smidt i “hullet” \n og mister samtidigt 50 mønter");
                break;
            case 12:
                game.getCurrentPlayer().getAccountModel().addBalance(650);
                feltTolv.setStyle("-fx-background-color:GREEN;");
                resultatTekstFelt.setText("Du fandt en guldmine og \n får 650 mønter!");
                break;
        }
        updateBalanceView();

        if(sumDice != 10) setNextPlayer();
    }

    private void updateBalanceView(){
        playerOneMoney.setText(game.getPlayer1().getAccountModel().toString());
        playerTwoMoney.setText(game.getPlayer2().getAccountModel().toString());
        if (game.getCurrentPlayer().getAccountModel().getBalance()>=3000){
            resultatTekstFelt.setText("GAMEOVER...Vinderen er: " + game.getCurrentPlayer().getName());
            game.endGame();
        }
    }

    private void setCurrentPlayerName(){
        currentPlayerLabel.setText(game.getCurrentPlayer().getName());
    }
    private void setNextPlayer(){
        if(game.getCurrentPlayer().getId() == game.getPlayer1().getId()) {
            game.setCurrentPlayer(game.getPlayer2());
        } else {
            game.setCurrentPlayer(game.getPlayer1());
        }
    }
    public void resetColor(){
        feltTo.setStyle("-fx-background-color:rgba(255,0,0,0.75);");
        feltTre.setStyle("-fx-background-color:rgb(0,0,0,0.5);");
        feltFire.setStyle("-fx-background-color:rgb(255,0,0,0.75);");
        feltFem.setStyle("-fx-background-color:rgba(0,0,0,0.5);");
        feltSeks.setStyle("-fx-background-color:rgb(255,0,0,0.75);");
        feltSyv.setStyle("-fx-background-color:rgba(0,0,0,0.5);");
        feltOtte.setStyle("-fx-background-color:rgb(255,0,0,0.75);");
        feltNi.setStyle("-fx-background-color:rgba(0,0,0,0.5);");
        feltTi.setStyle("-fx-background-color:rgb(255,0,0,0.75);");
        feltElve.setStyle("-fx-background-color:rgba(0,0,0,0.5);");
        feltTolv.setStyle("-fx-background-color:rgb(255,0,0,0.75);");
    }


    public void run(String p1name, String p2name){
        game = new GameModel(new PlayerModel(1, p1name, new AccountModel()), new PlayerModel(2, p2name, new AccountModel()));

        game.setCurrentPlayer(game.getPlayer1());
        playerOneName.setText(game.getPlayer1().getName());
        playerTwoName.setText(game.getPlayer2().getName());

        setCurrentPlayerName();
        updateBalanceView();
    }
}
