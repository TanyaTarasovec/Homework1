package Game;

public class Game {
    public String numberofplayers = String.valueOf(10);
    public int numberofjudges = 1;

    public void setNumberofplayers(String numberofplayersValue) {
        this.numberofplayers = numberofplayersValue;
    }
    public String getNumberofplayers(){
        return this.numberofplayers;
    }

}
