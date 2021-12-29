package human;

public class Person implements IHuman{
    @Override
    public void run() {
        System.out.println("Run after the ball");
    }
}
