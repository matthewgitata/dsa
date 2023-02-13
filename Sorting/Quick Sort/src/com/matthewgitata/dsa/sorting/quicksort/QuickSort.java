package com.matthewgitata.dsa.sorting.quicksort;

/**
 * The {@code QuickSort} class implements the QuickSort
 * algorithm.
 * <p>
 * created by @matthewgitata on 12/01/2023.
 */
public class QuickSort {

    /**
     * Partition the array.
     */
    public static int partition(int[] arr, int start, int end) {
        int pivot = end;
        int i = start - 1;
        for (int j = start; j <= end; j++) {
            if (arr[j] <= arr[pivot]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }

    /**
     * Quick Sort.
     */
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot+1, end);
        }
    }


    /**
     * Print array to console.
     */
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}