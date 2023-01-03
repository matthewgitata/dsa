package com.matthewgitata.dsa.arrays.twosum;

/**
 * The {@code TwoSum} class finds all pairs of integers
 * whose sum is equal to a given number.
 * <p>
 * created by @matthewgitata on 03/01/2023
 */
public class TwoSum {
    /**
     * @param arr    The integer to find pairs from.
     * @param target The given number to compare the {@code arr} integer pairs' sum to.
     * @return All pairs of integers equal to {@code target}.
     */
    public int[] findPairs(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        throw new IllegalArgumentException("No solution found.");
    }
}