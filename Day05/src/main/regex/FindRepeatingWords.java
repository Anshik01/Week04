package org.regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {
    public static void main(String[] args) {
        // defining a regex pattern to validate Credit Card Number
        String regex = "\\b(\\w+)\\s+?\\1\\b";

        // compiling the regex pattern
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        // defining texts from which we have to extract programming language names
        String[] texts = new String[5];
        texts[0] = "This is is a repeated repeated word test." ;
        texts[1] = "I love love programming programming in Java Java." ;
        texts[2] = "The the quick quick brown brown fox fox jumps jumps." ;
        texts[3] = "Learning learning regex regex is is fun fun!" ;
        texts[4] = "This is is a simple simple test test case." ;

        // iterating through the texts array to extract programming language names
        for (String text : texts) {
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.print(matcher.group(1) + ", "); // print the repeated word
            }
            System.out.println();
        }
    }
}
