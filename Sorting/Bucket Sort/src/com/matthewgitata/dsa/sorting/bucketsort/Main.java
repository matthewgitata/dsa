package com.matthewgitata.dsa.sorting.bucketsort;

/**
 * The {@code Main} class contains method where all BucketSort
 * operations are performed.
 * <p>
 * created by @matthewgitata on 12/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 4, 2, 1, 3, 6, 8};
        BucketSort bs = new BucketSort(arr);
        bs.printArray(arr);
        bs.bucketSort();
        System.out.println();
        bs.printArray(arr);
    }
}