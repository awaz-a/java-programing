package riplit_loops;
import java.util.Scanner;

public class countJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int charCount = word.length();
        int count = 0;


        for (int i = 0; i <= charCount-4; i++) {
            if (word.substring(i,i+4).equals("java")){
                count++;
            }
        }
        System.out.println(count);

    }
}
