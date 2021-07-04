package riplit_loops;

import java.util.*;

public class party {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // your code
        // ------------------------------------------
        String name = "";
        String guestList =" ";
        String newGuest = "";

    do {
        System.out.println("Please enter guest name:");
        name = input.nextLine();
        guestList += name;

        System.out.println("Do you want to enter new guest name:");
        newGuest = input.next();
        if (newGuest.equals("yes")){
            name = input.nextLine();
            guestList += ", ";
        }
    }while (newGuest.equals("yes"));
        System.out.println("Guest's list: " + guestList);

    }
}
