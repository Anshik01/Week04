package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingExceptionHandlingTest {

    @Test
    @DisplayName("Test Arithematic exception")

    void Test(){
        Exception exception = assertThrows(ArithmeticException.class, () -> {
           TestingExceptionHandling.divide(4,0);
        });

        assertEquals("Divide number by zero.", exception.getMessage());
    }

}