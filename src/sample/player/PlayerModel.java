package sample.player;

public class PlayerModel {
    //spiller class'en fra terningespillet. point er ændret til money
        private String name;
        private int money = 1000;

        public int getMoney() {
            return this.money;
        }
        public void addMoney(int money){
            this.money += money;
        }
        public void setMoney(int money){
            this.money = money;
        }

        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
}
