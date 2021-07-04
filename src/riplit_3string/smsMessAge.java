package riplit_3string;
import java.util.*;
public class smsMessAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        sender = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("Sender: " + sender);
        phoneNumber = message.substring(message.indexOf("[")+1, message.indexOf("]"));
        System.out.println("Phone Number: " + phoneNumber);
        messageBody = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("Message Body: " + messageBody);




    }
}
