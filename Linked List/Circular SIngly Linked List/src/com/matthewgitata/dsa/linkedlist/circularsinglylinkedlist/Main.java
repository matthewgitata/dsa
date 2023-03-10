package com.matthewgitata.dsa.linkedlist.circularsinglylinkedlist;

/**
 * Performs circular singly linked list operations.
 * <p>
 * created by @matthewgitata on 09/01/2023
 */
public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        System.out.println("CSLL Creation");
        csll.createCSLL(3);
        csll.insertCSLL(8, 1);
        csll.insertCSLL(5, 2);
        csll.insertCSLL(7, 3);
        csll.insertCSLL(5, 4);
        System.out.println(csll.head.value);
        System.out.println("\nCSS Traversal");
        csll.traverCSLL();
        System.out.println("Node Search");
        csll.searchNode(8);
        System.out.println("\nNode Deletion");
        csll.deleteNode(1);
        csll.traverCSLL();
        csll.deleteCSLL();
        csll.traverCSLL();
    }
}