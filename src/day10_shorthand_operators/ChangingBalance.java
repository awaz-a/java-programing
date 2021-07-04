package day10_shorthand_operators;

public class ChangingBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("baklava = " + baklava);

        double kenefe = 44.45;
        System.out.println("kenefe = " + kenefe);
        balance = balance - kenefe;
        System.out.println("balance after kenefe = " + balance);

        kenefe = kenefe / 2;
        System.out.println("kenefe = " + kenefe);
        balance = balance - kenefe;
        System.out.println("balance after kenafe = " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance after plov = " + balance);

        double icedTea = 3.0;
        System.out.println("icedTea = " + icedTea);
        balance = balance - icedTea * 4;
        System.out.println("balance after icedTea = " + balance);

        System.out.println("returning baklava = " + baklava);
        balance= balance + baklava;
        System.out.println("balance after returning baklava = " + balance);


    }
}
