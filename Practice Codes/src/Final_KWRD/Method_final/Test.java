package Final_KWRD.Method_final;


 class Parent {
    public void say(){
        System.out.println("Hiii!!!!");
    }
}

class Child extends Parent{
    public  void say(){
        System.out.println("Hello!!");
    }
}

public class Test {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.say();
    }
}


/////final  kwrd is use to unchange anything