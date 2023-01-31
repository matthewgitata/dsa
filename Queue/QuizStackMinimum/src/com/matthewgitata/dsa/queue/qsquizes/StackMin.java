package com.matthewgitata.dsa.queue.qsquizes;

/**
 * The {@code StackMin}  class defines a StackMin object together with the
 * operations that can be done on it. The main aim is to showcase a function
 * min which returns the minimum element.
 * <p>
 * created by @matthewgitata on 31/01/2023.
 */
public class StackMin {
    Node top;
    Node min;

    public StackMin() {
        top = null;
        min = null;
    }

    /**
     * Returns min element in Stack.
     *
     * @return minimum value.
     */
    public int min() {
        return min.value;
    }

    /**
     * Pushes element into Stack
     *
     * @param value int to be pushed
     */
    public void push(int value) {
        if (min == null) {
            min = new Node(value, min);
        } else if (min.value < value) {
            min = new Node(min.value, min);
        } else {
            min = new Node(value, min);
        }
        top = new Node(value, top);
    }

    public int pop() {
        min = min.next;
        int result = top.value;
        top = top.next;
        return result;
    }
}