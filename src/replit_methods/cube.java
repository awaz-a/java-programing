package replit_methods;
import java.util.Scanner;
public class cube {
    //your code here
    public static void cube(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=n;
        i=n*(n*n);
        System.out.println(i);




    }

    //end cube

    public static void main(String[] args) {

        cube();

    }
}
