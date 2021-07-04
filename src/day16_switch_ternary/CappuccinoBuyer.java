package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "venti";
        double price = 0;
        int calories = 0;

        switch (size){
            case "tall":
                System.out.println("tall capuccino please");
                price = 3.90;
                calories = 90;
                break;
            case "grande":
                System.out.println("grande cappuccino please");
                price = 3.99;
                calories = 120;
                break;
            case "venti":
                System.out.println("venti cappuccino please");
                price = 4.29;
                calories = 150;
                break;
            default:
                System.out.println("we dont serve that drink");
        }
        System.out.println("Total price: $" + price + " calories: " + calories);
    }
}
