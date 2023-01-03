package com.matthewgitata.dsa.arrays.maxproduct;

/**
 * The {@code MaxProduct} class contains a method to
 * find the maximum product of two integers in the
 * array where all elements are positive.
 * <p>
 * Created by @matthewgitata on 03/01/2023
 */
public class MaxProduct {
    /**
     * @param arr an array of positive integers
     * @return maximum product from a pair of {@code arr}
     */
    public int findMaxProduct(int[] arr) {
        int maxProduct = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * arr[j] > maxProduct) {
                    maxProduct = arr[i] * arr[j];
                }
            }
        }
        return maxProduct;
    }
}