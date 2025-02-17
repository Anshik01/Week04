package junit;

import java.util.regex.Pattern;

public class StringUtilityMethod {

    public static String reverse(String string){
        StringBuilder str = new StringBuilder(string);     // using stringBuilder to use reverse() method
        return str.reverse().toString();
    }

    public static boolean isPalindrome(String string){
        // taking to pointers and checking if palindrome or not
        int i=0;
        int j=string.length()-1;

        while(i<=j){
            if(string.charAt(i) != string.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static String toUpperCase(String string){
        return string.toUpperCase();     // using built-in method
    }
    public static void main(String[] args) {
        System.out.println("String in reverse : " + reverse("anshik"));
        System.out.println("is string a Palindrome? " + isPalindrome("abccba"));
        System.out.println("Convert to upper case: " + toUpperCase("anshik"));
    }
}
