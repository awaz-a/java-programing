package day14_multi_branch_if_statements;

public class CalculatorV1 {
    public static void main(String[] args) {
       int num1 = 2;
       int num2 = 5;
       char operator = '-';
       if (operator == '+'){
           System.out.println(num1 + num2);
       } else if (operator == '-'){
           System.out.println(num1 - num2);
       } else if (operator == '*'){
           System.out.println(num1 * num2);
       } else if (operator == '/'){
           System.out.println(num1 / num2);
       } else{
           System.out.println("invalid operator");
       }


    }
}
