package day24_loops;
import  java.util.*;

public class GiveMe5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 dollars");
        int dollars = scan.nextInt();

        while (dollars!=5){
            System.out.println("Give me 5 dollars");
            dollars = scan.nextInt();
        }
        System.out.println("thank you for 5 dollars");
    }

}
