package com.matthewgitata.dsa.linkedlist.llquiz;

/**
 * The {@code Main} class contains the main method where
 * all operations on a LL are performed.
 * <p>
 * Created by @matthewgitata on 22/01/2023
 */
public class Main {
    public static void main(String[] args) {
        LinkedList llA = new LinkedList();
        llA.insertNode(7);
        llA.insertNode(1);
        llA.insertNode(6);
        LinkedList llB = new LinkedList();
        llB.insertNode(5);
        llB.insertNode(9);
        llB.insertNode(2);
        Questions qz = new Questions();
        LinkedList result = qz.sumList(llA, llB);
        result.traversalLL();
    }
}