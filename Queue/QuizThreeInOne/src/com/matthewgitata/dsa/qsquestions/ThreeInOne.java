package com.matthewgitata.dsa.qsquestions;

/**
 * The {@code ThreeInOne} class contains method describing how
 * you could use a single Array to implement three stacks.
 * <p>
 * created by @matthewgitata on 31/01/2023.
 */
public class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    /**
     * Checks if Stack is full.
     *
     * @return true if Stack is full, else false
     */
    public boolean isFull(int stackNum) {
        if (sizes[stackNum] == stackCapacity) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if Stack is empty.
     *
     * @param stackNum the stack index.
     * @return true if Stack is empty, else false
     */
    public boolean isEmpty(int stackNum) {
        if (sizes[stackNum] == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns index of top element.
     *
     * @param stackNum the stack index.
     * @return index of top element.
     */
    private int indexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    /**
     * Inserts an element into the Stack.
     *
     * @param stackNum the stack index.
     * @param value    the value of the element.
     */
    public void push(int stackNum, int value) {
        if (isFull(stackNum)) {
            System.out.println("The Stack is Full!");
        } else {
            sizes[stackNum]++;
            values[indexOfTop(stackNum)] = value;
        }
    }

    /**
     * Returns and removes the first element in the Stack.
     *
     * @param stackNum stack index.
     * @return popped element.
     */
    public int pop(int stackNum) {
        if (isEmpty(stackNum)) {
            System.out.println("The Stack is Empty!");
            return -1;
        } else {
            int topIndex = indexOfTop(stackNum);
            int value = values[topIndex];
            values[topIndex] = 0;
            sizes[stackNum]--;
            return value;
        }
    }

    /**
     * Returns the first element from the Stack.
     *
     * @param stackNum stack index.
     * @return peeked element.
     */
    public int peek(int stackNum) {
        if (isEmpty(stackNum)) {
            System.out.println("The Stack is Empty!");
            return -1;
        } else {
            return values[indexOfTop(stackNum)];
        }
    }
}
