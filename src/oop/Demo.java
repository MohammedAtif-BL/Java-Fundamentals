package oop;

class Animal {
    void sound(){
        System.out.println("Animal Sound");
    }

    static void info(){
        System.out.println("This is the Animal class");
    }
}

class Dog extends Animal{
    void sound() {
        System.out.println("Woof");
    }

    static void info(){
        System.out.println("This is the Dog class");
    }
}
public class Demo {
    static public void main(String[] args) {
        Animal animalObject = new Dog();
        animalObject.sound();
        main(25);
    }

    public static void main(int numbers){
        System.out.println("This is an overloaded main method with an integer parameter: " + numbers);
    }
}
