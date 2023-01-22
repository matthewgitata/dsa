package com.matthewgitata.dsa.linkedlist.llquiz;

/**
 * The {@code LinkedList} class defines the properties and methods
 * that are used to perform operations on a Linked List including
 * creation, insertion and traversal.
 * <p>
 * Created by @matthewgitata on 22/01/2023
 */
public class LinkedList {
    public Node head;
    public Node tail;
    int size;

    /**
     * Creates Linked List
     * @param nodeValue the value of the node.
     */
    public void createLL(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    /**
     * Inserts a node into the LL.
     * @param nodeValue the value of the node.
     */
    public void insertNode(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    /**
     * Traverse a LL printing to the console all the elements.
     */
    public void traversalLL() {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i != size - 1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }
}