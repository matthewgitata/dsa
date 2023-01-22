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

    /**
     * Searches for a given value in a doubly linked list
     *
     * @param nodeValue the node value we are looking for
     * @return true if {@code nodeValue} exists, false if otherwise
     */
    public boolean searchDLL(int nodeValue) {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("The node is found at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found.");
        return false;
    }

    /**
     * Deletes a node is doubly linked list.
     *
     * @param location the location of the value to be deleted
     */
    public void deleteNodeDLL(int location) {
        if (head == null) {
            System.out.println("DLL does not exist.");
        } else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        } else if (location >= size) {
            DoublyNode tempNode = tail.prev;
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                tempNode.next = null;
                tail = tempNode;
            }
            size--;

        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    /**
     * Deletes entire DLL.
     */
    public void deleteDLL() {
        DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The DLL has been deleted.");
    }
}