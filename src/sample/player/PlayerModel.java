package sample.player;

import sample.account.AccountModel;

//Den optimale løsning ville nok være at PlayerModel arvede fra AccountModel..
public class PlayerModel {
    private int id;
    private String name;

    public PlayerModel(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public int getId(){ return this.id; }
}
