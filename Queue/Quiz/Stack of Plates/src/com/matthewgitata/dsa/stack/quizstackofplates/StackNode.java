package com.matthewgitata.dsa.stack.quizstackofplates;

/**
 * Defines a StackNode object.
 * <p>
 * created by @matthewgitata on 31/01/2023
 */
public class StackNode {
    public StackNode above;
    public StackNode below;
    public int value;

    public StackNode(int value) {
        this.value = value;
    }
}