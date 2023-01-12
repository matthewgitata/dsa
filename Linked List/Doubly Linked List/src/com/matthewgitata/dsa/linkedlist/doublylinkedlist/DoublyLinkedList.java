package com.matthewgitata.dsa.linkedlist.doublylinkedlist;

/**
 * The {@code DoublyLinkedList} class defines all
 * properties of a doubly linked list and the methods for performing
 * basic doubly linked list operations such as insertion, traversal,
 * search and deletion functions.
 * <p>
 * Created by @matthewgitata on 12/01/2023
 */
public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    /**
     * Creates a doubly linked list.
     *
     * @param nodeValue node value
     * @return the head value of the newly created DLL
     */
    public DoublyNode createDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }
}