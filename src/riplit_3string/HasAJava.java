package riplit_3string;
import java.util.Scanner;

public class HasAJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

//        if (word.indexOf("java") > -1){
//            System.out.println(true);
//        }if(word.indexOf("java") > 1){
//            System.out.println(exists);
//        }else if(!word.contains("java")){
//            System.out.println(exists);
//        }

       // System.out.println(word.indexOf("java") == 0 || word.indexOf("java") == 1);
        if (word.indexOf("java")==0 || word.indexOf("java")== 1){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
