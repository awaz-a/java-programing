package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(14, 10.5));
        double sum = add(1 ,3);
        System.out.println("sum = " + sum);

        System.out.println(minus(12.8, 10.4));
        System.out.println(multiply(3, 10));
        System.out.println(divide(30, 2));
    }
    public static double add(double num1, double num2){
        double result = num1 + num2;
        return result;
    }
    public static double minus(double num1, double num2){
        double result = num1 - num2;
        return result;
    }

    public static double multiply(double num1, double num2){
        double result = num1 * num2;
        return result;
    }
    public static double divide(double num1, double num2){
        double result = num1 / num2;
        return result;
    }
}
