package regex;

import java.util.regex.*;

public class ValidateSSN {
    public static void main(String[] args) {
        String id = "123-45-6789";
        System.out.println("Is SSD id valid? " + isSSD(id));
    }

    public static boolean isSSD(String id){
        // defining regex pattern
        String regex = "\\d{3}-\\d{2}-\\d{4}";

        Pattern pattern = Pattern.compile(regex);     // define regex pattern
        Matcher matcher = pattern.matcher(id);

        // matching string
        return matcher.matches();
    }
}
