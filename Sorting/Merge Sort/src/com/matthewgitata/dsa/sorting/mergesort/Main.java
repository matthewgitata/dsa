package com.matthewgitata.dsa.sorting.mergesort;

/**
 * The {@code Main} class contains method which all
 * MergeSort operations are performed.
 * <p>
 * created by @matthewgitata on 12/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        MergeSort.printArray(arr);
    }
}