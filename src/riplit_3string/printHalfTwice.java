package riplit_3string;
import java.util.Scanner;
public class printHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int halfIndex = word.length()/2;
        String halfWord = word.substring(0, halfIndex);

        System.out.println(halfWord + halfWord);





    }
}
