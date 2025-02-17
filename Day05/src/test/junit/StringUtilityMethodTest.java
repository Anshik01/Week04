package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilityMethodTest {

    @Test
    @DisplayName("Test reverse method")
    void Test1(){
        assertEquals("kihsna", StringUtilityMethod.reverse("anshik"));
    }

    @Test
    @DisplayName("Test isPalindrome method")
    void Test2(){
        assertTrue(StringUtilityMethod.isPalindrome("abccba"));
    }

    @Test
    @DisplayName("Test toUpperCase method")
    void Test3(){
        assertEquals("ANSHIK", StringUtilityMethod.toUpperCase("anshik"));
    }

}
