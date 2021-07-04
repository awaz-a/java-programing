package riplit_oop.oop012;

public class Discover extends CreditCard{
    double apr = 11.99;
    boolean cashback = true;

    public Discover(long cardNumber, double balance) {
       super(cardNumber, balance);
    }


    public void useCard(){
        System.out.println("Using Discover card");
    }
    public double payBalance(double balance){
        System.out.println("Paying "+apr+ " from "+ balance);
        return balance;
    }
    @Override
    public String toString() {
        return "Discover credit card | " + " card number: " + cardNumber + " | balance used: " + balance +
                " | APR: " + apr + " | has cashback: " + cashback;
    }



}
