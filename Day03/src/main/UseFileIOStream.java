import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UseFileIOStream {
    public static void main(String[] args) {

        String message = writeContentOfOneFileToOther();
        System.out.println(message);
    }

    static String writeContentOfOneFileToOther(){

        // using fileInputStream to read the file
        // using fileOutputStream to write the file
        try(FileInputStream fileInputStream = new FileInputStream("Sample File1");
            FileOutputStream fileOutputStream = new FileOutputStream("Sample File2")
        ){
            // reading each character one by one
            int letter;
            while((letter = fileInputStream.read()) != -1){
                fileOutputStream.write((char)letter);
            }
            return "File copied successFully.";
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        return "File is missing";
    }
}
