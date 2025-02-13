package com.list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.ParameterizedTest.*;

class ReverseListTest {

    static List<List<Integer>> input(){
        List<List<Integer>> in = new ArrayList<>();

        in.add(Arrays.asList(1,2,3,4,5));
        in.add(Arrays.asList());
        in.add(Arrays.asList(5,2,7,3));

        return in;
    }

    // using parameterized test to test the method on various test data
    @ParameterizedTest
    @MethodSource("input")
    void reverse(List<Integer>list){
        List<Integer> expectedOutput = new ArrayList<>();

        for(int i=list.size()-1; i>=0; i--){
            expectedOutput.add(list.get(i));
        }

        List<Integer> actualOutput = ReverseList.reverse(list);

        assertEquals(expectedOutput, actualOutput);
    }

}