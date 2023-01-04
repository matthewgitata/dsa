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
     * @return head reference of the linked list.
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

    /**
     * Inserts an element in a linked list.
     *
     * @param nodeValue value of node
     * @param location  location to insert element in the linked list
     */
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }
}