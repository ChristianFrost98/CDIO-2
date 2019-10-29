package sample.logic.account;

public class AccountModel {
    private int balance = 1000;

    public int getBalance() {
        return this.balance;
    }
    public void addBalance(int balance){
        this.balance += balance;
        if(this.balance < 0) setBalance(0);
    }
    public void setBalance(int balance){
        this.balance = balance;
        if(this.balance < 0) this.balance = 0;
    }

    //Man kunne også bare kalde denne getBalanceToString da den ikke returnerer AccountModel men balancen.
    @Override
    public String toString() {
        return Integer.toString(this.balance);
    }
}
