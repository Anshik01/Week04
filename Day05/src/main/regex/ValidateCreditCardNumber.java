package org.regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        // defining a regex pattern to validate Credit Card Number
        String regex = "^(4[0-9]{15}|5[0-9]{15})$";

        // compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // defining cardNumber from which we have to validate Credit Card Number
        String[] cardNumber = new String[5];
        cardNumber[0] = "5555666677778888";
        cardNumber[1] = "4444555566667777";
        cardNumber[2] = "3333444455556666";
        cardNumber[3] = "2222333344445555";
        cardNumber[4] = "1111222233334444";

        // iterating through the texts array to validate Credit Card Number
        for (String number : cardNumber) {
            Matcher matcher = pattern.matcher(number);
            if (matcher.matches()) {
                System.out.println("Valid Card Number");
            } else {
                System.out.println("Invalid Card Number");
            }
        }

    }
}
