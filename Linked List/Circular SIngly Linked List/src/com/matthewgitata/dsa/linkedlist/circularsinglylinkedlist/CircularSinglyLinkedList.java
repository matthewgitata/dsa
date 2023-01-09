package com.matthewgitata.dsa.linkedlist.circularsinglylinkedlist;

/**
 * The {@code CircularSinglyLinkedList} class defines all
 * properties of a circular singly linked list and the methods for performing
 * basic singly linked list operations such as insertion, traversal,
 * search and deletion functions.
 * <p>
 * Created by @matthewgitata on 04/01/2023
 */
public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    /**
     * Creates a circular singly linked list.
     *
     * @param nodeValue node value
     * @return the head value of the newly created CSLL
     */
    public Node createCSLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
}
