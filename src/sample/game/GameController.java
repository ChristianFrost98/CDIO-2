package sample.game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import sample.player.PlayerController;
import sample.player.PlayerModel;

import java.io.IOException;

public class GameController {
    @FXML
    private Button throwDiceBtn;
    @FXML
    private Rectangle feltTo;
    @FXML
    private Rectangle feltTre;
    @FXML
    private Rectangle feltFire;
    @FXML
    private Rectangle feltFem;
    @FXML
    private Rectangle feltSeks;
    @FXML
    private Rectangle feltSyv;
    @FXML
    private Rectangle feltOtte;
    @FXML
    private Rectangle feltNi;
    @FXML
    private Rectangle feltTi;
    @FXML
    private Rectangle feltElve;
    @FXML
    private Rectangle feltTolv;
    @FXML
    private Label playerOneName;
    @FXML
    private Label playerTwoName;

    private PlayerModel p1,p2;

    public void colorChangeBtn(ActionEvent event) throws IOException {
        feltTo.setFill(Color.RED);
    }

    public void setPlayers(PlayerModel p1,PlayerModel p2){
        this.p1 = p1;
        this.p2 = p2;

        playerOneName.setText(p1.getName());
        playerTwoName.setText(p2.getName());
    }
}
