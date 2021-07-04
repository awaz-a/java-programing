package Riplit;
import java.util.*;

public class Andriod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double version = input.nextDouble();

        //WRITE YOUR CODE HERE:
        if (version == 1.5){
            System.out.println("Cupcake");
        } else if (version == 1.6){
            System.out.print("Donut");
        } else if (version == 2.1){
            System.out.println("Eclair");
        } else if (version == 2.2){
            System.out.print("Froyo");
        } else if (version == 2.3){
            System.out.println("Gingerbread");
        } else if (version == 3.1){
            System.out.print("Honeycomb");
        } else if (version == 4.0){
            System.out.println("Ice Cream Sandwich");
        } else if (version == 4.1){
            System.out.print("Jelly Bean");
        } else if (version == 4.4){
            System.out.println("KitKat");
        } else if (version == 5.0){
            System.out.println("Lollipop");
        } else if (version == 8.0){
            System.out.print("Oreo");
        } else if (version == 9.0){
            System.out.println("pie");
        } else {
            System.out.print("Sorry, I don't know this version!");
        }
    }
}

