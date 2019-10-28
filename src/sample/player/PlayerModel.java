package sample.player;

import sample.account.AccountModel;

//Den optimale løsning ville nok være at PlayerModel arvede fra AccountModel..
public class PlayerModel {
    private String name;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}
