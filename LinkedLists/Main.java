package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    customLinkedList list = new customLinkedList();
//        list.insertFirst(3);
//        list.insertFirst(8);
//        list.insertFirst(2);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(100,3);list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.find(8));

//        DoublyLL list = new DoublyLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertLast(99);
//        list.insert(8, 65);

        circularLL list = new circularLL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(12);
        list.delete(3);
        list.display();
    }
}
