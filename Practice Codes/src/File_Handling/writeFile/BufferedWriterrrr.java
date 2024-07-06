package File_Handling.writeFile;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterrrr {
    public static void main(String[] args) {
       try{
            BufferedWriter obj = new BufferedWriter(new FileWriter("BufferedWriter.txt"));
            obj.write("Hello Bro");
            obj.close();
       }catch(Exception e) {
           System.out.println(e);
        }
    }
}
