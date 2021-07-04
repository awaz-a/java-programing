package riplit_3string;
import java.util.Scanner;

public class firstandlastLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
      //  String firstLtter =

        System.out.print(word.charAt(0));
        System.out.println(word.charAt(word.length()-1));
    }
}
