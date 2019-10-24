package sample.game;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import sample.player.playerController;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class gameController {

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



    public void colorChangeBtn(ActionEvent event) throws IOException {
        feltTo.setFill(Color.RED);

    }


}
