package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "rainy";
        if (weather == "sunny"){
            System.out.println(weather + "go to park, hiking, code java ");
        } else if (weather == "rainy"){
            System.out.println(weather + "stay home, drink tea, and code java");
        } else if (weather == "snowy"){
            System.out.println(weather + "clean the car then build snowman, drink hot chocolate and code java");
        } else if (weather == "windy"){
            System.out.println(weather + "get ready for power loss, fly a kite and code java");
        } else {
            System.out.println(weather + "just keep coding java");
        }
    }
}
