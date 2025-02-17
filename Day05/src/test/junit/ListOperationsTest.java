package junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListOperationsTest {

    List<Integer>list;

    @BeforeEach
    void initializeList(){
        list = new ArrayList<>();
    }

    @Test
    @DisplayName("Test add element")
    void Test1(){
        ListOperations.addElement(list, 45);

        assertEquals(45, list.get(list.size()-1));
    }

    @Test
    @DisplayName("Test remove element")
    void Test2(){
        ListOperations.addElement(list, 45);
        int lengthBeforeRemovingElement = list.size();

        ListOperations.removeElement(list, 45);
        int lengthAfterRemovingElement = list.size();

        assertEquals(lengthBeforeRemovingElement-1, lengthAfterRemovingElement);
    }

    @Test
    @DisplayName("Test getLength() method")
    void Test3(){
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        assertEquals(5, ListOperations.getLength(list));
    }
}