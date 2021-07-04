package day22_string_manipulation;

public class ReverseUsingChar {
    public static void main(String[] args) {
        String word = "noon";
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(0));
        System.out.println(word);
        // print using single statement and concat +
        System.out.println(""+word.charAt(3) + word.charAt(2) + word.charAt(1)
        + word.charAt(0));

        String reversed = ""+word.charAt(3) + word.charAt(2) + word.charAt(1)
                + word.charAt(0);
        System.out.println("word = " + word);
        System.out.println("word2 = " + reversed);

        if (word.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome word");
        } else {
            System.out.println("not palindrome word");
        }
    }
}
