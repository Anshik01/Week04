package org.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAUsername {
    public static void main(String[] args) {
        // defining a regex pattern to validate the username
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        // compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // taking input for the username
        Scanner sc = new Scanner(System.in); // Scanner object
        System.out.println("Enter Your Username:");
        String userName = sc.next();

        // matching the entered username with the regex
        Matcher matcher = pattern.matcher(userName);
        if (matcher.matches()) {
            System.out.println("Valid Username");
        }
        else {
            System.out.println("Invalid Username" + ((userName.length() > 15)? ", Length Cannot Exceed 15 Characters" : ""));
        }
    }
}