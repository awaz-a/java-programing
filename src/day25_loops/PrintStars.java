package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for (int star = 1; star <= 15; star++){
            System.out.print("* ");
        }
        System.out.println();
        String myStars = "";
        for (int s = 1; s <= 5; s++ ){
            myStars += "* ";
        }

        System.out.print("myStars = " + myStars);
    }
}
