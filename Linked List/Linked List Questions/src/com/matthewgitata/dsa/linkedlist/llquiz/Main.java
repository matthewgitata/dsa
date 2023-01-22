package com.matthewgitata.dsa.linkedlist.llquiz;

/**
 * The {@code Main} class contains the main method where
 * all operations on a LL are performed.
 * <p>
 * Created by @matthewgitata on 22/01/2023
 */
public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(1);
        ll.insertNode(9);
        ll.insertNode(5);
        ll.insertNode(10);
        ll.insertNode(2);
        ll.traversalLL();
        Questions q = new Questions();
        LinkedList t = q.partition(ll, 4);
        t.traversalLL();
    }
}