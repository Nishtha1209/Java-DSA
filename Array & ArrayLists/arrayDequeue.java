package com.company;

import java.util.ArrayDeque;

public class arrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(45);
        ad1.add(56);
        ad1.addFirst(3);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
