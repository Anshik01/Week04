package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingTemperatureConverterTest {
    private final TestingTemperatureConverter converter = new TestingTemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        // Testing weather conversion method convert perfectly and check the expected temperature same as actual result
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        // testing weather fahrenheitToCelsius conversion give result as expected
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.01);
    }
}