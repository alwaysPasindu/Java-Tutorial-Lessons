package Inheritance;
////Multilevel Inheritance [Can access NewPhone class obj and OldPhone obj]
public class LatestPhone extends NewPhone {
    void camera(){

    }

    public static void main(String[] args) {
        LatestPhone obj3 = new LatestPhone();
        obj3.camera();
    }
}
