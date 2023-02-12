package com.matthewgitata.dsa.sorting.insertionsort;

/**
 * The {@code Main} class contains methods where to perform
 * an insertion sort.
 * <p>
 * created by @matthewgitata on 12/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 3, 2, 5, 8, 4, 3, 1};
        InsertionSort.insertionSort(arr);
        InsertionSort.print(arr);
    }
}