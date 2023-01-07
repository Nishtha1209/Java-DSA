package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(6);
        deque.addLast(78);
        deque.removeFirst();
        System.out.println(deque);
    }
}
