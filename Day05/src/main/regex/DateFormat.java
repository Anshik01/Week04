package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text : ");
        String date = scanner.nextLine();

        // dates holds all the dates present in text
        List<String>dates = isDate(date);

        System.out.println(dates);
    }

    public static List<String> isDate(String date){
        List<String>dates = new ArrayList<>();

        // using \b to separate date with other words
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);

        // adding matching dates to the list
        while(matcher.find()){
            dates.add(matcher.group());
        }

        return dates;
    }
}
