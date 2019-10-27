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
    private Label feltTolv;
    @FXML
    private Label playerOneName;
    @FXML
    private Label playerTwoName;

    private PlayerModel p1,p2;

/*    public void colorChangeBtn(ActionEvent event) throws IOException {
        feltTolv.setFill(Color.RED);
    }
*/
    public void setPlayers(PlayerModel p1,PlayerModel p2){
        this.p1 = p1;
        this.p2 = p2;

        playerOneName.setText(p1.getName());
        playerTwoName.setText(p2.getName());
    }
}
