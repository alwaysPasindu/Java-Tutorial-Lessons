public class Constructor_Overloading {
    int rupees;
    Constructor_Overloading(){
                rupees= 0;
    }
    Constructor_Overloading(int x){
                rupees = x;
    }


    public static void main(String[] args) {
                Constructor_Overloading Pasindu = new Constructor_Overloading();
                Constructor_Overloading Dilshan = new Constructor_Overloading(20);
                System.out.println(Pasindu.rupees);
                System.out.println(Dilshan.rupees);

    }
}
