package day12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'a';
        char letter2 = 'A';
        System.out.println(letter1 == letter2);
        System.out.println(letter1 > letter2);
        System.out.println(letter1 < letter2);

        char grade = 'A';
        boolean pass = grade <= 'D';
        System.out.println("dd you pass the exam? - " + pass);
    }
}
