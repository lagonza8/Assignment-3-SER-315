import java.util.Date;
import java.util.HashMap;

public class Main {
    static HashMap<Integer, Game> games = new HashMap<>();
    static HashMap<String, Gamer> gamers = new HashMap<>();
    
    public static void main(String[] args) {

        //Adding admin
        Admin mehlhase = new Admin();
        
        //Adding devs
        Developer tim = new Developer("Dingus", "ding", 5.0, "correcthorsebatterystaple");
        tim.isApproved = true;
        Developer gaby = new Developer("itmedevl0per", "dev", 5.0, "torie");
        gaby.isApproved = true;
        
        // Create Games
        Game game1 = new Game(tim, "Sanic the Head Chog", false, 7);
        Game game2 = new Game(gaby, "Pakemen", true, 1);

        //Adding games to system
        games.put(game1.gameID, game1);   
        games.put(game2.gameID, game2);
        
        // create address, will use this same address for all gamers since I am lazy
        Address address = new Address("GameStreet", "55555", "AZ", "PolyTech");

        // Create Credit Cards
        CreditCard credit1 = new CreditCard("1234123412341234", new Date(), 4444);
        CreditCard credit2 = new CreditCard("7782940550101239", new Date(), 579);

        // Create gamers
        Gamer gamer1 = new Gamer(credit1, "Biffalo", 33, address, 0, "qwerty", "gamer1");
        Gamer gamer2 = new Gamer(credit2, "xXx1337g4m3rxXx", 19, address, 0, "ilikeducks", "gamer2");

        //Adding gamers
        gamers.put("Biffalo", gamer1);
        gamers.put("xXx1337g4m3rxXx", gamer2);
        
        //Adding games to gamers
        gamers.get("Biffalo").games.put(7, games.get(7));              
        gamers.get("xXx1337g4m3rxXx").games.put(1, games.get(1));
        gamers.get("xXx1337g4m3rxXx").games.put(7, games.get(7));

        // Adding some reviews manually to game and gamer
        Review  review = new Review(games.get(1), gamers.get("xXx1337g4m3rxXx"),1,"Just kidding, I hated it too");
        games.get(1).reviews.add(review);
        gamers.get("xXx1337g4m3rxXx").reviews.add(review);

        //Testing, this will not add reviews but only print out the outcomes
        System.out.println("***Should fail for lack of owning game***");
        addReview("Biffalo", 1, 1, "I hated it");
        
        
        System.out.println("\n***Should succeed***");
        addReview("Biffalo", 7, 5, "This game literally changed my life and saved my marriage.");
        
        
        System.out.println("\n***Should fail for duplicate review***");
        addReview("xXx1337g4m3rxXx", 1, 1, "Just kidding, I hated it too");

        System.out.println("\n***Should succeed***");
        addReview("xXx1337g4m3rxXx", 7, 4, "Great game");
        
    }
    
    
    public static void addReview(String username, Integer gameID, int rating, String text) {
        Gamer gamer = gamers.get(username);        
        Game game = games.get(gameID);
        
        //Check if game contains review from gamer
        boolean isReviewed = false;
        if (!game.reviews.isEmpty()) {
            for (Review rev : game.reviews) {
                if (rev.gamer == gamer) {
                    isReviewed = true;
                }
            }    
        }
        
        //Check for empty list
        if (!gamer.games.isEmpty()) {
            
            //Check if gamer owns game
            if (!gamer.games.containsValue(game)) {
                System.out.println(username + " doesn't own the game " + game.name + "!");
                
            //Check if gamer already reviewed game
            } else {
                if (isReviewed) {
                    System.out.println(username + " already reviewed " + game.name + ", please use change review!");
                    
                //Successful add
                } else {
                    System.out.println("To gamer: " + username + " review added: \"" + text + "\", " + rating + " star(s), to " + game.name);
                    System.out.println("To dev: " + username + " new review added: \"" + text + "\", " + rating + " star(s), to " + game.name);
                }   
            }
        }

    }

}
