package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReverseList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter number of inputs
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();

        // initialize List using ArrayList
        List<Integer> listUsingArrayList = new ArrayList<>();

        System.out.println("Enter elements in list : ");
        for(int i=0; i<n; i++){
            listUsingArrayList.add(sc.nextInt());
        }

        // initializing list using LinkedList
        List<Integer> listUsingLinkedList = new LinkedList<>(listUsingArrayList);

        System.out.println("Reversed list using arrayList : " + reverse(listUsingArrayList));
        System.out.println("Reverse element by using linkedList : " + reverse(listUsingLinkedList));

    }

    static List<Integer> reverse(List<Integer>list){
        int i=0;
        int j=list.size()-1;

        while(i<=j){
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }

        return list;
    }


}
