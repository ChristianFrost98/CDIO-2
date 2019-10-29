package sample.logic.game;

import sample.logic.player.PlayerModel;

public class GameModel {
    private boolean gameOver;

    public PlayerModel p1, p2;

    public GameModel(PlayerModel p1, PlayerModel p2){
        this.gameOver = false;
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean isGameOver() {
        return gameOver;
    }
    public void endGame(){
        gameOver = true;
    }
}