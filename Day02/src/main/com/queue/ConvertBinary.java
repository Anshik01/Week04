package com.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ConvertBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // specify number of binary user want
        System.out.println("How many numbers you want to convert?");
        int n = scanner.nextInt();

        System.out.println(convertToBinary(n));
    }

    static Queue<String> convertToBinary(int n){
        Queue<String> queue = new LinkedList<>();

        // creating a queue and add binary string using .toBinaryString() method
        for(int i=1; i<=n; i++){
            queue.add(Integer.toBinaryString(i));
        }

        return queue;
    }
}
