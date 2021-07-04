package day29_nested_loop_arrays;

public class StarsNested {
    public static void main(String[] args) {
        for(int inner =1; inner<=5; inner++){
            for(int j =1;j <=10; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int outer = 1; outer <= outer; outer++) {
            for (int inner = 1; inner <= inner; inner++) {
                System.out.print("* ");
            }
        }
        System.out.println();


}}
