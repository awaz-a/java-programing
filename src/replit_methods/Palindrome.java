package replit_methods;
import riplit_3string.reverse;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String check) {

        // your code here

        check= check.replace(" ", "");
        String reverse = "";
        for (int i = check.length()-1; i >= 0 ; i--) {
            reverse += check.charAt(i);
        }

        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) != reverse.charAt(i)){
                return false;
            }
        }
        return true;

    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPalindrome(in.nextLine()));
    }

}
