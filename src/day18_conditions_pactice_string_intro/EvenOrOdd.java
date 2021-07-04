package day18_conditions_pactice_string_intro;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
       int num = scan.nextInt();
       if (num %2 ==0){
           System.out.println("num is even");
       } else{
           System.out.println("num is odd");
       }
    }
}
