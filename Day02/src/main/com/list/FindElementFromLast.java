package com.list;

import java.util.Scanner;
import java.util.LinkedList;

public class FindElementFromLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you wish to add in your list ?");
        int n = scanner.nextInt();

        LinkedList<Integer>list = new LinkedList<>();

        System.out.println("Enter elements of LinkedList : ");
        for(int i=0; i<n; i++){
            list.add(scanner.nextInt());
        }

        // kth element that we need to find
        System.out.println("Enter which number you ant from last");
        int k = scanner.nextInt();

        System.out.println(kthElementFromLast(list, k));
    }

    static int kthElementFromLast(LinkedList<Integer>list, int k){
        int ans = -1;
        // removing the elements from the list until we get the desired element
        while(k>0){
            ans = list.removeLast();
            k--;
        }
        return ans;
    }

}
