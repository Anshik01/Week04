package com.mapinterface;

import java.util.*;

// definition of InvertAMap class
public class InvertAMap {
    // main method
    public static void main(String[] args) {
        // created a HashMap named map
        HashMap <Integer, Character> map = new HashMap<>();
        // putting data in map
        for (int i = 1; i < 15; i++) {
            map.put(i, (i%4==0)? 'A' :(i%4==1)? 'B' :(i%4==2)? 'C' : 'D');
        }
        // printing the data present in the map
        System.out.println("Data in the map:");
        map.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println();

        // created another HashMap named invertMap to store the invert version of map
        HashMap <Character, ArrayList<Integer>> invertMap = new HashMap<>();

        // putting data in invertMap
        for (Map.Entry<Integer, Character> i : map.entrySet()) {
            invertMap.putIfAbsent(i.getValue(), new ArrayList<>());
            invertMap.get(i.getValue()).add(i.getKey());
        }
        // printing data of invert map
        invertMap.forEach((key, value) -> System.out.println(key + " : " + value.toString()));
    }
}
