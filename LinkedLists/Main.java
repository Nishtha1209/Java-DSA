package com.company;

public class Main {

    public static void main(String[] args) {
	    customLinkedList list = new customLinkedList();
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(2);
        list.insertFirst(17);
	list.insertLast(99);
	list.insert(100,3);
        list.display();
    }
}
