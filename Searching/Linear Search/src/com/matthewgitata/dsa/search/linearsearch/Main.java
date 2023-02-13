package com.matthewgitata.dsa.search.linearsearch;

/**
 * The {@code Main} class contains method where all
 * LinearSearch operations are performed.
 * <p>
 * created by @matthewgitata on 13/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 10, 23, 11};
        int[] arr2 = {8, 9, 12, 15, 17, 19, 20, 21, 28};
        System.out.println("Linear Search");
        Searching.linearSearch(arr, 10);
        Searching.linearSearch(arr, 17);
        System.out.println("\nBinary Search");
        Searching.binarySearch(arr2, 17);
        Searching.binarySearch(arr2, 30);
    }
}