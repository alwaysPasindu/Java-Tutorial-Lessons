public class ThisKWRD {
    String name;
    int age;
    ThisKWRD(String name, int age ){
        this.name =name;
        this.age = age;
    }

    public static void main(String[] args) {
        ThisKWRD obj = new ThisKWRD("Pasindu", 22);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
