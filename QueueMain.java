package com.company;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        customQueue queue = new customQueue(5);
        queue.insert(4);
        queue.insert(3);
        queue.insert(33);
        queue.insert(6);
        queue.insert(9);
        queue.display();

        System.out.println(queue.remove());
        queue.display();
    }
}
