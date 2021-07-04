package Riplit;
import java.util.*;

public class RealEstateCalculator {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");

        System.out.println("Enter your property type:");
        houseType=scan.nextLine();
        if (houseType.equals("Condo")){
            propertyPrice += 50000;
        }else if (houseType.equals("Townhouse")){
            propertyPrice += 75000;
        }else if (houseType.equals("Single Family Home")){
            propertyPrice += 95000;
        }
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms=scan.nextInt();
        if (numberOfBedrooms == 1){
            propertyPrice+= 30000;
        }else if (numberOfBedrooms ==2){
            propertyPrice+= 2* 30000;
        }else if (numberOfBedrooms ==3){
            propertyPrice+=3*30000;
        }else if (numberOfBedrooms ==4){
                propertyPrice+= 4*30000;
        }

        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();
        if (true ){
            propertyPrice+=5000;
        }else if (houseType=="Condo"){
            System.out.println("Backyard is not available for condo!");
        }

        System.out.println("Do you have garage?");
        garage=scan.nextBoolean();
        if (true){
            propertyPrice+=20000;
        }
        System.out.println("How many spots?");
        switch (garageSpots=scan.nextInt()){
            case 1:
                propertyPrice+=20000;
                break;
            case 2:
                propertyPrice+= 20000 *2;
                break;
            case 3:
                propertyPrice+= 20000 *3;
                break;
            case 4:
                propertyPrice+= 20000 *4;
                break;
            case 5:
                propertyPrice+= 20000 *5;
                break;
            case 6:
                propertyPrice+= 20000 *6;
                break;
                case 7:
                propertyPrice+= 20000 *7;
                break;
            case 8:
                propertyPrice+= 20000 *8;
                break;
            case 9:
                propertyPrice+= 20000 *9;
                break;
        }
        if (garageSpots>10){
            System.out.println("Pardon, it's not public parking!");
        }

        System.out.println("How close is metro station?");
        metroAccessibility=scan.nextFloat();
        if (metroAccessibility<1) {
            propertyPrice+= 10000;
        } else if (metroAccessibility >= 1 && metroAccessibility >= 3) {
            propertyPrice+=5000;
        }

        System.out.println("How close is highway?");
        highwayAccessibility=scan.nextFloat();
        if (highwayAccessibility<1){
            propertyPrice+=15000;
        }else if (highwayAccessibility >= 1 && highwayAccessibility <5){
            propertyPrice+=8000;
        }else if (highwayAccessibility >= 5 && highwayAccessibility <= 20){
            propertyPrice+=4000;
        }

        System.out.println("What's the rating of nearest school?");
        schoolScore=scan.nextFloat();
        if (schoolScore >= 8 && schoolScore >= 10){
            propertyPrice+=45000;
        }else if (schoolScore <8 && schoolScore>= 4){
            propertyPrice+=20000;
        }else {
            propertyPrice+=5000;
        }

        System.out.println("Does any of your family members smoke?");
        smoking = scan.nextBoolean();
        if (true){
            propertyPrice-=5000;
        }

        System.out.println("Market report has been generated. Your estimate market price is: " + propertyPrice + "$");


}}

