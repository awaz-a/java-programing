package riplit_oop.oop012;

public class CapitalOne extends CreditCard {
    double apr = 14.35;
    boolean cashback = false;

    public CapitalOne(long cardNumber, double balance) {
       super(cardNumber, balance);
    }

    public void useCard(){
    super.useCard();
        System.out.println("Using Capital One card");
    }
    public void payBalance(double balance){
        System.out.println("Paying "+apr+ " from "+ balance);
    }

    @Override
    public String toString() {
        return "Capital One credit card | " + " card number: " + cardNumber + " | balance used: " + balance +
                " | APR: " + apr + " | has cashback: " + cashback;
    }
}
