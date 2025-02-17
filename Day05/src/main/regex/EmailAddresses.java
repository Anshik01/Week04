package org.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddresses {
    public static void main(String[] args) {
        // defining a regex pattern to extract email addresses from texts
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9._%+-]+\\.[a-zA-Z]{2,}$";

        // compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // defining texts from which we have to extract email addresses
        String[] texts = new String[5];
        texts[0] = "Contact us at support@example.com and info@company.org"; // support@example.com, info@company.org
        texts[1] = "Please contact us at support@example.com for further assistance."; // support@example.com
        texts[2] = "Send your resume to jobs@companyxyz.org before the deadline."; // jobs@companyxyz.org
        texts[3] = "For inquiries, reach out at info@webservices.net or visit our website."; // info@webservices.net
        texts[4] = "Subscribe to our newsletter at newsletter@dailynews.com for updates."; // newsletter@dailynews.com

        // iterating through the texts array to extract email addresses
        for (String text : texts) {
            String [] words = text.split(" "); // splitting each text
            for (String word : words) {
                Matcher matcher = pattern.matcher(word);
                if (matcher.matches()) {
                    System.out.println(word); // printing the email addresses
                }
            }
        }

    }
}