package day18_conditions_pactice_string_intro;

public class Authentication {
    public static void main(String[] args) {
        int last4SSN = 7668;
        int pinCode =2543;
        int expLastSSN = 7668;
        int expPinCode = 5555;

        if (last4SSN == expLastSSN && pinCode ==expPinCode){
            System.out.println("Authentication successful");
        }else{
            System.out.println("Authentication unsuccessful");
          } if (last4SSN != expLastSSN){
            System.out.println("last 4 SSN does not match");
          }
          if (pinCode != expPinCode){
            System.out.println("Pin code does not match");
        }
    }
}
