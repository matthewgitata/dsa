package com.matthewgitata.dsa.search.linearsearch;

/**
 * The {@code Searching} class implements the
 * LinearSearch and Binary Search algorithms.
 * <p>
 * created by @matthewgitata on 13/02/2023.
 */
public class Searching {

    /**
     * Linear Search
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
}