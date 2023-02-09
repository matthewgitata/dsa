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
        newBinaryHeap.insert(10, "Min");
        newBinaryHeap.insert(5, "Min");
        newBinaryHeap.insert(15, "Min");
        newBinaryHeap.insert(1, "Min");
        System.out.println("Peeking...");
        System.out.println(newBinaryHeap.peek());
        System.out.println("Size of Binary Heap");
        System.out.println(newBinaryHeap.sizeOfBinaryHeap());
        System.out.println("Level Order Traversal");
        newBinaryHeap.levelOrder();
        System.out.println("Extract head of Binary Heap");
        newBinaryHeap.extractHeadOfHeap("Min");
        newBinaryHeap.levelOrder();
    }
}