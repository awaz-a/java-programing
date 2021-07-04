package riplit_oop;
import java.util.Scanner;

public class GasTankMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GasTank gt = new GasTank(in.nextDouble());
        gt.addGas(in.nextDouble());
        System.out.println(gt.isFull());
        gt.useGas(in.nextDouble());
        System.out.println(gt.isEmpty());
        gt.fillUp();
        System.out.println(gt.getGasLevel());

    }
}
