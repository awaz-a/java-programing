package day14_multi_branch_if_statements;

public class IfWithoutElse {
    public static void main(String[] args) {
        int year = 2020;
        if (year == 2020){
            System.out.println("Covid19 pandemic year");
            System.out.println("wear mask and keep your distance");
        }
        System.out.println("keep coding java");

        String country = "USA";
        if (country.equals("USA")) {
            System.out.println("Washington DC is the capital");
            System.out.println("White house is on Pennsylvania ave");
        }
        System.out.println("welcome to " + country);
    }
}
