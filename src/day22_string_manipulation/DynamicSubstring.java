package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        //               012345678910111213141516
        String result = "result count:12345";
        System.out.println(result.substring(13, 18));
        System.out.println(result.substring(13));

        //find the index of :
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));
        //now we can combine them into one statement
        System.out.println(result.substring(result.indexOf(":") +1 ));

        String today = "i learned [java] today";
        System.out.println(today.indexOf("["));
        System.out.println(today.indexOf("]"));
        int start =today.indexOf("[");
        int end = today.indexOf("]");
        System.out.println(today.substring(start+1, end));
        System.out.println(today.substring(today.indexOf("[")+1, today.indexOf("]")));
    }
}
