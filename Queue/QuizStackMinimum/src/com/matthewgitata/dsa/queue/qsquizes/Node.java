package com.matthewgitata.dsa.queue.qsquizes;

/**
 * The {@code Node} class defines a Node object's properties.
 */
public class Node {
    int value;
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}