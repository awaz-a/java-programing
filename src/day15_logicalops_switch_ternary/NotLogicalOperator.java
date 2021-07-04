package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
        if (!(age > 7)){
            System.out.println("need to sit in the car seat. age - " + age);
        } else{
        System.out.println("can sit in normal seat. age = " + age);
    }


        boolean isSmokingAllowed = false;

        if(!isSmokingAllowed){
            System.out.println("smoking is not allowed. exit");
        }


        boolean isAffordable = true;

        if (!isAffordable){
            System.out.println("it is not affordable");
        }

        String env = "qa";
        if (!env.equals("qa")){
            System.out.println("in wrong environment for QA testing");
        }

        String carModel = "tesla";
        if (!carModel.equals("tesla")){
            System.out.println("if not tesla im not interested");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals("abc123")){
            System.out.println("incorrect password");
        }
        if (!inputPassword.equals(secretPassword)){
            System.out.println("incorrect password");
        }
        if (inputPassword.equals("abc123")){
            System.out.println("correct password");
        }else {
            System.out.println("incorrect password");
            }
}}
