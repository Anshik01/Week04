package junit;

import static org.junit.jupiter.api.Assertions.*;

import junit.PerformanceTimeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

public class PerformanceTimeoutTest {
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Setting a max execution time.
    void testLongRunningTask() {
        // Creating a object of PerformanceTimeout
        PerformanceTimeout obj = new PerformanceTimeout();
        // This test should fail because the method takes longer than 2 seconds.
        obj.longRunningTask();
    }
}