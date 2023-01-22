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

    /**
     * Inserts a node in a CDLL.
     *
     * @param nodeValue the value to insert in the CDLL.
     * @param location  the location to insert {@code nodeValue} in the CDLL.
     */
    void insertNode(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createCDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    /**
     * Traverses a CDLL printing the values to the console.
     */
    void traverseCDLL() {
        if (head == null) {
            System.out.println("CDLL does not exist.");
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }

    /**
     * Reverse traverses a CDLL printing the values to the console.
     */
    void reverseTraverseCDLL() {
        if (head == null) {
            System.out.println("CDLL does not exist.");
        } else {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }
        }
        System.out.println();
    }
}