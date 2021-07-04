package riplit_3string;
import java.util.Scanner;

public class prefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

String prefix = str.substring(0,n);
String remain = str.substring(n);
        System.out.println(remain.contains(prefix));






    }
}
