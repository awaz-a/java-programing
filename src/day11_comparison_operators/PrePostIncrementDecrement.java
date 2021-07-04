package day11_comparison_operators;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {
        // pre-increment
        int num1 =10;
        ++num1;
        int num2 = num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // post-increment
        int num3 = 8;
        //int num4 = num3;
        // num3++;
        int num4 = num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int apples= 5;
        int basket = ++apples;
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars = 5;
        System.out.println(++cars);

        int sedans = 10;
        System.out.println(sedans++);

        int a = 50;
        int b = 22;
        int c = a++ + ++b;


    }
}
