package com.matthewgitata.dsa.sorting.mergesort;

/**
 * The {@code MergeSort} class implements the
 * MergeSort algorithm.
 * <p>
 * created by @matthewgitata on 12/02/20223.
 */
public class MergeSort {

    /**
     * Merge.
     */
    static void merge(int[] arr, int left, int middle, int right) {
        int[] leftTmpArray = new int[middle - left + 2];
        int[] rightTmpArray = new int[right - middle + 1];
        for (int i = 0; i <= middle - left; i++) {
            leftTmpArray[i] = arr[left + i];
        }
        for (int i = 0; i < right - middle; i++) {
            rightTmpArray[i] = arr[middle + 1 + i];
        }

        leftTmpArray[middle - left + 1] = Integer.MAX_VALUE;
        rightTmpArray[right - middle] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = left; k <= right; k++) {
            if (leftTmpArray[i] < rightTmpArray[j]) {
                arr[k] = leftTmpArray[i];
                i++;
            } else {
                arr[k] = rightTmpArray[j];
                j++;
            }
        }
    }

    /**
     * Merge sort.
     */
    public static void mergeSort(int[] array, int left, int right) {
        if (right > left) {
            int m = (left + right) / 2;
            mergeSort(array, left, m);
            mergeSort(array, m + 1, right);
            merge(array, left, m, right);
        }
    }

    /**
     * Print array to the console.
     */
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}