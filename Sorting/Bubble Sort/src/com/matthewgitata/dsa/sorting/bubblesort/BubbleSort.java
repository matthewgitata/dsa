package com.matthewgitata.dsa.sorting.bubblesort;

import java.util.Arrays;

/**
 * The {@code BubbleSort} class implements
 * a Bubble Sort.
 * <p>
 * created by @matthewgitata on 12/02/2022.
 */
public class BubbleSort {

    /**
     * Bubble Sort.
     *
     * @param arr the array to be sorted.
     */
    void bubbleSort(int arr[]) {
        int arrLength = arr.length;
        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = 0; j < arrLength - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Prints the array
     *
     * @param arr array to be printed.
     */
    void printArray(int[] arr) {
        int arrLength = arr.length;
        for (int index = 0; index < arrLength; index++) {
            System.out.print(arr[index] + " ");
        }
        System.out.println("");
    }
}