
public class Review {
    public int id;
    public int stars;
    public String text;
    public boolean flag;

    public Game game;
    public Gamer gamer;
    // public Developer dev; not really needed for implementation but could be included for consistency with DMC
    
    public Review (Game game, Gamer gamer, int stars, String text) {
        this.game = game;
        this.gamer = gamer;
        this.stars = stars;
        this.text = text;
        this.flag = false;
    }

}
