package Polymorphism_Method__Overriding;

public class Child extends Parent{   // Inherit
    public void Phone(){
        System.out.println("Apple");   //Override with parent class
    }
    public static void main(String[] args) {
        Child obj = new Child();
        obj.Phone();

    }
}
