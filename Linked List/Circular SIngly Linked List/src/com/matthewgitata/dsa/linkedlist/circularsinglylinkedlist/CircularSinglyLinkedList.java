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

    /**
     * Inserts a new value to the CSLL
     *
     * @param nodeValue node value
     * @param location  index of the location to insert the new node
     */
    public void insertCSLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCSLL(nodeValue);
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    /**
     * Traverses a circular singly linked list printing
     * to the console each of its elements.
     */
    public void traverCSLL() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        } else {
            System.out.println("CSLL does not exist.");
        }
    }
}