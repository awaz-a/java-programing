package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(62557166527L);
        acc.setBalance(1053.90);
        acc.setAccountHolder("Mike Smith");
        acc.setType("360 Checking");

        System.out.println("account = " + acc);





    }


}
