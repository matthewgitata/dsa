package com.matthewgitata.dsa.sorting.insertionsort;

/**
 * The {@code InsertionSort} class implement an Insertion Sort algorithm.
 * <p>
 * created by @matthewgitata on 12/02/2023.
 */
public class InsertionSort {

    /**
     * Insertion Sort.
     */
    static void insertionSort(int[] arr) {
        int arrLength = arr.length;
        for (int i = 1; i < arrLength; i++) {
            int temp = arr[i], j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    /**
     * Prints an array to the console.
     */
    public static void print(int[] arr) {
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}