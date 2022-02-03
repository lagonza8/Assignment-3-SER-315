import java.util.Date;

public class CreditCard {
    public String cardNumber;
    public Date exprDate;
    public int cvv;

    // could include the gamer the card is associated with, decided to not include this here though
    
    public CreditCard (String cardNumber, Date exprDate, int cvv) {
        this.cardNumber = cardNumber;
        this.exprDate = exprDate;
        this.cvv = cvv;
    }

}
