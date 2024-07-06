package File_Handling.CreateFile;

///////////How to create and Delete a File////////////////////////

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        File obj = new File("file.txt");
        try {
//            System.out.println( obj.createNewFile());
//            System.out.println(obj.getName());
//            System.out.println(obj.exists());
//            System.out.println(obj.canWrite());
//            System.out.println(obj.canRead());
//            System.out.println(obj.getAbsoluteFile());
//            System.out.println(obj.length());

            if(obj.delete()){
                System.out.println("File deleted...");
            }
            else{
                System.out.println("No any File...");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
