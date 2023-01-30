package com.matthewgitata.dsa.queue.cirularqueue;

/**
 * The {@code CircularQueue} class defines the properties
 * of a Queue object and all the operations that are performed
 * on it including create, enQueue, isFull, isEmpty, deQueue, peek,
 * and delete.
 * <p>
 * created by @matthewgitata on 30/01/2023
 */
public class CircularQueue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    /**
     * Initialize array in memory; Create Queue.
     *
     * @param size the size of the array.
     */
    public CircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Circular Queue successfully created with the size of: " + size);
    }

    /**
     * Checks if Queue is empty.
     *
     * @return true if Queue is empty, otherwise false
     */
    public boolean isEmpty() {
        if (topOfQueue == -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if Queue is full.
     *
     * @return true if Queue is full, otherwise false
     */
    public boolean isFull() {
        if (topOfQueue + 1 == beginningOfQueue) {
            return true;
        } else if (beginningOfQueue == 0 && topOfQueue + 1 == size) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Inserts element to Queue.
     *
     * @param value the value to insert.
     */
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Circular Queue is Full!");
        } else {
            if (isEmpty()) {
                beginningOfQueue = 0;
                topOfQueue++;
                arr[topOfQueue] = value;
                System.out.println("The " + value + " successfully inserted.");
            } else {
                if (topOfQueue + 1 == size) {
                    topOfQueue = 0;
                } else {
                    topOfQueue++;
                }
                arr[topOfQueue] = value;
                System.out.println("The " + value + " successfully inserted.");
            }
        }
    }
}