package com.matthewgitata.dsa.queue.cirularqueue;

/**
 * The {#code Main} class contains method where all
 * operations on a Queue object are performed.
 * <p>
 * created by @matthewgitata on 30/01/2023
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Queue creation");
        CircularQueue newQueue = new CircularQueue(6);
        System.out.println("Is Queue empty?");
        boolean isEmpty = newQueue.isEmpty();
        System.out.println(isEmpty);
        System.out.println("Is Queue full?");
        boolean isFull = newQueue.isFull();
        System.out.println(isFull);
        System.out.println("EnQueueing");
        newQueue.enQueue(3);
        newQueue.enQueue(8);
        newQueue.enQueue(5);
        newQueue.enQueue(7);
        newQueue.enQueue(5);
        newQueue.enQueue(5);
        newQueue.enQueue(5);
        int result = newQueue.deQueue();
        System.out.println(result);
        int peeked = newQueue.peek();
        System.out.println(peeked);
        newQueue.delete();
    }
}