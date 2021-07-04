package riplit_oop;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.Scanner;

public class calcMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int one = in.nextInt();
        int two = in.nextInt();
        Calc a = new Calc();
        a.setX(one);
        a.setY(two);
        a.plus();
        System.out.println(a.getResult());
        a.minus();
        System.out.println(a.getResult());
    }


}
