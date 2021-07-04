package riplit_oop;

public class Carpet {
    public double width, length, unitPrice, totalPrice;
    public boolean isPersian = true;

    public Carpet() {
        width = 300;
        length = 300;
        totalPrice = 200;
        isPersian = false;
        unitPrice = 0;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian){
    totalPrice = (width + length) * unitPrice;
    if (isPersian==true){
        totalPrice+=200;
    }

    }
}
