package regex;

import java.util.Scanner;

public class ReplaceAndModifyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("String after removing multiple spaces : " + replaceSpaces(text));
    }

    public static String replaceSpaces(String text){
        // replacing all extra backspace by one space
        return text.replaceAll("\\s+" , " ");
    }
}
