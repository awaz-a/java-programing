package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double itemPrice = 30;
        boolean isPrimeMember = true;

        if (isPrimeMember == true){
            System.out.println("eligible for free 2 day shipping");
        } else {
            if (itemPrice >= 25){
                System.out.println("eligible for free regular shipping");
            } else {
                System.out.println("not eligible for free shipping. fee $10");
            }
        }
    }
}
