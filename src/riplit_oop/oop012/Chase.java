package riplit_oop.oop012;

public class Chase extends CreditCard {
    double apr = 10.99;
    boolean cashback = true;

    public Chase(long cardNumber, double balance) {
       super(cardNumber, balance);


    }

    public void useCard(){
       this.useCard();
        System.out.println("Using Chase card");
    }
    public void payBalance(double balance){
        System.out.println("Paying "+apr+ " from "+ balance);
    }
    @Override
    public String toString() {
        return "Chase credit card | " + " card number: " + cardNumber + " | balance used: " + balance +
                " | APR: " + apr + " | has cashback: " + cashback;
    }

}
