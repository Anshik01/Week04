package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer>list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(scanner.nextInt());
        }

        System.out.println("After removing Duplicates : " + removeDuplicate(list));
    }

    static List<Integer> removeDuplicate(List<Integer> list){
        // answer list will hold our answer
        List<Integer>answer = new ArrayList<>();

        // iterating to all elements and adding only those items to the answer which is not added before
        for (int item : list) {
            if(!answer.contains(item)){
                answer.add(item);
            }
        }

        return answer;
    }
}
