package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input text with currency
        String text = scanner.nextLine();
        System.out.println("Currency in given text : " + extractCurrency(text));
    }

    public static List<String> extractCurrency(String text){

        List<String>currency = new ArrayList<>();

        // regex pattern to extract currency from text
        String regex = "\\$?\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // adding currency to list
        while(matcher.find()){
            currency.add(matcher.group());
        }

        return currency;
    }
}
