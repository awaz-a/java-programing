package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Tennessee";
        int salary = 120_000;
        boolean remote = true;
        boolean benefits = true;
        if (location.equals("Tennessee") && salary >= 120_000 && remote && benefits){
            System.out.println("Accept the job");
        } else {
            System.out.println("keep looking");
        }
    }
}
