package com.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements you wish to insert in both set");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // taking input in both the sets
        System.out.println("Input data on set1");
        for(int i=0; i<n1; i++){
            set1.add(scanner.nextInt());
        }

        System.out.println("Input data on set2");
        for (int i = 0; i < n2; i++) {
            set2.add(scanner.nextInt());
        }

        System.out.println("Symmetric Difference : " + symmetricDifference(set1, set2));
    }

    static Set<Integer> symmetricDifference(Set<Integer>set1, Set<Integer>set2){
        Set<Integer> answer = new HashSet<>();

        // adding all the elements from both set
        answer.addAll(set1);
        answer.addAll(set2);

        // finding intersection data
        set1.retainAll(set2);

        // removing intersection data from answer
        for(int element: set1){
            answer.remove(element);
        }

        return answer;
    }
}
