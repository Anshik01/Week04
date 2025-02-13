package com.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingQueue {
    public static void main(String[] args) {
        System.out.println(implementStack());
    }

    static Queue<Integer> implementStack(){
        Scanner scanner = new Scanner(System.in);

        // using two queue to implement the stack
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        System.out.println("How many elements you want to insert in stack : ");
        int n = scanner.nextInt();

        System.out.println("Enter elements : ");
        while(n > 0){
            if(queue1.isEmpty()){
                queue1.add(scanner.nextInt());
                // adding all the elements present in queue2
                while(!queue2.isEmpty()){
                    queue1.add(queue2.poll());    // remove elements from queue2
                }
            }
            else{
                queue2.add(scanner.nextInt());
                // adding all the elements present in queue1
                while(!queue1.isEmpty()){
                    queue2.add(queue1.poll());    // remove elements from queue1
                }
            }

            n--;
        }

        return queue1.isEmpty() ? queue2 : queue1;
    }
}
