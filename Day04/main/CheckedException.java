import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) throws Exception{
        System.out.println(returnException("data.txt"));
    }

    static String returnException(String FileName) throws Exception{
        // using buffered reader to read file fast
        StringBuilder answer = new StringBuilder();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(FileName))){
            String line;
            // reading file line by line
            while((line = bufferedReader.readLine()) != null){
                answer.append(line);
            }
            return answer.toString();
        }

        // catching fileNotFound exception
        catch(FileNotFoundException e){
            // throws new exception
            throw new FileNotFoundException("File not found.");
        }

    }
}
