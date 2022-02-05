/*
* This class will for now instantiate reviews since there are no real world actors that can register, purchase games,
* and leave a review at this stage of development.
*
* When a gamer attempts to add a review, this class should verify the game has been purchased or if the gamer
* has already written a review for this video game.
*
*
* */

public class ReviewHandler {

    public ReviewHandler() {

        // Adding some reviews manually to game and gamer

        // Test data for a hypothetical gamer review
        Review  review = new Review(Main.games.get(1), Main.gamers.get("xXx1337g4m3rxXx"),1,"Just kidding, I hated it too");

        // If approved, the review will be stored and associated with the proper game...
        Main.games.get(1).reviews.add(review);

        // ... and a record of it will also be added to the gamer's published reviews list
        Main.gamers.get("xXx1337g4m3rxXx").reviews.add(review);

    }

    public static void addReview(String username, Integer gameID, int rating, String text) {
        Gamer gamer = Main.gamers.get(username);
        Game game = Main.games.get(gameID);

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
