package day16_switch_ternary;

public class AdaireAppartment {
    public static void main(String[] args) {
        int numberOfBedrooms = 2;
        double startingPrice = 0.0;

        System.out.println("Welcome to Adaire Apartments");
        switch (numberOfBedrooms){
            case 0:
                System.out.println("studio apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("one bedroom selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("two bedroom selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println("5 bedroom currently ot available");
        }
        System.out.println("starting price is $" + startingPrice);
    }
}
