package day18_conditions_pactice_string_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass = "python";

        if (todayClass.equals("java"))
            System.out.println("java is fun");
       // System.out.println("java is fun again");
        else
            System.out.println("it is not java. it is " + todayClass);


        int score = 1;
         if(score == 1){
             System.out.println("lowest score 1");
         }else if (score ==2);{
        System.out.println("score is 2");
         }  if (score==3){
            System.out.println("score is 3");
        }else {
            System.out.println("invalid score");
        }

        int a = 1;
        if (a == 1)
            System.out.println("a is 1");
            System.out.println("1 is a");




}}








