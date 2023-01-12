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
        dll.createDLL(1);
        System.out.println(dll.head.value);
    }
}