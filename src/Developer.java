import java.util.HashMap;
import java.util.ArrayList;

public class Developer {
    public String name;
    public double credits;
    public boolean isApproved;
    public String username;
    public String password;
    

    public HashMap<String, Game> games = new HashMap<>();  
    public ArrayList<Review> reviews = new ArrayList<>();

    // Decided to not include the Admin into the Dev and the Credit card since it was not explicitly mentioned in reqs
    
    public Developer(String name, String username, double credits, String password) {
        this.name = name;
        this.username = username;
        this.credits = credits;
        this.password = password;
        this.isApproved = false;
    }

}
