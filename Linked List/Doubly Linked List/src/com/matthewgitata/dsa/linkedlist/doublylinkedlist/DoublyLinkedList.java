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

    /**
     * Inserts a new value to the DLL
     *
     * @param nodeValue node value
     * @param location  index of the location to insert the new node
     */
    public void insertDLL(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
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
     * Traverses a doubly linked list.
     */
    public void traverseDLL() {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The DLL does not exist.");
        }
        System.out.println("\n");
    }

    /**
     * Traverses a doubly linked list in reverse.
     */
    public void reverseTraverseDLL() {
        if (head != null) {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("<-");
                }
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("DLL does not exist.");
        }
        System.out.println("\n");
    }
}