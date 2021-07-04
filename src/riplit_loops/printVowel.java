package riplit_loops;
import java.util.Scanner;

public class printVowel {
    public static void main(String[] args) {

            Scanner inp = new Scanner(System.in);
            String word = inp.nextLine();
            //write your code below
        //'a','e','i','o','u'

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            if (current=='a' ||
                    current=='e' || current=='i'||
                    current=='o'|| current=='u'){
                System.out.println(current);
            }

        }


    }
}
