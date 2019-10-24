package sample.player;

public class playerModel {

    //spiller class'en fra terningespillet. point er ændret til penge
        private String name;
        private int penge;

        public int getMoney() {
            return this.penge;
        }
        public void addMoney(int penge){
            this.penge += penge;
        }
        public void setMoney(int penge){
            this.penge = penge;
        }

        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }


}
