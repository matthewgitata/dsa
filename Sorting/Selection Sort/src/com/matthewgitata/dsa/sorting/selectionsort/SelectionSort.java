package com.matthewgitata.dsa.sorting.selectionsort;

/**
 * The {@code SelectionSort} class implements the SelectionSort
 * algorithm.
 * <p>
 * created by @matthewgitata on 12/01/2023.
 */
public class SelectionSort {
    /**
     * Selection sort.
     *
     * @param arr the array to be sorted.
     */
    public static void selectionSort(int[] arr) {
        int arrLength = arr.length;
        for (int j = 0; j < arrLength; j++) {
            int minimumIndex = j;
            for (int i = j + 1; i < arrLength; i++) {
                if (arr[i] < arr[minimumIndex]) {
                    minimumIndex = i;
                }
            }
            if (minimumIndex != j) {
                int temp = arr[j];
                arr[j] = arr[minimumIndex];
                arr[minimumIndex] = temp;
            }
        }
    }

    /**
     * Print array to the console.
     *
     * @param arr the array to be sorted.
     */
    public static void printArray(int[] arr) {
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}