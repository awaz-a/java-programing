package day21_string_manipulation;

public class IndexOf {
    public static void main(String[] args) {
        //             0123
        String word = "java";
        System.out.println(word.indexOf("j")); //0
        System.out.println(word.indexOf("a")); // 1
        System.out.println(word.indexOf("jav"));// 0
        //              012345
        String word1 = "github";
        System.out.println(word.indexOf("h")); //0
        System.out.println(word.indexOf("u"));//4
        System.out.println(word.indexOf("hub"));//3
        System.out.println(word.indexOf(("javo")));//-1

    }
}
