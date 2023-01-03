package com.matthewgitata.dsa.arrays.numbersearch;

/**
 * The {@code NumberSearch} class checks if an array
 * contains a given number.
 * <p>
 * created by @matthewgitata on 03/01/2023
 */
public class NumberSearch {
    /**
     * @param arr   the array to perform a check on
     * @param value the number to search for
     * @return true if {@code arr} contains {@code value}, false otherwise
     */
    public boolean searchForValue(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}