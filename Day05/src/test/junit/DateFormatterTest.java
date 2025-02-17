package junit;

import junit.DateFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateFormatterTest {
    // Creating a private final object of DateFormatter named as formatter to make call and test the conversion
    private final DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDateFormat() {
        // Testing weather the date formated and matched with expected format
        assertEquals("25-12-2023", formatter.formatDate("2023-12-25"));
    }

    @Test
    void testInvalidDateFormat() {
        // Testing if date format failed then get the expected exception or not
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("25-12-2023"));
    }
}