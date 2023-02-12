package com.matthewgitata.dsa.sorting.selectionsort;

/**
 * The {@code Main} class contains method which all SelectionSort
 * operations are performed.
 * <p>
 * created on 12/01/2023.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {10, 3, 2, 5, 8, 4, 1, 9};
        SelectionSort.selectionSort(array);
        SelectionSort.printArray(array);
    }
}