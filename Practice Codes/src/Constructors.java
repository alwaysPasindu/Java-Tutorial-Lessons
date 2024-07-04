class Constructors {
    Constructors(){
        System.out.println("Im the constructor!!!");
                                                            //////No need to create a constructor that automatically create a constructor in a class///////
    }

    void meth(){
        System.out.println("hello");

    }

    public static void main(String[] args) {
        Constructors obj = new Constructors();
        obj.meth();
        Constructors obj1 = new Constructors();     ///automatically calls to the constructor when creating a object///


    }
}
