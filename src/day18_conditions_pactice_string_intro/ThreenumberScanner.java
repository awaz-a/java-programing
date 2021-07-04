package day18_conditions_pactice_string_intro;

import java.util.Scanner;

public class ThreenumberScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();
        System.out.println("enter num3");
        int num3 = scan.nextInt();
        System.out.println("print largest value");

        if (num1 > num2 && num1 > num3 ){
            System.out.println(num1 + " is largest");
        } else if (num2 > num1 && num2 > num3){
            System.out.println(num2 + " is largest");
        } else if (num3 > num1 && num3 > num2){
            System.out.println(num3 + " is largest");
        }
    }





}
