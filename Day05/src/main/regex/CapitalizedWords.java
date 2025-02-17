package org.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWords {
    public static void main(String[] args) {
        // defining a regex pattern to extract Capitalized Words from texts
        String regex = "^[A-Z][A-Za-z0-9._%+-]*$";

        // compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // defining texts from which we have to extract Capitalized Words
        String[] texts = new String[5];
        texts[0] = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York";
        texts[1] = "The Quick brown fox jumps Over the lazy Dog.";
        texts[2] = "Yesterday was a Beautiful day, but today it's raining heavily.";
        texts[3] = "Alice went to the Market to buy fresh Apples and oranges.";
        texts[4] = "Learning Java and Python can be Fun and challenging at the same Time.";

        // iterating through the texts array to extract Capitalized Words
        for (String text : texts) {
            String [] words = text.split(" "); // splitting each text
            for (int i = 0; i < words.length; i++) {
                Matcher matcher = pattern.matcher(words[i]);
                if (matcher.matches()) {
                    System.out.print(words[i] + ((i == words.length - 1) ? "" : ", ")); // printing the Capitalized Words
                }
            }
            System.out.println();
        }
    }
}
