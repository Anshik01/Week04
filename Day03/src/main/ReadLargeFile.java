import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadLargeFile {
    public static void main(String[] args) {
        String filePath = "LargeFile.txt"; // file path
        File file = new File(filePath); // file object

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line; // string variable to store the line
            while ((line = reader.readLine()) != null){ // reading the file
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.equals("error")) {
                        // printing the line if it contains the word "error"
                        System.out.println(line);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Runtime Exception occurred!!!");
        }
    }
}
