package com.matthewgitata.dsa.linkelist.singlylinkedlist;

/**
 * Creates a singly linked list.
 * <p>
 * Created by @matthewgitata on 04/01/2023
 */
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        System.out.println("SLL Creation.");
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);
        System.out.println("SLL Insertion.");
        sLL.insertInLinkedList(3, 0);
        sLL.insertInLinkedList(8, 1);
        sLL.insertInLinkedList(5, 2);
        sLL.insertInLinkedList(7, 3);
        sLL.insertInLinkedList(5, 4);
        System.out.print(sLL.head.value);
        System.out.print(sLL.head.next.value);
        System.out.print(sLL.head.next.next.value);
        System.out.print(sLL.head.next.next.next.value);
        System.out.println(sLL.head.next.next.next.next.value);
        System.out.println("\nSLL Traversal.");
        sLL.traverseLinkedList();
        System.out.println("\nSLL Search.");
        sLL.searchNode(6);
        sLL.searchNode(8);
        sLL.searchNode(5);
        System.out.println("\nSLL Node Deletion.");
        sLL.deletionOfNode(5);
        sLL.traverseLinkedList();
        System.out.println(sLL.head.value);
    }
}