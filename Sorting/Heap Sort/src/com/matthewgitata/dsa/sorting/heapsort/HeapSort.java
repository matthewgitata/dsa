package com.matthewgitata.dsa.sorting.heapsort;

/**
 * The {@code HeapSort} class implements the
 * Heap Sort algorithm.
 * <p>
 * created by @matthewgitata on 13/02/2023.
 */
public class HeapSort {
    int[] arr = null;

    /**
     * Constructor
     */
    public HeapSort(int[] arr) {
        this.arr = arr;
    }

    /**
     * Heap Sort.
     */
    public void sort() {
        BinaryHeap bh = new BinaryHeap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            bh.insertInHeap(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = bh.extractHeadOfHeap("Min");
        }
    }

    /**
     * Print array to the console.
     */
    public void print(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}