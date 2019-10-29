package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //this.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("ui/playerinterface/playerInterfaceView.fxml"));
        primaryStage.setTitle("Name players");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(600);
    }



    public static void main(String[] args) {
        launch(args);
    }
}
