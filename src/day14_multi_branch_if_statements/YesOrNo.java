package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("are you sure you want to delete this file?");
        char selection = 'y';
        boolean answer;
        String result;
        if (selection == 'y') {
            System.out.println("Your file wil be deleted");
            answer = true;
            result = "deleted";
        } else {
            System.out.println("file deletion will be cancelled");
            answer = false;
            result = "not deleted";

        }
        System.out.println("Did file get deleted? - " + answer);
    }
}
