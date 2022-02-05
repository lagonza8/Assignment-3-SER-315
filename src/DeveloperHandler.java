import java.util.Date;

public class DeveloperHandler {

    public DeveloperHandler() {

        //An admin fits best in this control class because the Developer and their product attracts the gamers
        //So the addition of a developer requires and Admin to approve them and their games
        Admin mehlhase = new Admin();

        //Every developer will eventually need a way to purchase and withdraw credits
        //So this control class should also have the ability to create payment methods and save them
        CreditCard credit3 = new CreditCard("1234567812345678", new Date(), 666);

        //Somehow the Admin above would approve the devevlopers below...
        Developer tim = new Developer("Dingus", "ding", 5.0, "correcthorsebatterystaple");
        tim.isApproved = true;
        Developer gaby = new Developer("itmedevl0per", "dev", 5.0, "torie");
        gaby.isApproved = true;

        /*
        * We will instantiate games and add them to a developers list since we don't have this function yet.
        * The Developer class will eventually have the ability to do it.
        *
        * A game must be reviewed and approved by an Admin before its is platformed as well.
        */
        Game game1 = new Game(tim, "Sanic the Head Chog", false, 7);
        Game game2 = new Game(gaby, "Pakemen", true, 1);

        Main.games.put(game1.gameID, game1);
        Main.games.put(game2.gameID, game2);
    }

}
