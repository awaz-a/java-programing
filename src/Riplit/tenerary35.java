package Riplit;
import java.util.Scanner;

public class tenerary35 {
    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUT CODE HERE:



         int result = (x >= 5) ? x : -x;
        System.out.println(result);

    }}
