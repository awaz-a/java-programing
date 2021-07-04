package Riplit;
import java.util.Scanner;

public class varables3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item1 = "Shoes";
        String item2 = "Shirt";
        String item3 = "Scarf";
        String report = "Total price";
        double price1 = scan.nextDouble();
        double price2 = scan.nextDouble();
        double price3 = scan.nextDouble();
        double totalPrice = price1 + price2 + price3;
        System.out.println("Enter Item1 and its price: " + price1);
        System.out.println("Enter Item2 and its price: " + price2);
        System.out.println("Enter Item1 and its price: " + price3);

        System.out.println("Item1: " + item1 + " " + "Price: " + price1 + ", " + "Item2: " + item2 + " " + "Price: " + price2 + ", " + "Item3: " + item3 + " " + "Price: " + price3);
        System.out.print("Total price: " + totalPrice);

    }
}
