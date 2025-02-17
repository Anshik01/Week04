package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Test for Addition")
    void Test1(){
        assertEquals(5, Calculator.add(2,3));
    }

    @Test
    @DisplayName("Test for Subtraction")
    void Test2(){
        assertEquals(1, Calculator.subtract(3,2));
    }

    @Test
    @DisplayName("Test for Multiplication")
    void Test3(){
        assertEquals(6, Calculator.multiply(2,3));
    }

    @Test
    @DisplayName("Test for Division")
    void Test4() throws Exception{
        assertEquals(2, Calculator.divide(4,2));
    }

    @Test
    @DisplayName("Test for Arithematic Exception")
    void Test5(){
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(4,0);
        });

        assertEquals("Divide by 0.", exception.getMessage());
    }

}