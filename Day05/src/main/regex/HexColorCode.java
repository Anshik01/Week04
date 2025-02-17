package org.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorCode {
    public static void main(String[] args) {
        // defining a regex pattern to validate the Hex color code
        String regex = "^#[a-fA-F0-9]{6}$";

        // compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // created a string array to store hex color code, that will be validated
        String [] hexColorCode = {"#123456", "#CD3456", "#ab1234", "#C12345", "#ABC123", "#12ABCD", "#ABCDEF", "#Ab1111", "#aB1234", "#12", "#", "#A", "#a"};

        // iterating through the hexColorCode array to validate each string
        for (String license : hexColorCode) {
            Matcher matcher = pattern.matcher(license);
            if (matcher.matches()) {
                System.out.println("Valid Hex Color Code.");
            } else {
                System.out.println("Invalid Hex Color Code.");
            }
        }
    }
}
