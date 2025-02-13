package com.list;

import java.util.*;

public class RotateElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of items in the list : ");
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter elements in the list : ");
        for(int i=0; i<n ;i++){
            list.add(scanner.nextInt());
        }

        // value of K is the rotation point
        System.out.println("Enter value of K : ");
        int k = scanner.nextInt();

        System.out.println("Rotated list is : ");
        System.out.println(rotate(list,k));
    }

    static List<Integer> rotate(List<Integer> list, int k){
        // creating answer list to store the answer
        List<Integer> answer = new ArrayList<>();

        // first enter elements come after rotation point
        for(int i=k; i<list.size(); i++){
            answer.add(list.get(i));
        }

        // enter elements come before rotation point
        for(int i=0; i<k; i++){
            answer.add(list.get(i));
        }

        return answer;
    }
}
