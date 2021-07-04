package riplit_3string;

import java.util.Scanner;

public class print3nums {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");
        int num = inp.nextInt();

        next3(num);
    }
    public static void next3(int num){
        System.out.println("next 3 are:");
        System.out.println((num+1) + " "+(num+2)+" "+(num+3)) ;
    }
}