package com.matthewgitata.dsa.search.linearsearch;

/**
 * The {@code Searching} class implements the
 * LinearSearch and Binary Search algorithms.
 * <p>
 * created by @matthewgitata on 13/02/2023.
 */
public class Searching {

    /**
     * @param arr   the array
     * @param value the value to search for in {@code arr}
     */
    public static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("The element is found at index: " + i);
                return i;
            }
        }
        System.out.println("The element " + value + " not found");
        return -1;
    }

    /**
     * Binary Search.
     *
     * @param arr   the array
     * @param value the value to search for in {@code arr}
     */
    public static int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;
//        System.out.println(start + " " + middle + " " + end);
        while (arr[middle] != value && start <= end) {
            if (value < arr[middle]) {
                end = middle - 1;

            } else {
                start = middle + 1;
            }
            middle = (start + end) / 2;
//            System.out.println(start + " " + middle + " " + end);
        }
        if (arr[middle] == value) {
            System.out.println("The element is found at index: " + middle);
            return middle;
        } else {
            System.out.println("The element " + value + " not found");
            return -1;
        }
    }
}