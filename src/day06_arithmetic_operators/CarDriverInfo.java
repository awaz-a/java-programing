package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "Lexus";
        String driverName = "Awaz Anwar";
        int licenseNum = 1234543;
        short speed = 80;
        boolean isAutomatic = true;
        char licenseClass = 'D';

        System.out.println("Car Model: \t\t\t" + carModel);
        System.out.println("driver Name: \t\t" + driverName);
        System.out.println("License Number:\t\t" + licenseNum);
        System.out.println("Speed:\t\t\t\t" + speed + "mph");
        System.out.println("Is it Automatic?:\t" + isAutomatic);
        System.out.println("License Class: \t\t" + licenseClass);
        System.out.println("\n");

        System.out.println(driverName + " is driving " + carModel );
        System.out.println(licenseNum + " is the license number.");
        System.out.println("Current speed : " + speed + "mph");
        System.out.println("Is it Automatic -> " + isAutomatic);
        System.out.println(licenseClass +" - "+ isAutomatic);

    }
}
