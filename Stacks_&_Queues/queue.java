package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        //queue is an interface which implements lists (rather linked lists)
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(4);
        queue.add(6);
        queue.add(8);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
