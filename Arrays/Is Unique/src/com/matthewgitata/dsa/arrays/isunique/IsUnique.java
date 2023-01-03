package com.matthewgitata.dsa.arrays.isunique;

/**
 * The {@code IsUnique} class contains method to check
 * if an array is unique or not.
 * <p>
 * Created by @matthewgitata on 03/01/2023
 */
public class IsUnique {
    /**
     * @param arr array of integers
     * @return true if elements are unique in the {@code arr}, otherwise false
     */
    public boolean isUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}