package com.mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MergeTwoMaps {
    public static void main(String[] args) {
        // creating two HashMaps
        HashMap <Character, Integer> map1 = new HashMap<>();
        HashMap <Character, Integer> map2 = new HashMap<>();

        // taking user inputs to put values in the map1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Key-Value Pairs You Want To Add In The First Map:");
        int numberOfPairs = sc.nextInt();
        for (int i = 0; i < numberOfPairs; i++) {
            System.out.println("Enter Character(Key) and Integer(Value) separated by an end-line: ");
            String key = sc.next();
            int value = sc.nextInt();
            map1.put(key.charAt(0), value); // putting values in the map
            System.out.println();
        }

        // taking user inputs to put values in the map2
        System.out.println("Enter Number Of Key-Value Pairs You Want To Add In The Second Map:");
        numberOfPairs = sc.nextInt();
        for (int i = 0; i < numberOfPairs; i++) {
            System.out.println("Enter String(Key) and Integer(Value) separated by an end-line: ");
            String key = sc.next();
            int value = sc.nextInt();
            map2.put(key.charAt(0), value); // putting values in the map
            System.out.println();
        }

        // merging both maps in mergedMap
        HashMap<Character, Integer> mergedMap = new HashMap<>(map1);
        for (Map.Entry<Character, Integer> i : map2.entrySet()) {
            if(mergedMap.containsKey(i.getKey())) { // if key is already in the merged map
                mergedMap.put(i.getKey(), mergedMap.get(i.getKey())+i.getValue());
                continue;
            }
            mergedMap.put(i.getKey(), i.getValue()); // if key is absent in the merged map
        }

        // displaying all maps
        System.out.println("\nFirst Map:");
        System.out.println(map1);
        System.out.println("\nSecond Map:");
        System.out.println(map2);
        System.out.println("\nMerged Map:");
        System.out.println(mergedMap);
    }
}
