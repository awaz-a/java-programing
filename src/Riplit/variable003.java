package Riplit;
import java.util.Scanner;

public class variable003 {
    public static void main(String[] args) {
        int hour;
        int minute;
        int second;
        String amOrPm;

        Scanner sc = new Scanner(System.in);
        hour   = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        amOrPm = sc.next();
        //#############################

        //2. WRITE YOUR CODE HERE:

        System.out.print(hour + ":" + minute + ":" + second + " " + amOrPm );

    }
}
