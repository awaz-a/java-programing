package day18_conditions_pactice_string_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "E";
       double leasePrice = 0.0;

      //  if (make.equals("Mercedes") && model.equals("E")){
      //      leasePrice = 500.0;
       // } else if (make.equals("Mercedes") && model.equals("A")){
        //  leasePrice = 400.0;


        if (make.equals("Mercedes")){
            if (model.equals("E")){
                leasePrice = 500.0;
            }else if (make.equals("A")){
                leasePrice = 400.0;
            } else {
            System.out.println("invalid make");

            if (make.equals("Audi")) {
              if  (model.equals("SQ5")){
                 leasePrice = 552.0;
            }

            } else if (make.equals("Audi") && model.equals("A3")){
                leasePrice = 412.0;
            }


        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);
    }
}}}
