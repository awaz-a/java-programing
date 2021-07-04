package riplit_3string;
import java.util.*;

public class middleNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE


        int oddWord = word.length();
        int mid = oddWord/2;

        if (oddWord %2 ==0 || oddWord < 5){
            System.out.println("invalid");
        }else {
            System.out.println(word.substring(mid-1, mid+2));
        }


    }
}
