package com.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CircularBufferSimulation {
    public static void main(String[] args) {
        System.out.println("Queue : " + createBuffer());
    }

    public static Queue<Integer> createBuffer(){
        Scanner scanner = new Scanner(System.in);

        // number of elements
        System.out.println("Enter number of elements :");
        int n = scanner.nextInt();

        // this size will define fixed size of queue
        System.out.println("Enter size of buffer :");
        int size = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<n; i++){
            // remove first element if size of queue is full
            if(queue.size() >= size){
                queue.poll();
            }

            // add new element at end
            queue.add(scanner.nextInt());
        }

        return queue;
    }
}
