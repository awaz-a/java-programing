package riplit_loops;
import java.util.Scanner;

public class countHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int charCount = str.length();
        int counter = 0;
        String word = "hi";

        for (int i = 0; i <= charCount-2; i++) {

           if (str.substring(i,i+2).equals(word)){
                counter++;
            }
        }
        System.out.println(counter);


    }
}
