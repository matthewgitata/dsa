package com.matthewgitata.dsa.queue.queuelinkedlist;

/**
 * The {@code QueueLinkedList} class defines the properties of a QueueLinkedList
 * object and the operations performed on it including create, isEmpty, enQueue,
 * deQueue, peek, and delete.
 * <p>
 * created by @matthewgitata on 31/01/2023
 */
public class QueueLinkedList {
    LinkedList list;

    /**
     * Creates Queue.
     */
    public QueueLinkedList() {
        list = new LinkedList();
        System.out.println("The Queue is successfully created.");
    }

    /**
     * Checks if Queue is empty.
     *
     * @return true if Queue is empty, otherwise false.
     */
    public boolean isEmpty() {
        if (list.head == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Adds element to the Queue.
     *
     * @param value the value of element to be inserted.
     */
    public void enQueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Successfully inserted " + value + " in the Queue.");
    }

    /**
     * Returns and removes the first element in the Queue.
     *
     * @return the removed first element.
     */
    public int deQueue() {
        int value = -1;
        if (isEmpty()) {
            return value;
        } else {
            value = list.head.value;
            list.deletionOfNode(0);
            return value;
        }
    }

    /**
     * Returns the first element in the Queue.
     *
     * @return the value of the first element in the Queue.
     */
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty!");
            return -1;
        } else {
            return list.head.value;
        }
    }

    /**
     * Deletes the Queue.
     */
    public void deleteQueue() {
        list.deleteSLL();
        System.out.println("The Queue is successfully deleted.");
    }
}