package riplit_loops;
import java.util.*;

public class zombie_attack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int Day = 0;
        while (inhabitants>0){
            System.out.println("Day " + Day++ + " ["+ inhabitants+"]");

            inhabitants = inhabitants/2;

        }if (inhabitants==0){
            System.out.println("---- EXTINCT ----");
        }

    }
}
