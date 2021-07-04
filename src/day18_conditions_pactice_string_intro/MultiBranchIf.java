package day18_conditions_pactice_string_intro;
import java.util.Scanner;

public class MultiBranchIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num > 0){
            System.out.println(num + " is positive");
        } if (num < 0){
            System.out.println("number is negative");
        } if (num == 0){
            System.out.println("num is zero");
        }

    }
}
