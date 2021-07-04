package day35_method_with_param;

public class Counters {
    public static void main(String[] args) {
        count(4);
        count(7);
        count(2);
        int num5 = 999;
        count(num5);
        String word = "wooden spoon";
        count(word.length());
        printAge(1996);
        int year = 1984;
        printAge(year);

    }

    public static void count(int num){
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printAge(int year){
        int age = 2021 - year;
        System.out.println("Birth Year: " + year + ". Age: " + age);

    }
}
