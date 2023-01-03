package com.matthewgitata.dsa.arrays.permutation;

/**
 * The {@code Permutation} class contains method(s) to check if
 * two integer arrays are permutations of each other or not.
 * <p>
 * Created by @matthewgitata on 03/01/2023
 */
public class PermutationCheck {
    /**
     * @param arr1 array of integers
     * @param arr2 array of integers
     * @return true if {@code arr1} is a permutation of {@code arr2}
     */
    public boolean isPermutationOf(int[] arr1, int[] arr2) {
        int count = 0;
        if (arr1.length == arr2.length) {
            for (int i : arr1) {
                for (int j : arr2) {
                    if (i == j) {
                        count = count + 1;
                    }
                }
            }
            return count == arr1.length;
        }
        return false;
    }

    /**
     * @param arr1 array of integers
     * @param arr2 array of integers
     * @return true if {@code arr1} is a permutation of {@code arr2}
     */
    public boolean isPermutationOfUsingSumAndProduct(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            int sum1 = 0;
            int sum2 = 0;
            int mul1 = 1;
            int mul2 = 1;
            for (int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
                mul1 *= arr1[i];
                mul2 *= arr2[i];
            }
            if (sum1 == sum2 && mul1 == mul2) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
