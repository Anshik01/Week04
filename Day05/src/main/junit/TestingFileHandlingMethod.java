package junit;

import java.io.*;
import java.util.Scanner;

public class TestingFileHandlingMethod {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String content = scanner.nextLine();
        writeToFile("Sample file", content);
        System.out.println(readFile("Sample file"));
    }

    public static void writeToFile(String fileName, String content) throws Exception{
        File file = new File(fileName);

        if(!file.exists() || file.isDirectory()){
            throw new IOException("File not found");
        }

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))){
            // writing content in file
            bufferedWriter.write(content);
        }

        catch (IOException e){
            throw new IOException(e.getMessage());
        }

    }

    public static String readFile(String fileName) throws Exception{
        File file = new File(fileName);

        if(!file.exists()){
            throw new IOException("File not found");
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            // returning the content present in file
            return bufferedReader.readLine();
        }
        catch (IOException e){
            throw new IOException(e.getMessage());
        }
    }
}
