package com.matthewgitata.dsa.linkedlist.circulardoublylinkedlist;

/**
 * The {@code Main} class contains method where all
 * operations done on a circular doubly linked list
 * are performed.
 * <p>
 * created by @matthewgitata on 22/01/2023
 */
public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(3);
        cdll.insertNode(8, 1);
        System.out.print(cdll.head.next.value);
    }
}