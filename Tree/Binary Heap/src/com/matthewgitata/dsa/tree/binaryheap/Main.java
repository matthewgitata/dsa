package com.matthewgitata.dsa.tree.binaryheap;

/**
 * The {@code Main} class contains method where all operations
 * on a BinaryHeap are performed.
 * <p>
 * created by @matthewgitata on 09/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        BinaryHeap newBinaryHeap = new BinaryHeap(5);
        System.out.println("Peeking...");
        System.out.println(newBinaryHeap.peek());
        System.out.println("Size of Binary Heap");
        System.out.println(newBinaryHeap.sizeOfBinaryHeap());
        System.out.println("Level Order Traversal");
        newBinaryHeap.levelOrder();
    }
}