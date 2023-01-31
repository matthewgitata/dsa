package com.matthewgitata.dsa.stack.quizstackofplates;

import java.util.EmptyStackException;

/**
 * Defines a Stack object.
 * <p>
 * created by @matthewgitata on 31/01/2023
 */
public class Stack {
    private int capacity;
    public StackNode top;
    public StackNode bottom;
    public int size = 0;

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Checks whether Stack is full.
     */
    public boolean isFull() {
        return capacity == size;
    }

    /**
     * Joins above and below nodes of two Stacks.
     */
    public void join(StackNode above, StackNode below) {
        if (below != null) below.above = above;
        if (above != null) above.below = below;
    }

    /**
     * Pushes elements to the Stack.
     */
    public boolean push(int v) {
        if (size >= capacity) {
            return false;
        } else {
            size++;
            StackNode newNode = new StackNode(v);
            if (size == 1)
                bottom = newNode;
            join(newNode, top);
            top = newNode;
            return true;
        }
    }

    /**
     * Pops element out of the Stack.
     */
    public int pop() {
        if (top == null) throw new EmptyStackException();
        int result = top.value;
        top = top.below;
        size--;
        return result;
    }

    /**
     * Pop at function.
     */
    public int removeButton() {
        StackNode b = bottom;
        bottom = bottom.above;
        if (bottom != null) {
            bottom.below = null;
        }
        size--;
        return b.value;
    }
}