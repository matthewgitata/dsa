package com.matthewgitata.dsa.linkedlist.circulardoublylinkedlist;

/**
 * The {@code CircularDoublyLinkedList} class contains properties and
 * methods that define the various operations that are done on a circular
 * doubly linked list such as creation, insertion, traversal, searching, and
 * deletion.
 * <p>
 * created by @matthewgitata on 22/01/2023
 */
public class CircularDoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    /**
     * Creates a CDLL.
     *
     * @param nodeValue the value
     * @return head of the newly created CDLL.
     */
    DoublyNode createCDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return head;
    }
}