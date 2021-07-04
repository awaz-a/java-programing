package riplit_3string;
import java.util.Locale;
import java.util.Scanner;

public class email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int underscore = email.indexOf("_");
        int at = email.indexOf("@");
        int com = email.indexOf(".");
        String firstName = email.substring(0,underscore);

        String lastName = email.substring(underscore+1,at) ;
        String domain = email.substring(at+1, com);


        System.out.println("First name: " +firstName.substring(0,1).toUpperCase()+firstName.substring(1));
        System.out.println("Last name: " + lastName.substring(0,1).toUpperCase()+lastName.substring(1));
        System.out.println("Domain: " + domain);


    }
}
