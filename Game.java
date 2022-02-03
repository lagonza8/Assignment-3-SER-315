import java.util.ArrayList;

public class Game {
    
    public Integer gameID;
    public String name;
    public boolean isMultiplayer;
    public boolean isApproved = true; // setting this to true for now to not have to handle the approved process
    

    public Developer developer;
    public ArrayList<Review> reviews = new ArrayList<>();
    // could have a list of Gamers who bought the game since bi-direcation association not very valuable though
    // could include Admin due to consistency

    public Game (Developer developer, String name, boolean isMultiplayer, int gameID) {
        this.developer = developer;
        this.name = name;
        this.isMultiplayer = isMultiplayer;
        this.gameID = gameID;
    }

}
