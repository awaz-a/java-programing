package riplit_5array;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] intArray = {2, 15, 7, 1, 3};
        Arrays.sort(intArray);
        for (int item : intArray) {
            System.out.println("numbers = " + item);

        }
    }
}
