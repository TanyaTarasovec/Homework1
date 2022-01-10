package games;

public abstract class RunGames extends Games {
    private String name = "RunGames";
    private int person = 6;

    public RunGames() {

    }

    public RunGames(String name) {
        this.name = name;
    }

    public void setName(String nameValue) {
        this.name = nameValue;
    }

    public String getName() {
        return this.name;
    }

    public void setPerson(String personValue) {
        this.name = personValue;
    }

    public int getPerson() {
        return this.person;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Person: " + this.person);
    }
}

