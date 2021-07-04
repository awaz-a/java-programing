package day09_scanner_practice;
import java.util.Scanner;

public class Fahrenheit2CelsuisConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**** FAHRENHEIT CONVERTED TO CELSIUS **** ");

        System.out.println("Enter Fahrenheit: ");
        int F = scan.nextInt();
        int C = (F - 32) * 5/9;
        System.out.println("Celsius is " + C);



    }
}
