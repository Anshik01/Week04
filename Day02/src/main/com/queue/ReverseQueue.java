package com.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // specify number of elements in queue
        System.out.println("Enter number of elements in queue : ");
        int n = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Enter elements in queue : ");
        for (int i = 0; i < n; i++) {
            queue.add(scanner.nextInt());
        }

        Stack<Integer> stack = reverse(queue);

        System.out.print("Reverse queue is : ");

        // pop all elements from stack using LIFO principle
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }

    static Stack<Integer> reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();

        // empty queue in stack
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }

        return stack;
    }
}
