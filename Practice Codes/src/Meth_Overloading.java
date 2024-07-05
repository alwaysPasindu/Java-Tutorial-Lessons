public class Meth_Overloading {
    public void meth(){
        System.out.println("method 1");
    }
    public void meth(int x){
        System.out.println("Method 2");          //////// change the parameter to access each one////
    }

    public void meth(double y){
        System.out.println("Method 3");
    }
    public static void main(String[] args) {
        Meth_Overloading obj = new Meth_Overloading();
        obj.meth(20.1);

    }
}
