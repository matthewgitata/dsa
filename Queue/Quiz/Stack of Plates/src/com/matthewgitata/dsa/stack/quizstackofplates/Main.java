package com.matthewgitata.dsa.stack.quizstackofplates;

/**
 * The {@code Main} class contains method which SetOfStacks operations
 * are performed including push, pop, and popAt.
 * <p>
 * created by @matthewgitata on 31/01/2023
 */
public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(3);
        newStack.push(1);
        newStack.push(2);
        System.out.println(newStack.pop());
    }
}