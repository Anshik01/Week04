package com.set;

import java.util.*;

public class ConvertSetToSortedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements you wish to insert in set");
        int n1 = scanner.nextInt();

        Set<Integer> set = new HashSet<>();

        // taking input in the sets
        System.out.println("Input data on set1");
        for(int i=0; i<n1; i++){
            set.add(scanner.nextInt());
        }

        System.out.println("Sorted List : " + convertToList(set));
    }

    static List<Integer> convertToList(Set<Integer>set){

        // initializing list with all the elements present in set
        List<Integer> list = new ArrayList<>(set);

        // using method in collection to sort the list
        Collections.sort(list);

        return list;
    }
}
