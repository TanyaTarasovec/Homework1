package games;

public class Football extends Games implements IStadium {
    private String name = "Football";
    private int person = 10;

    public Football(){

    }
    public Football (String name){
        this.name = name;
    }
    public void setName(String nameValue){
        this.name = nameValue;
    }
    public String getName(){
        return this.name;
    }
    public void setPerson(String personValue){
        this.name = personValue;
    }
    public int getPerson(){
        return this.person;
    }
    public void printInfo(){
        System.out.println("Name: " +this.name);
        System.out.println("Person: " + this.person);
    }
    @Override
    public void play() {

    }

    @Override
    public void run() {

    }

    @Override
    public void win() {

    }

    @Override
    public String printInfoStadium() {
        return null;
    }
}
