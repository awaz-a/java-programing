package day20_string_manipulation;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i")); //true
        System.out.println(company.contains("ital")); //true
        System.out.println(company.contains("l o")); //true
        System.out.println(company.contains("j")); //false
        
        //if company contains space, print " multiple words company name"
        if(company.contains(" ")) {
            System.out.println("multiple words company");
        }else {
            System.out.println("sinlge word company name");
        }

        String etsyTitle = "wooden spoon | Etsy";
        // check if " | " is in etsyTitle
        if(etsyTitle.contains(" | ")){
            System.out.println("Fail - title check failed");
        }
        String firstName = "ahmed";
        //check if firstName "a" and "e" at the same time.
        if(firstName.contains("a") && firstName.contains("e")){
            System.out.println("both a && e are present");
        }
        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a or i is present");
        }

        String email = "murodil@cybertekschoo.com";
        if(email.contains("@") && email.endsWith(".com")) {
            System.out.println("email is correct");
        } else {
            System.out.println("invalid email");
        }
         if(email.toLowerCase().contains("d")) {
             System.out.println("d is present");
         }else {
             System.out.println("d is not present");
         }

}}
