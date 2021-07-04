package Riplit;
import java.util.*;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int player = scan.nextInt();
        int house = scan.nextInt();

        if (player > 21){
            System.out.println("player win");
        } else if (house > player){
            System.out.println("player loss");
        } else if (player == house){
            System.out.println("its a tie");
        }else if (player > house){
            System.out.println("player win");
        }else{
            System.out.println("player bust");
        }

    }
}
