package com.matthewgitata.dsa.stack.stacklinkedlist;

/**
 * The {@code Main} class contains method where all operations
 * on a Stack are performed.
 * <p>
 * created by @matthewgitata on 29/01/2023
 */
public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        System.out.println("Is Stack empty?");
        boolean isEmpty = newStack.isEmpty();
        System.out.println(isEmpty);
        System.out.println("Popped element");
        int popped = newStack.pop();
        System.out.println(popped);
        System.out.println("Peeked element");
        int peeked = newStack.peek();
        System.out.println(peeked);
        int peeked2 = newStack.peek();
        System.out.println(peeked2);
        System.out.println("Delete Stack");
        newStack.delete();
    }
}