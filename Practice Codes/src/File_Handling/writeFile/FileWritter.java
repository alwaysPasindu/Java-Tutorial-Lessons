package File_Handling.writeFile;


import java.io.FileWriter; ///Import Class

public class FileWritter {
    public static void main(String[] args) {
        String txt = "\nDilshan!";
        try {
            FileWriter obj = new FileWriter("file1.txt", true);
            obj.write(txt);
            obj.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }

    }
}
