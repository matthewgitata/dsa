package com.matthewgitata.dsa.linkelist.singlylinkedlist;

/**
 * Creates a singly linked list.
 * <p>
 * Created by @matthewgitata on 04/01/2023
 */
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);
    }
}