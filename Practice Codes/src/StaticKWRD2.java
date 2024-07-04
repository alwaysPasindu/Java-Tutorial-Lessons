public class StaticKWRD2 {
    static String name;

    static void call(){
        System.out.println("Take a call from "+ name);
    }
    public static void main(String[] args) {
        name = "iPhone";
        call();


    }
}
