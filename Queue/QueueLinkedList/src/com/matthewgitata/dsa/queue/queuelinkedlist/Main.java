package com.matthewgitata.dsa.queue.queuelinkedlist;

/**
 * The {@code Main} class constitutes method where all operations
 * performed on a Queue are done.
 * <p>
 * created by @matthewgitata on 31/01/2023
 */
class Main {
    public static void main(String[] args) {
        System.out.println("Queue creation.");
        QueueLinkedList newQLL = new QueueLinkedList();
        System.out.println("Is Queue empty?");
        boolean isEmpty = newQLL.isEmpty();
        System.out.println(isEmpty);
        System.out.println("EnQueueing");
        newQLL.enQueue(10);
        newQLL.enQueue(20);
        newQLL.enQueue(30);
        System.out.println("Is Queue empty?");
        boolean isEmpty2 = newQLL.isEmpty();
        System.out.println(isEmpty2);
        System.out.println("EnQueueing");
        int deQueued = newQLL.deQueue();
        System.out.println(deQueued);
        System.out.println("Peeking");
        int peeked = newQLL.peek();
        System.out.println(peeked);
        System.out.println("Deleting Queue.");
        newQLL.deleteQueue();
        System.out.println(newQLL.peek());
    }
}