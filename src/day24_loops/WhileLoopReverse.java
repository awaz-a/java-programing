package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;
        while (count >= 0){
            System.out.println("count = " + count);
            count--;
        }
        System.out.println("Finished the count");



        /**
         * Read each mesg 1 by 1 until u have 0 unread sms
         */
        int unreadSMS = 10;
        System.out.println("i have total " + unreadSMS + " unread sms");

        while (unreadSMS > 0){
            System.out.println("Reading sms : " + unreadSMS);
            --unreadSMS;
        }
        System.out.println("no more unread sms message");
    }

}
