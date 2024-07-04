public class StaticKwrd {
    int x;
    static int y;
    void meth1(){

    }
    static void meth2(){

    }
    public static void main(String[] args) {
//         x = 4;   //////// Error
         y = 5;
//         meth1();   /////// Error
         meth2();

         StaticKwrd obj = new StaticKwrd();
         obj.x = 4;
    }
}
