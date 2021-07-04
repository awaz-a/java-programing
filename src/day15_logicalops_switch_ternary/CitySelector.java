package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city1 = "Moscow";
        String city2 = "Tampa";

        if (city1.equals("Moscow") || city2.equals("Tampa")){
            System.out.println("want to move");
        }else {
            System.out.println("ill stay");
        }
        String teacher = "saim";
        if (teacher.equals("saim") || teacher.equals("murodil")){
            System.out.println("it os a java class with " + teacher);
        }else {
            System.out.println("soft skill class with " + teacher);
        }
        teacher = "murodil";

        if (teacher.equals("siam") || teacher.equals("murodil")){
            System.out.println("java class with " + teacher);
        } else if (teacher.equals("nadir")){
            System.out.println("soft skill class with " + teacher);
        } else {
            System.out.println("some class with " + teacher);
        }
        String company = "Amazon";
        int salary = 100000;
        if (company.equals("Amazon") || salary >= 100000){
            System.out.println("accept offer from " + company);
        }else {
            System.out.println("decline offer from " + company);
        }



    }


}
