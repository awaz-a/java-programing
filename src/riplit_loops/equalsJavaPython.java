package riplit_loops;
import java.util.Scanner;
public class equalsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();


        int num = sentence.length();
        int java=0;
       int python=0;

        for (int i = 0; i <= num-4; i++) {
        if (sentence.substring(i, i + 4).equals("java")){
            java++;
        }
        }

        for (int i = 0; i < num-6; i++) {
            if (sentence.substring(i,i +6).equals("python")){
                python++;
            }
        }

        System.out.println(java==python);
    }
}
