package sample.logic.game;

import sample.logic.player.PlayerModel;

public class GameModel {
    private boolean gameOver;

    private PlayerModel p1, p2;
    private PlayerModel currentPlayer;

    public GameModel(PlayerModel p1, PlayerModel p2){
        this.gameOver = false;
        this.p1 = p1;
        this.p2 = p2;
    }

    public PlayerModel getPlayer1(){
        return p1;
    }

    public PlayerModel getPlayer2(){
        return p2;
    }

    public PlayerModel getCurrentPlayer(){
        return currentPlayer;
    }

    public void setCurrentPlayer(PlayerModel player){
        this.currentPlayer = player;
    }

    public boolean isGameOver() {
        return gameOver;
    }
    public void endGame(){
        gameOver = true;
    }
}