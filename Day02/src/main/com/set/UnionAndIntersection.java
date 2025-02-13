package com.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionAndIntersection {
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

        System.out.println("Union : " + findUnion(set1, set2));
        System.out.println("Intersection : " + findIntersection(set1, set2));
    }

    static Set<Integer> findUnion(Set<Integer>set1, Set<Integer>set2){
        Set<Integer>union = new HashSet<>();

        // adding all the values of both the collections into one
        union.addAll(set1);
        union.addAll(set2);

        return union;
    }

    static Set<Integer> findIntersection(Set<Integer>set1, Set<Integer>set2){

        // retainAll method is used to just keep the elements that are present in both the collections
        set1.retainAll(set2);

        return set1;
    }
}
