package riplit_oop;
import java.util.Scanner;

public class Calc {
    private int y;
    private int x;
    private int result;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void plus() {
        result = x + y;
    }

    public void minus() {
        result = x - y;
    }


}
