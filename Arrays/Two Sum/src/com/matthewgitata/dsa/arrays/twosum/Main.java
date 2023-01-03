package com.matthewgitata.dsa.arrays.twosum;

import java.util.Arrays;

/**
 * Find all pairs of integers whose sum is equal to a given number.
 * <p>
 * Created by @matthewgitata on 03/01/2023
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 7, 5,};
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.findPairs(arr, 8)));
    }
}
