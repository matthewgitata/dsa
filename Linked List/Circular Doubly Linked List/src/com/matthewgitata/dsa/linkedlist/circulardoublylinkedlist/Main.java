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
        cdll.insertNode(5, 2);
        cdll.insertNode(7, 3);
        cdll.insertNode(5, 4);
        System.out.println("Traverse CDLL.");
        cdll.traverseCDLL();
        System.out.println("Reverse traverse CDLL.");
        cdll.reverseTraverseCDLL();
        cdll.searchNode(5);
        cdll.searchNode(3);
        System.out.println("Delete a node in CDLL.");
        cdll.traverseCDLL();
        cdll.deleteNode(1);
        cdll.traverseCDLL();
    }
}