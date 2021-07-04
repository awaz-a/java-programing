package day23_string_manipukatin_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den sp oon";
        System.out.println(word.toUpperCase().toLowerCase().length());

        //remove spaces first then print everything uppercase
        System.out.println(word.replace(" ", "").toUpperCase());

       // selenium.findElement(By.id("hi")).click();

        String city = "kAbuL";

        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1));

        String capitalized = city.substring(0,1).toLowerCase() + city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);


    }
}
