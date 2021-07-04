package replit_methods;
import java.util.Scanner;

public class simpleCalculator {

    public static void main(String[] args) {
        plus();
    }

    // Do not touch above

    public static void plus(){

        //your code here

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int firstNum = scan.nextInt();
        System.out.println("enter second number:");
        int secNum = scan.nextInt();

        System.out.println("result: " + (firstNum+secNum));




    }

}
