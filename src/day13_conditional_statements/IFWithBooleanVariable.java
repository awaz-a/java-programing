package day13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;

        if (isHungry== true){
        System.out.println("i am hungry i will go get something to eat");
    } else {
            System.out.println("i am not hungry, lets keep coding java");
        }

        double price = 130.44;
        boolean isAffordable = price <= 200.0;

        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable){
            System.out.println("i can afford it, lets buy!");
        } else {
            System.out.println("Too expensive, lets keep coding java");
        }

        boolean isRemoteJob = true;
        if (isRemoteJob != true) {
            System.out.println("sorry not interested");
        } else {
            System.out.println("sure i am interested, what is the interview process");
        }
}}
