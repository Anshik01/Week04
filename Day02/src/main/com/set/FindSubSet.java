package com.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindSubSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements of each set");
        // specifying length of both set
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer>set2 = new HashSet<>();

        // taking input in both the sets
        System.out.println("Input data on set1");
        for(int i=0; i<n1; i++){
            set1.add(scanner.nextInt());
        }

        System.out.println("Input data on set2");
        for (int i = 0; i < n2; i++) {
            set2.add(scanner.nextInt());
        }

        System.out.println("Is subset : " + isSubset(set1, set2));
    }

    static boolean isSubset(Set<Integer>set1, Set<Integer>set2){
        // set with lesser size is subset
        Set<Integer>subSet = set1.size() < set2.size() ? set1 : set2;
        // set with more size is superset
        Set<Integer>superSet = set1.size() > set2.size() ? set1 : set2;

        // if superset does not contain all elements of subset than return false;
        for(int element : subSet){
            if(!superSet.contains(element)){
                return false;
            }
        }

        return true;
    }
}
