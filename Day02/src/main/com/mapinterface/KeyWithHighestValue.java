package com.mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeyWithHighestValue {
    public static void main(String[] args) {
        // created a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        // taking user inputs to put values in the map
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Key-Value Pairs You Want To Add In The Map:");
        int numberOfPairs = sc.nextInt();
        for (int i = 0; i < numberOfPairs; i++) {
            System.out.println("Enter String(Key) and Integer(Value) separated by an end-line: ");
            String key = sc.next();
            int value = sc.nextInt();
            map.put(key, value); // putting values in the map
            System.out.println();
        }

        int maxValue = Integer.MIN_VALUE; // to store the max value of the map
        String maxValueKey = ""; // to store the key with max value in the map

        // iteration through map
        for (Map.Entry<String, Integer> i : map.entrySet()) {
            if (maxValue < i.getValue()) {
                maxValue = i.getValue();
                maxValueKey = i.getKey();
            }
        }

        // displaying the output
        System.out.println("Key with maximum value in the map: " + maxValueKey + "\nMaximum Value: " + maxValue);
    }
}
