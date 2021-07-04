package day43_list_custom_classes;


public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "AK";
        emp1.jobTitle = "SDET";
        emp1.work();

        Employee emp2 = new Employee();
        emp2.name = "Rahib";
        emp2.jobTitle = "Full Stack developer";
        emp2.work();

        emp1 = emp2;
        emp1.work();



    }
}
