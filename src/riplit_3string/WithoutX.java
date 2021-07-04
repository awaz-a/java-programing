package riplit_3string;
import java.util.Scanner;
public class WithoutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.startsWith("x") || word.endsWith("x")){
            System.out.println(word.replace("x", ""));
            }if(word.startsWith("X") || word.endsWith("X")){
            System.out.println(word.replace("X", ""));
        }else {
            System.out.println(word);
        }








        if (word.substring(0,1).equalsIgnoreCase("X")){
            word = word.substring(1);
        }
        if (word.substring(word.length()-1).equalsIgnoreCase("x")){
            word= word.substring(0, word.length()-1);
        }

        System.out.println(word);

    }
}
