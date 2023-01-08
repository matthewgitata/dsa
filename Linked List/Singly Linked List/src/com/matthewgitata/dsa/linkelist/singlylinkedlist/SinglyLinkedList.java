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

    /**
     * Traverses a singly linked list printing
     * to the console each of its elements.
     */
    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("SLL does not exist.");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("");
    }

    /**
     * Finds a node value in a singly linked list.
     *
     * @param nodeValue the node value to look for
     */
    public void searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print("The node is found at position: " + i + "\n");
                    return;
                }
                tempNode = tempNode.next;
            }
            System.out.println("Node not found");
        }
    }

    /**
     * Deletes a node from a Singly Linked List.
     *
     * @param location location of the node to be deleted
     */
    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("SLL not found.");
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                head = null;
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
                if (tempNode == head) {
                    tail = head = null;
                    size--;
                    return;
                }
                tempNode.next = null;
                tail.next = tempNode;
                size--;
            }
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    /**
     * Deletes entire Singly Linked List.
     */
    public void deleteSLL() {
        head = null;
        tail = null;
        System.out.println("SLL deleted successfully.");
    }
}