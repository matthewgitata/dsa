package com.matthewgitata.dsa.queues.quiz.queueviastack;

import java.util.Stack;

/**
 * The {@code QueueViaStacks} class implements a Queue class
 * which implements a Queue using two stacks.
 * <p>
 * created by @matthewgitata on 31/01/2023.
 */
public class QueueViaStack {
    Stack<Integer> stackNewest;
    Stack<Integer> stackOldest;

    public QueueViaStack() {
        this.stackNewest = new Stack<>();
        this.stackOldest = new Stack<>();
    }

    /**
     * Get size of Queue.
     *
     * @return int size of the Queue
     */
    public int size() {
        return stackOldest.size() + stackNewest.size();
    }

    /**
     * Pushes element into the Stack/Queue.
     *
     * @param value the value being pushed.
     */
    public void enQueue(int value) {
        stackNewest.push(value);
    }

    /**
     * Shifts elements from newer Stack to older Stack
     */
    private void shiftStacks() {
        if (stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()) {
                int poppedOut = stackNewest.pop();
                stackOldest.push(poppedOut);
            }
        }
    }

    /**
     * Returns and removes the first element from the Queue.
     *
     * @return the first element in the Queue.
     */
    public int deQueue() {
        shiftStacks();
        return stackOldest.pop();
    }

    /**
     * Returns the first element from the Queue.
     *
     * @return the first element in the Queue.
     */
    public int peek() {
        shiftStacks();
        return stackOldest.peek();
    }
}