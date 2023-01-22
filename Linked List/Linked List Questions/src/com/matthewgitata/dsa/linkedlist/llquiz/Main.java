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
        ll.insertNode(2);
        ll.insertNode(2);
        ll.insertNode(3);
        ll.insertNode(5);
        ll.traversalLL();
        Questions q = new Questions();
        Node n = q.nthToLast(ll, 2);
        System.out.println(n.value);
    }
}