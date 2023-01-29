package com.matthewgitata.dsa.stack.stackbyarray;

/**
 * The {@code Stack} class defines a Stack object and the methods
 * with the operations performed on a Stack including create, isEmpty,
 * isFull, push, pop, peek, and delete.
 */
public class Stack {
    int[] arr;
    int topOfStack;

    /**
     * Initializes the array and set top of the stack.
     *
     * @param size the fixed size of the array.
     */
    public Stack(int size) {
        this.arr = new int[size];
        topOfStack = -1;
        System.out.println("The stack is created with size of: " + size);
    }

    /**
     * Checks if a Stack is empty or not
     *
     * @return true if stack is empty, otherwise false
     */
    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if a Stack is full or not
     *
     * @return true if stack is full, otherwise false
     */
    public boolean isFull() {
        if (topOfStack == arr.length) {
            return true;
        } else {
            return false;
        }
    }
}