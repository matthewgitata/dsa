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
        Stack newStack = new Stack(5);
        System.out.println("Is Stack empty?");
        boolean isEmpty = newStack.isEmpty();
        System.out.println(isEmpty);
        newStack.push(3);
        newStack.push(5);
        newStack.push(7);
        newStack.push(5);
        newStack.push(5);
        System.out.println("Is Stack full?");
        boolean isFull = newStack.isFull();
        System.out.println(newStack.isFull());
        System.out.println("Popped element...");
        int popped = newStack.pop();
        System.out.println(popped);
        System.out.println("Peeked element...");
        int peeked = newStack.peek();
        System.out.println(peeked);
        System.out.println("Delete stack");
        newStack.delete();
    }
}