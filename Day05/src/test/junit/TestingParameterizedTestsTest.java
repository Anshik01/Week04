package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TestingParameterizedTestsTest {

    @ParameterizedTest
    @DisplayName("Test using parameterized method")
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void isEven(int number){
        boolean expectedOutput = number%2==0 ? true : false;

        assertEquals(expectedOutput, TestingParameterizedTests.isEven(number));
    }

}