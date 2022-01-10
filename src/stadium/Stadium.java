package stadium;

import games.Football;
import games.Games;
import games.IStadium;
import games.RunGames;

import java.util.ArrayList;
import java.util.List;

public class Stadium {
    private IStadium stadium;
    private String name;

    private List<RunGames> listRunGames;
    private List<Games> listGames;
    private List<Football> listFootball;

    public Stadium(){
    listRunGames = new ArrayList<RunGames>();
    listGames = new ArrayList<Games>();
    listFootball = new ArrayList<Football>();
}
public Stadium (String name){
    this.name = name;
    }
    public void setListRunGames(RunGames runGames){
        this.listRunGames.add(runGames);
    }
    public List<RunGames> getListRunGames(){
        return this.listRunGames;
    }
    public void setListGames(Games games){
        this.listGames.add(games);
    }
    public List<Games> getListGames(){
        return this.listGames;
    }
    public void setListFootball(Football football){
        this.listFootball.add(football);
    }
    public List<Football> getListFootball(){
        return this.listFootball;
    }
    public String getName(){
        return this.name;
    }
    public void setStadium(IStadium stadium){
        this.stadium = stadium;
    }
    public IStadium getStadium(){
        return this.stadium;
    }
    public void printListNameRunGames(){
        for (RunGames runGames : getListRunGames()){
            System.out.println(runGames.getName());
        }

    }
    public void printListGames(){
        for (Games games : this.getListGames()){
            System.out.println(games.getName());
        }
    }

    public void setListFootball1(Football football1) {
    }
}
