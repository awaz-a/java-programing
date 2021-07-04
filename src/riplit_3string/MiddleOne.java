package riplit_3string;
import java.util.*;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        int charCount = word.length();
        int midIndx = charCount/2;

        if (charCount==1){
            System.out.println(word+word+word);

        }else if (charCount==2){
            System.out.println(word+word);

        }else if (charCount>=3){
            if (charCount%2==1){
                System.out.println(word.charAt(charCount/2));

            }
        }else {
            System.out.println(word.substring(midIndx-1)+ midIndx+1);
        }

    }
}
