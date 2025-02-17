package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println(findLink(text));
    }

    public static List<String> findLink(String text){
        // regex to match the link and extract it
        String regex = "\\b(https?)://(www\\.)?[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b";

        // list is storing all the links
        List<String> links = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // finding all the links in string
        while(matcher.find()){
            links.add(matcher.group());
        }

        return links;
    }
}
