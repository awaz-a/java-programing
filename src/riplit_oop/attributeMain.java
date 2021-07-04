package riplit_oop;
import java.util.Scanner;

public class attributeMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Atts a = new Atts();
        a.name = in.next();
        a.color = in.next();
        a.amount = in.nextInt();

        a.asString();
    }
}