package File_Handling.readFile;
import java.io.File;
import java.util.Scanner;
public class ReadFile1 {
    public static void main(String[] args) {
        File file = new File("file1.txt");
            try{
                Scanner readObj = new Scanner(file);
                while(readObj.hasNextLine()){
                    System.out.println(readObj.nextLine());
                }
                readObj.close();
            }catch(Exception e){;
                System.out.println(e);
            }
    }
}
