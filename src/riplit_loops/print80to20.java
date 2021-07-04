package riplit_loops;

public class print80to20 {
    public static void main(String[] args) {

        for (int n = 80; n >= 20; n--) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
    }
}
