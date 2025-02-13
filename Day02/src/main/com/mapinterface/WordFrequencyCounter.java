package com.mapinterface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

// definition of WordFrequencyCounter class
public class WordFrequencyCounter {
    // definition of main method
    public static void main(String[] args) {
        String fileName = "MapFile.txt"; // file path
        File file = new File(fileName); // File object with the specified file

        HashMap<String, Integer> wordFrequency = new HashMap<>(); // hash map that contains the frequency of each word in the file

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            // try with resources to close the resources when operation is completed
            String line; // string to store each line in the file

            // iteration to read the file
            while ((line = reader.readLine()) != null) {  // reading the file line by line
                String [] wordArr = line.split(" "); // creating a string array by splitting the line
                for (String word : wordArr) { // iterating through string array
                    if(!wordFrequency.containsKey(word)){ // if word is not present in the map
                        wordFrequency.put(word, 1);
                        continue;
                    }
                    // if word is already in the map
                    wordFrequency.put(word, wordFrequency.get(word)+1);
                }
            }
        } catch (Exception e) { // handling if there is any runtime error
            System.out.println("Runtime exception occurred.");
        }

        // displaying all the words and their frequency in the file
        System.out.println("Words And Frequency In The File:");
        System.out.println(wordFrequency);
    }
}