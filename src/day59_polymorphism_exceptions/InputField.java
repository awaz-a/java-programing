package day59_polymorphism_exceptions;

public class InputField implements WebElement{
    public static final String TAG_NAME = "input";

    public String getValue(){
        System.out.println("get value of link text input");
        return "selenium";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Typing into input field");
    }

    @Override
    public void click() {
        System.out.println("Clicking input field");
    }

    @Override
    public String getText() {
        System.out.println("getting text od input field");
        return "java";
    }
}
