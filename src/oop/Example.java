package oop;

interface A{
    void methodA();
    default void display(){
        System.out.println("Default method in interface A");
    }
}

interface B{
    void methodA();

//    default void display(){
//        System.out.println("Default method in interface A");
//    }
}


public class Example implements A,B{
    @Override
    public void methodA() {
        A.super.display();
        System.out.println("Implementation of methodA from both interfaces A and B");
    }
}
