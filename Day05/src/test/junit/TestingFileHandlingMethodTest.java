package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TestingFileHandlingMethodTest {

    @Test
    void readFileAndWrite() throws Exception{
        String content = "my name is anshik";

        TestingFileHandlingMethod.writeToFile("Sample file", content);
        String readFile = TestingFileHandlingMethod.readFile("Sample file");

        assertEquals(content, readFile);
    }


    @Test
    @DisplayName("test IOException in readFile")
    void Test(){
        Exception exception = assertThrows(IOException.class, () -> {
           TestingFileHandlingMethod.readFile("data.txt");
        });

        assertEquals("File not found", exception.getMessage());
    }


    @Test
    @DisplayName("test IOException in writeFile")
    void Test1(){
        Exception exception = assertThrows(IOException.class, () -> {
            TestingFileHandlingMethod.writeToFile("data.txt", "Hello");
        });

        assertEquals("File not found", exception.getMessage());
    }
}