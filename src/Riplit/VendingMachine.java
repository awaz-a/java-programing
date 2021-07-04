package Riplit;
import java.util.*;
public class VendingMachine {
    public static void main(String[] args) {
        //ENTER CODE HERE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = scan.nextInt();

        if ((cents > 0) && (cents < 100)){
        int quarters = cents / 25;
        int remain = cents % 25;
        int dimes = remain / 10;
        remain = remain % 10;
        int nickels = remain/5;
        int pennies =remain%5;


            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + " and " + pennies + " pennies");
        } else {
            System.out.print("Invalid cents amount");
        }

        Scanner scan1 = new Scanner(System.in);

        int quarters, dimes, nickels, pennies;
        System.out.println("Enter cents:");
        int cents1 = scan.nextInt();
        quarters = cents / 25;
        dimes = ((cents % 25)/10);
        nickels = (((cents % 25)%10)/5);
        pennies = ((((cents % 25)%10)%5)/1);

        if ((cents > 0) && (cents < 100)){
            System.out.print("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + " and " + pennies + " pennies");
        } else {
            System.out.print("Invalid cents amount");
        }

    }

}

