package OfficeHours.Practice_03_08_2021;
import java.util.Scanner;

public class practice_03_09_2021 {
    public static void main(String[] args) {
        int inputSeconds, hours, minutes, seconds;

        Scanner scan = new Scanner(System.in);
        System.out.println("enter seconds: ");
        inputSeconds = scan.nextInt();

        /*
        how many seconds in an hour?
        60 sec = 1 min
        60 min = 1 hr
        60 * 60 = 3600
         */

        hours = inputSeconds / 3600;
        // inputSeconds = inputSeconds % 3600;
        inputSeconds %= 3600;
        minutes = inputSeconds / 60;
        inputSeconds %= 60;
        seconds =3600 + inputSeconds;

        System.out.println(hours + "hours," + minutes + "minutes, " + seconds + "seconds") ;
    }

}
