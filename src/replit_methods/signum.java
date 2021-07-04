package replit_methods;
import java.util.Scanner;

public class signum {
    public static void sign(int n){
        //your code here

         if (n<0){
            System.out.println("negative");
        }else if (n==0){
            System.out.println("zero");
        }else {
        System.out.println("positive");
         }
    }



    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);

    }
}
