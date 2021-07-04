package day26_loops;
import  java.util.*;

public class ScannerMultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));

        }
    }
}
