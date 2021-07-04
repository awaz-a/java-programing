package practice;


import java.util.Scanner;

public class EvenOrOdd {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Number");
            int num = scan.nextInt();
            if (num%2 == 0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
        }


}
