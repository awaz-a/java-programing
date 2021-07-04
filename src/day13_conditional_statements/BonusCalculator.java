package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0.0;
        double salesAmount = 2500.0;

        if (salesAmount <= 1000) {
            System.out.println("good job, you qualified for a bonus");
            bonus = 50.0;
        } else {
            System.out.println("great job you are qualifies for full bonus");
            bonus = 100.0;
        }
        System.out.println("your total bonus: $ " + bonus);


    }
}
