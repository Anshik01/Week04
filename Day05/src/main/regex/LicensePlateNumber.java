package org.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicensePlateNumber {
    public static void main(String[] args) {
        // defining a regex pattern to validate the license plate number
        String regex = "^[A-Z]{2}[0-9]{4}$";

        // compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // created a string array to store license plate numbers, that will be validated
        String [] licensePlateNumber = {"AB1234", "CD3456", "ab1234", "C12345", "ABC123", "12ABCD", "ABCDEF", "Ab1111", "aB1234", "123456"};

        // iterating through the licensePlateNumber array to validate each string
        for (String license : licensePlateNumber) {
            Matcher matcher = pattern.matcher(license);
            if (matcher.matches()) {
                System.out.println("Valid License Plate Number.");
            } else {
                System.out.println("Invalid License Plate Number.");
            }
        }

    }
}
