import java.util.Date;

public class GamerHandler {

    public GamerHandler() {

        /* This class will eventually have the ability to create and store payment and address info for each
        gamer, most likely during the registration process. The gamer object itself will also be instantiated.
        Eventually we want it to be able to remove gamers that get flagged excessively as well. */

        // create address, will use this same address for all gamers since I am lazy
        Address address = new Address("GameStreet", "55555", "AZ", "PolyTech");

        // Create Credit Cards
        CreditCard credit1 = new CreditCard("1234123412341234", new Date(), 4444);
        CreditCard credit2 = new CreditCard("7782940550101239", new Date(), 579);

        // Create gamers
        Gamer gamer1 = new Gamer(credit1, "Biffalo", 33, address, 0, "qwerty", "gamer1");
        Gamer gamer2 = new Gamer(credit2, "xXx1337g4m3rxXx", 19, address, 0, "ilikeducks", "gamer2");

        //Adding gamers
        //This is adding it to the system's database, the hashmap of all gamers
        Main.gamers.put("Biffalo", gamer1);
        Main.gamers.put("xXx1337g4m3rxXx", gamer2);

        //Adding games to gamers
        //This is adding to the gamer object's hashmap (where we have a hashmap in a hashmap scenario)
        //The games had to exist in the system first, now we can add them to the gamer object to simulate a purchase
        Main.gamers.get("Biffalo").games.put(7, Main.games.get(7));
        Main.gamers.get("xXx1337g4m3rxXx").games.put(1, Main.games.get(1));
        Main.gamers.get("xXx1337g4m3rxXx").games.put(7, Main.games.get(7));
        //Game 7 is owned by both gamers, Game 1 is only owned by xXx1337g4m3rxXx

    }
}
