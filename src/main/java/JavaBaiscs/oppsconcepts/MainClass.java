package JavaBaiscs.oppsconcepts;

public class MainClass {
    public static void main(String[] args) {
        Person p1  = new Person();
        p1.name = "vijay";
        p1.age = 35;
        System.out.println(p1.name + " " + p1.age);
        p1.walk();
        p1.eat();
    }
}
class Person{
    //propertie
    String name;
    int age;
    //constructor : there is once default constructor
    public Person(){
        System.out.println("creating an object");
    }

    //behaviour
    void walk(){
        System.out.println(name + " is walking");
    }

    void eat(){
        System.out.println(name + " is eating");
    }
}
