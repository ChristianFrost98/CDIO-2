package sample.game;

import sample.account.AccountModel;
import sample.player.PlayerModel;

public class GameModel {
    private boolean gameOver;

    public AccountModel a1, a2;

    public GameModel(PlayerModel p1, PlayerModel p2){
        this.gameOver = false;
        this.a1 = new AccountModel(p1);
        this.a2 = new AccountModel(p2);
    }

    public boolean isGameOver() {
        return gameOver;
    }
    public void endGame(){
        gameOver = true;
    }
}