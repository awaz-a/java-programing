package day35_method_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(5);
        displayValue(10);
        displayValue(15);
        int num1 = 66;
        displayValue(num1);
        greetByName("Awaz");
        String name = "suleman";
        greetByName(name);

    }

    public static void displayValue(int num){
        System.out.println("value is " + num);
    }

    public static void greetByName(String name){
        System.out.println("Hello " + name + ", how are you today?");
    }

}
