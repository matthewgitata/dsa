package com.matthewgitata.dsa.stack.quizstackofplates;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Defines a SetOfStacks Object.
 * <p>
 * created by @matthewgitata on 31/01/2023
 */
public class SetOfStacks {
    ArrayList<Stack> stacks = new ArrayList<>();
    public int capacity;

    public SetOfStacks(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets the last Stack.
     */
    public Stack getLastStack() {
        if (stacks.size() == 0) {
            return null;
        }
        return stacks.get(stacks.size() - 1);
    }

    /**
     * Pushes elements to the Stack.
     */
    public void push(int value) {
        Stack last = getLastStack();
        if (last != null && !last.isFull()) {
            last.push(value);
        } else {
            Stack stack = new Stack(capacity);
            stack.push(value);
            stacks.add(stack);
        }
    }

    /**
     * Pops an element out of the Stack.
     */
    public int pop() {
        Stack last = getLastStack();
        if (last == null) throw new EmptyStackException();
        int result = last.pop();
        if (last.size == 0) {
            stacks.remove(stacks.size() - 1);
        }
        return result;
    }

    /**
     * Shift elements one step left.
     */
    public int leftShift(int index, boolean removeTop) {
        Stack stack = stacks.get(index);
        int removedItem;
        if (removeTop) removedItem = stack.pop();
        else removedItem = stack.removeButton();
        if (stack.size == 0) {
            stacks.remove(index);
        } else if (stacks.size() > index + 1) {
            int v = leftShift(index + 1, false);
            stack.push(v);
        }
        return removedItem;
    }

    /**
     * Pop at method
     */
    public int popAt(int index) {
        return leftShift(index, true);
    }
}