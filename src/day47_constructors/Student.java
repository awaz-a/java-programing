package day47_constructors;

public class Student {
//no_args constructor
    public Student(){
        System.out.println("no-args constructor");
    }

    // constructor with 1 param: String name
    public Student(String name) {
        System.out.println("name param constructor | name = " + name);
    }


    public Student(int age){
        System.out.println(3);
    }


}
