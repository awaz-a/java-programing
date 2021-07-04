package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) { int budget = 5000;
       String model = "Tesla";
       double carPrice = 8999.0;
       if (carPrice <= budget && model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla")){
           System.out.println("ready to purchase model = " + model + ", price " + carPrice);
       }else {
           System.out.println("not interested in model = " + model + ", price " + carPrice );
       }

    }
}
