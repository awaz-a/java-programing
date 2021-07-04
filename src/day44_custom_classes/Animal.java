package day44_custom_classes;

public class Animal {
    String type = "some animal";

    public void eat() {
        System.out.println("eating");
    }

    public void eat(String food) {
        System.out.println("animal " + food);
    }
    public void speak(){
        System.out.println("animal is speaking");
    }
}

