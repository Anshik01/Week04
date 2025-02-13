
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class CountWordsInFile {
    public static void main(String[] args) {
        String filePath = "CountWords.txt"; // file path
        File file = new File(filePath); // file object
        HashMap <String, Integer> frequency = new HashMap<>(); // map to store frequencies

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null){ // reading the file
                String[] words = line.split(" ");
                for (String word : words) {
                    frequency.putIfAbsent(word, 0);
                    frequency.put(word, frequency.get(word)+1);
                }
            }
        } catch (Exception e) {
            System.out.println("Runtime Exception occurred!!!");
        }

        // sorting the HashMap and storing the sorted frequency map in LinkedHashMap
        LinkedHashMap<String, Integer> sortedFreq = frequency.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).collect(LinkedHashMap::new, (m, e) -> m.put(e.getKey(), e.getValue()), Map::putAll);

        // printing top 5 most frequent words
        System.out.println("Top 5 frequent words in file:");
        int top = 1;
        for (Map.Entry<String, Integer> i : sortedFreq.entrySet()) {
            if(top <= 5) {
                System.out.println(i.getKey() + " : " + i.getValue());
                top++;
                continue;
            }
            break;
        }
    }
}