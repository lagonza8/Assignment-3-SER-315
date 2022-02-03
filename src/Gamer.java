import java.util.ArrayList;
import java.util.HashMap;

public class Gamer {

    public String name;
    public int age;
    public int flags;
    public String password;
    public String username;

    public ArrayList<Review> reviews = new ArrayList<>();
    public HashMap<Integer, Game> games = new HashMap<>();
    public CreditCard creditCard;
    public Address address;

    // could also include Admin but not very useful
    
    // super long constructor, later on when we hit Design Patters this could be done more elegant with a Builder Pattern
    public Gamer (CreditCard creditCard, String username, int age, Address address, int flags, String password, String name) {
        this.creditCard = creditCard;
        this.name = name;
        this.age = age;
        this.address = address;
        this.flags = flags;
        this.password = password;
        this.username = username;
    }

}
