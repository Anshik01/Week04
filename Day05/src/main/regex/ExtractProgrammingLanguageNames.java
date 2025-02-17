package org.regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguageNames {
    public static void main(String[] args) {
        // defining a regex pattern to extract programming language names
        String regex = "(Java|Java\\.|Python|Python\\.|JavaScript|JavaScript\\.|Go||Go\\.|C\\+\\+|C\\+\\+\\.|Rust|Rust\\.|Swift|Swift\\.|Kotlin|Kotlin\\.)";

        // compiling the regex pattern
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        // defining texts from which we have to extract programming language names
        String[] texts = new String[5];
        texts[0] = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        texts[1] = "Python and JavaScript are widely used for web development.";
        texts[2] = "I started learning Java, but now I'm also exploring C++.";
        texts[3] = "Rust is gaining popularity for its memory safety features.";
        texts[4] = "Swift and Kotlin are great choices for mobile app development.";

        // iterating through the texts array to extract programming language names
        for (String text : texts) {
            String [] words = text.split(" "); // splitting each text
            for (int i = 0; i < words.length; i++) {
                Matcher matcher = pattern.matcher(words[i]);
                if (matcher.matches()) {
                    System.out.print(words[i] + ((i == words.length - 1) ? "" : ", ")); // printing the programming language names
                }
            }
            System.out.println();
        }
    }
}
