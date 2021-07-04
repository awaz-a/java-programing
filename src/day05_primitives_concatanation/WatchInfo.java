package day05_primitives_concatanation;

public class WatchInfo {
    public static void main(String[] args){
        String brand = "Chopard";
        String color = "Gold";
        double price = 4600.0;
        boolean waterResistant = true;
        boolean isSmart = false;
        char gender = 'F';

        System.out.println("Brand:\t\t\t\t\t" + brand);
        System.out.println("Color:\t\t\t\t\t" + color);
        System.out.println("Price:\t\t\t\t\t$" + price);
        System.out.println("Water Resistant: \t\t" + waterResistant);
        System.out.println("Smart:\t\t\t\t\t" + isSmart);
        System.out.println("Gender:\t\t\t\t\t" + gender);

        System.out.println("Brand: " + brand + "\nColor: " +
                color +"\nPrice: $" + price +"\nIs it Water Resistant? "
                + waterResistant + "\nIs it smart? " + isSmart + "\nWhat gender? " + gender);
;    }
}
