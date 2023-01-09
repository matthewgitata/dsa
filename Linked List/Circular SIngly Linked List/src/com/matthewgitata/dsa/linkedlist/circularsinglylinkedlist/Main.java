package com.matthewgitata.dsa.linkedlist.circularsinglylinkedlist;

/**
 * Performs circular singly linked list operations.
 * <p>
 * created by @matthewgitata on 09/01/2023
 */
public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        System.out.println("CSLL Creation.");
        csll.createCSLL(3);
        csll.insertCSLL(3, 0);
        csll.insertCSLL(8, 1);
        csll.insertCSLL(5, 2);
        csll.insertCSLL(7, 3);
        csll.insertCSLL(5, 4);
        System.out.println(csll.head.value);
    }
}