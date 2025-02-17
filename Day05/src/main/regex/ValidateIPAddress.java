package org.regex.advancedproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        // defining a regex pattern to validate the IPV4 address
        String regex = "^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)$";

        // compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // taking input for the IPV4 address
        Scanner sc = new Scanner(System.in); // Scanner object
        System.out.println("Enter IPV4:");
        String ipv4 = sc.next();

        // matching the entered IPV4 address with the regex
        Matcher matcher = pattern.matcher(ipv4);
        if (matcher.matches()) {
            System.out.println("Valid IPV4");
        }
        else {
            System.out.println("Invalid IPV4");
        }
    }
}
