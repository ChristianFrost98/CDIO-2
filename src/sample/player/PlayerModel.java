package sample.player;

import sample.account.AccountModel;

//Den optimale løsning ville nok være at AccountModel arvede fra PlayerModel..
public class PlayerModel {
    private int id;
    private String name;

    private AccountModel accountModel;

    public PlayerModel(int id, String name, AccountModel accountModel){
        this.id = id;
        this.name = name;
        this.accountModel = accountModel;
    }

    public AccountModel getAccountModel(){
        return accountModel;
    }

    public String getName(){
        return this.name;
    }
    public int getId(){ return this.id; }
}
