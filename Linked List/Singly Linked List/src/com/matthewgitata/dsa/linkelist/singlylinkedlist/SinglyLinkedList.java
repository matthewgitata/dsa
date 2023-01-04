package com.matthewgitata.dsa.linkelist.singlylinkedlist;

/**
 * The {@code SinglyLinkedList} class contains methods for performing
 * basic singly linked list operations such as insertion, traversal,
 * search and deletion functions.
 * <p>
 * Created by @matthewgitata on 04/01/2023
 */
public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    /**
     * Creates a singly linked list.
     *
     * @param nodeValue value of node
     * @return head reference of the list.
     */
    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
}