package com.matthewgitata.dsa.arrays.missingnumber;

/**
 * The {@code MissingNumber} class finds the missing
 * number in an integer array of a specified range,
 * starting from 1 to n.
 * <p>
 * created by @matthewgitata on 03/01/2023
 */
public class MissingNumber {
    /**
     * Returns the missing number in an integer array
     * of a specified range, starting from 1 to n.
     *
     * @param arr int array
     * @return the missing number
     */
    public int findMissingNumber(int[] arr) {
        int missingNumber = 0;
        int currentSumOfInts = 0;
        int range = (arr.length + 1);
        int totalSumOfInts = range * (range + 1) / 2;
        for (int i : arr) {
            currentSumOfInts = currentSumOfInts + i;
            missingNumber = totalSumOfInts - currentSumOfInts;
        }
        return missingNumber;
    }
}