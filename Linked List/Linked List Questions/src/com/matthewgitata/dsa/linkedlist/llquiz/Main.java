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
        llA.insertNode(3);
        llA.insertNode(1);
        llA.insertNode(5);
        llA.insertNode(9);
        LinkedList llB = new LinkedList();
        llB.insertNode(2);
        llB.insertNode(4);
        llB.insertNode(6);
        Questions qz = new Questions();
        qz.addSameNode(llA, llB, 7);
        qz.addSameNode(llA, llB, 2);
        qz.addSameNode(llA, llB, 1);
        Node inter = qz.findIntersection(llA, llB);
        System.out.println(inter.value);
    }
}