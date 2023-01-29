package com.matthewgitata.dsa.stack.stackbyarray;

/**
 * The {@code Main} class contains method where all
 * Stack operations can be performed.
 * <p>
 * created by @matthewgitata on 29/01/2023
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Stack creation.");
        Stack newStack = new Stack(4);
        System.out.println("Is Stack empty?");
        boolean isEmpty = newStack.isEmpty();
        System.out.println(isEmpty);
        System.out.println("Is Stack full?");
        boolean isFull = newStack.isFull();
        System.out.println(isFull);
    }
}