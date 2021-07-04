package riplit_3string;
import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();


        if (!email.contains("_")){
            System.out.println(email);
        } else {
            int underscore = email.indexOf("_");
            int at= email.indexOf("@");
            String firstName = email.substring(0, underscore);
            String lastName = email.substring(0, at);

             System.out.println(lastName + "_" + firstName + "@gmail.com");
        }

    }
}
