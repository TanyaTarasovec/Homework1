import Games.*;

public class Executor {
    public static void main(String [] args) {
Football football = new Football();
System.out.println(football.getName()  + football.getPerson());

Tennis tennis = new Tennis();
System.out.println(tennis.getName() + tennis.getPerson());

 Mafiya mafiya = new Mafiya();
    System.out.println(mafiya.getName() + mafiya.getPerson());

    Hockey hockey = new Hockey();
    System.out.println(hockey.getName() + hockey.getPerson());

    Basketball basketball = new Basketball();
    System.out.println(basketball.getName() + basketball.getPerson());

    Monopoly monopoly = new Monopoly();
    System.out.println(monopoly.getName() + monopoly.getPerson());

    Voleyball voleyball = new Voleyball();
    System.out.println(voleyball.getName() + voleyball.getPerson());

    Crocodile crocodile = new Crocodile();
    System.out.println(crocodile.getName() + crocodile.getPerson());

    Hideandseek hideandseek = new Hideandseek();
    System.out.println(hideandseek.getName() + hideandseek.getPerson());
    }
}
