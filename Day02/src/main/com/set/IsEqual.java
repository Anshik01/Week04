package com.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements of each set");
        // specifying length of both set
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        Set<Integer>set1 = new HashSet<>();
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

        System.out.println("Does all elements of set1 is in set2 ?" + isEqualSet(set1, set2));
    }

    static boolean isEqualSet(Set<Integer>set1, Set<Integer>set2){
        // if length is not equal so return false
        if(set1.size() != set2.size()){
            return false;
        }

        // comparing elements between both sets
        return set1.containsAll(set2);
    }
}
