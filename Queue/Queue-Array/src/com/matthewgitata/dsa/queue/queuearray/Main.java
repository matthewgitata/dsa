package com.matthewgitata.dsa.queue.queuearray;

/**
 * The {@code Main} class contains method where all operations
 * on a Queue object are performed.
 * <p>
 * created by @matthewgitata on 30/01/2023
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Queue creation");
        QueueArray newQueue = new QueueArray(6);
        System.out.println("Is Queue full?");
        boolean resultFull = newQueue.isFull();
        System.out.println(resultFull);
        System.out.println("Is Queue empty?");
        boolean resultEmpty = newQueue.isEmpty();
        System.out.println(resultEmpty);
        System.out.println("Enqueue elements");
        newQueue.enQueue(3);
        newQueue.enQueue(8);
        newQueue.enQueue(5);
        newQueue.enQueue(7);
        newQueue.enQueue(5);
        newQueue.enQueue(5);
        newQueue.enQueue(5);
    }
}