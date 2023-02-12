package com.matthewgitata.dsa.sorting.bubblesort;

/**
 * The {@code Main} class contains method where all operations
 * on BubbleSort object are performed.
 * <p>
 * created by @matthewgitata on 12/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = {10, 5, 30, 15, 50, 6};
        bs.bubbleSort(arr);
        bs.printArray(arr);
    }
}