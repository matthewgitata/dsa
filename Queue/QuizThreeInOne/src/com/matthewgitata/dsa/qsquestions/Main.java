package com.matthewgitata.dsa.qsquestions;

/**
 * The {@code Main} class contains method where all
 * operations of {@code ThreeInOne} can be done.
 * <p>
 * created by @matthewgitata on 31/01/2023/
 */
public class Main {
    public static void main(String[] args) {
        ThreeInOne newStacks = new ThreeInOne(3);
        System.out.println("Is stack full?");
        boolean isFull = newStacks.isFull(2);
        System.out.println(isFull);
        System.out.println("Is stack empty?");
        boolean isEmpty = newStacks.isFull(2);
        System.out.println(isEmpty);
        System.out.println("Pushing elements");
        newStacks.push(0, 3);
        newStacks.push(0, 1);
        newStacks.push(0, 3);
        System.out.println("Is stack full?");
        boolean isFull2 = newStacks.isFull(0);
        System.out.println(isFull2);
    }
}