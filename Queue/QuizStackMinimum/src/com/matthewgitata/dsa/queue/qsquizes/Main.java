package com.matthewgitata.dsa.queue.qsquizes;

/**
 * The {@code Main} class contains method where all StackMinimum
 * operations are performed.
 * <p>
 * created by @matthewgitata on 31/01/2023.
 */
public class Main {
    public static void main(String[] args) {
        StackMin newStack = new StackMin();
        newStack.push(3);
        newStack.push(2);
        newStack.push(5);
        newStack.push(1);
        System.out.println(newStack.min());
        newStack.pop();
        System.out.println(newStack.min());
    }
}