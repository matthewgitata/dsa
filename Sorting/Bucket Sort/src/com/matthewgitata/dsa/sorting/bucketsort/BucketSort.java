package com.matthewgitata.dsa.sorting.bucketsort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The {@code BucketSort} class implements the
 * Bucket Sort algorithm.
 * <p>
 * created by @matthewgitata on 12/02/2023.
 */
public class BucketSort {
    int[] arr;

    /**
     * Constructor.
     */
    public BucketSort(int[] arr) {
        this.arr = arr;
    }

    /**
     * Prints the array
     *
     * @param arr array to be printed.
     */
    public void printArray(int[] arr) {
        int arrLength = arr.length;
        for (int index = 0; index < arrLength; index++) {
            System.out.print(arr[index] + " ");
        }
        System.out.println("");
    }

    /**
     * Print Buckets
     */
    public void printBucket(ArrayList<Integer>[] buckets) {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("\nBucket#" + i + ":");
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j) + " ");
            }
        }
    }

    /**
     * Bucket Sort.
     */
    public void bucketSort() {
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int value : arr) {
            int bucketNumber = (int) Math.ceil((float) value * numberOfBuckets / (float) maxValue);
            buckets[bucketNumber - 1].add(value);
        }

        System.out.println("\n\nPrinting buckets before sorting...");
        printBucket(buckets);

        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        System.out.println("\n\nPrinting buckets after sorting...");
        printBucket(buckets);

        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int value : bucket) {
                arr[index] = value;
                index++;
            }
        }
    }
}