package TypesOfErrors.UserInputs;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivideNum {
    public static void main(String[] args) {
        int Num1, Num2;

        try{
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a Number : ");
            Num1 = input.nextInt();

            System.out.print("Enter a Another Number: ");
            Num2 = input.nextInt();

            System.out.println("Answer is "+ (Num1/Num2));
        }

        catch(ArithmeticException e){
            System.err.println("Cannot divide by zero");
        }
        catch(InputMismatchException e){
            System.err.println("Please Enter Integer Value!");
        }
        finally {
            System.out.println("Byeeee!!!!!");
        }


    }
}
