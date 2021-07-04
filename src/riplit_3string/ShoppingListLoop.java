package riplit_3string;
import java.util.Scanner;

public class ShoppingListLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do {
            System.out.println("Enter Item"+count+" and its price:");
            item = scan.next();
            price = scan.nextDouble();
            totalPrice+= price;

            shoppingListReport += "Item"+count+ " and its price";

            System.out.println("Add one more item?");
            countinue = scan.next();

            if (countinue.equals("yes")) {
                System.out.println("Enter Item"+count+" and its price:");
                item = scan.next();
                price = scan.nextDouble();
                count++;
                System.out.println("Add one more item?");
                countinue = scan.next();
            }
            if (countinue.equals("yes")) {
                System.out.println("Enter Item"+count+" and its price:");
                item = scan.next();
                price = scan.nextDouble();
                count++;
                System.out.println("Add one more item?");
                countinue = scan.next();

            }if (countinue.equals("yes")) {
                System.out.println("Enter Item"+count+" and its price:");
                item = scan.next();
                price = scan.nextDouble();
                count++;
                System.out.println("Add one more item?");
                countinue = scan.next();

            }if (countinue.equals("yes")) {
                System.out.println("Enter Item"+count+" and its price:");
                item = scan.next();
                price = scan.nextDouble();
                count++;
                System.out.println("Add one more item?");
                countinue = scan.next();
            }


        }while (countinue.equals("no")); {
        System.out.println(shoppingListReport);
            System.out.println("Total price: "+ totalPrice);
    }

}}