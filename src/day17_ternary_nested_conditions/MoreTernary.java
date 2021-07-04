package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply;
        reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);


        String todaysClass = "java";
        String teacher = (todaysClass.equals("java")) ? "murodil|saim" : "nadir";
        System.out.println("today's teacher = " + teacher);

        boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive ? "yes, have DL, can Drive" : "no DL, cannot drive";
        System.out.println("driving = " + driving);
    }
}
