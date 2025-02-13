import java.io.*;

public class UseBufferInputStream {
    public static void main(String[] args) {
        long startTime, endTime;

        // comparing the time taken by BufferedStream and FileInputStream

        startTime = System.nanoTime();
        writeContentOfOneFileToOther("Sample File1", "Sample File2");
        endTime = System.nanoTime();
        System.out.println("Time taken by BufferedStream : " + (endTime - startTime));

        startTime = System.nanoTime();
        UseFileIOStream.writeContentOfOneFileToOther();
        endTime = System.nanoTime();
        System.out.println("Time taken by FileInputStream : " + (endTime - startTime));
    }

    static void writeContentOfOneFileToOther(String file1, String file2){

        // using BufferedInputStream for reading file;
        // using BufferedOutputStream for writing file;
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file1));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2))
        ){
            // creating array of size 1024 byte
            byte[] buffer = new byte[1024];
            int bytesRead;
            // reading 1024 byte of data at once
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successFully.");
        }

        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
