package com.matthewgitata.dsa.sorting.quicksort;

/**
 * The {@code Main} class contains method where all
 * QuickSort operations are performed.
 * <p>
 * created by @matthewgitata on 12/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 3, 2, 7, 7, 5, 8, 4, 1, 2, 9, 7, 8, 11};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        QuickSort.print(arr);
    }
}