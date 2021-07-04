package day12_conditional_statements;

public class IfElseStatements {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println("Condition is true");
        } else {
            System.out.println("condition is false");
        }

        int count = 25;
        if (count > 30){
            System.out.println("condition is true");
        } else {
            System.out.println("condition is false");
        }

        byte age = 25;
        if (age >= 18) {
            System.out.println("eligible to vote");
            System.out.println("age is greater or equal to 18");
        } else {
            System.out.println("not eligible to vote");
            System.out.println("age is less than 18");
        }

    }

}
