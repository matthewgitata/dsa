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
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);
    }
}