package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "wooden spoon";
        if (onSale && freeShipping) {
            System.out.println("add " + itemName + " to cart");
        } else {
            System.out.println("continue shopping for good deals ");
        }if (freeShipping && onSale && itemName.equals("wooden spoon")){
            System.out.println("adding to cart - " + itemName);
        } else{
            System.out.println("continue shopping for good deals " + itemName);
        }










    }
}


