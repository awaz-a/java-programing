package Riplit;
import java.util.Scanner;

public class varables005phonenumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int areaCode=scan.nextInt();
        int localNumber=scan.nextInt();

        String phoneNumber;
        //WRITE YOUT CODE HERE:

        phoneNumber = "(" +areaCode + ")" + "-" + localNumber;
        System.out.print("Calling number " + phoneNumber);


    }


}
