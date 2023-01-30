package com.matthewgitata.dsa.queue.queuearray;

/**
 * The {@code QueueArray} class defines the properties and the methods
 * that are performed on a QueueArray object including creation, enqueue,
 * dequeue, peek, isEmpty, isFull, and delete.
 * <p>
 * created by @matthewgitata on 29/01/2023
 */
public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    /**
     * Instantiates QueueArray; Creates Queue.
     *
     * @param size the size of the Queue.
     */
    public QueueArray(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue is successfully created with size of: " + size);
    }

    /**
     * Checks if Queue is full.
     *
     * @return true if Queue is full, otherwise false
     */
    public boolean isFull() {
        if (topOfQueue == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if Queue is empty.
     *
     * @return true if Queue is empty, otherwise false
     */
    public boolean isEmpty() {
        if (beginningOfQueue == -1 || beginningOfQueue == arr.length) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Inserts elements to the Queue.
     *
     * @param value element to be inserted.
     */
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is Full!");
        } else {
            if (isEmpty()) {
                beginningOfQueue = 0;
                topOfQueue++;
                arr[topOfQueue] = value;
                System.out.println("Successfully inserted " + value + "in the Queue.");
            } else {
                topOfQueue++;
                arr[topOfQueue] = value;
                System.out.println("Successfully inserted " + value + "in the Queue.");
            }
        }
    }

    /**
     * Removes the first element in the queue.
     *
     * @return the first element in the queue.
     */
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = -1;
                topOfQueue = -1;
            }
            return result;
        }
    }

    /**
     * Returns the first element in the queue.
     * @return the first element in the queue.
     */
    public int peek() {
        if (!isEmpty()) {
            return arr[beginningOfQueue];
        } else {
            System.out.println("The Queue is Empty!");
            return -1;
        }
    }

    /**
     * Deletes the Queue from memory.
     */
    public void delete() {
        this.arr = null;
        System.out.println("Queue is successfully deleted!");
    }
}