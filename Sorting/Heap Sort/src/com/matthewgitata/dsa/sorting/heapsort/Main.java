package com.matthewgitata.dsa.sorting.heapsort;

/**
 * The {@code Main} class contains method in which all
 * operations done on a HeapSort are performed.
 * <p>
 * created by @matthewgitata on 13/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 7, 3, 1, 4, 8, 9};
        HeapSort hs = new HeapSort(arr);
        hs.sort();
        System.out.println("Sorted...");
        hs.print(arr);
    }
}