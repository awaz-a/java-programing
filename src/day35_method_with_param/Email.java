package day35_method_with_param;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {
        buildEmail("murodil", "cybertekschool");
        buildEmail("john ward III", "verizon");

    }
    public static void buildEmail(String name, String domain){
        name = name.replace(" ", "_").toLowerCase();
        domain = domain.toLowerCase();
        String email = name + "@" + domain + ".com";
        System.out.println(email);
    }
}
