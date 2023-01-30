package com.matthewgitata.dsa.stack.stacklinkedlist;

/**
 * The {@code Stack} class defines a Stack object and the
 * operations performed on a Stack.
 * <p>
 * created by @matthewgitata on 30/01/2023
 */
public class Stack {
    LinkedList linkedList;

    /**
     * Instantiate LinkedList; Create Stack.
     */
    public Stack() {
        linkedList = new LinkedList();
    }

    /**
     * Push elements to the Stack.
     *
     * @param value the value of integer to be pushed.
     */
    public void push(int value) {
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted " + value + " in Stack.");
    }

    /**
     * Checks if Stack is empty.
     *
     * @return true if Stack is empty, otherwise false
     */
    public boolean isEmpty() {
        if (linkedList.head == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Pops element out of Stack
     *
     * @return popped element
     */
    public int pop() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("The Stack is Empty!");
        } else {
            result = linkedList.head.value;
            linkedList.deletionOfNode(0);
        }
        return result;
    }

    /**
     * Peeks element in Stack.
     *
     * @return peeked element.
     */
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is empty.");
            return -1;
        } else {
            return linkedList.head.value;
        }
    }

    /**
     * Deletes Stack from memory.
     */
    public void delete() {
        linkedList.head = null;
        System.out.println("The Stack is deleted.");
    }
}