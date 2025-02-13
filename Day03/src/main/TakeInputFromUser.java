import java.io.*;
import java.util.Objects;

public class TakeInputFromUser {
    public static void main(String[] args) {
        takeUserInput("Sample File2");
    }

    static void takeUserInput(String fileName){
        // using bufferedReader to take input from console
        // using bufferedWriter to write that user input to file
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        ){
            System.out.println("Enter [exit] to stop taking input : ");
            String line;
            // input will be taken until user enter "exit"
            while(!Objects.equals(line = bufferedReader.readLine(), "exit")){
                bufferedWriter.write(line + "\n");
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
