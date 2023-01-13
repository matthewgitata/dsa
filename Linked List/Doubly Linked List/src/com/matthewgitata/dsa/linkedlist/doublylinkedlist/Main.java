package com.matthewgitata.dsa.linkedlist.doublylinkedlist;

/**
 * Performs doubly linked list operations.
 * <p>
 * created by @matthewgitata on 12/01/2023
 */
public class Main {
    public static void main(String[] args) {
        // Create DLL
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(5);
        dll.insertDLL(1,1);
        dll.insertDLL(13, 0);
        dll.insertDLL(20, 2);
        dll.insertDLL(20, 3);
        dll.insertDLL(8, 4);
        dll.insertDLL(23, 6);
        System.out.println("Traverse the DLL");
        dll.traverseDLL();
    }
}