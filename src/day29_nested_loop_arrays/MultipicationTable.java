package day29_nested_loop_arrays;

public class MultipicationTable {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                System.out.print(outer  + inner + "\t");
            }
            System.out.println();

        }
    }
}