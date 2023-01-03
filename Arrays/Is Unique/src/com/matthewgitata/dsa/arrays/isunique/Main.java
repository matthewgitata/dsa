package com.matthewgitata.dsa.arrays.isunique;

/**
 * Checks if an array is unique or not.
 * <p>
 * created by @matthewgitata on 03/01/2023
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 7, 5};
        int[] arr2 = {20, 10, 30, 50, 40, 60};
        IsUnique isUnique = new IsUnique();
        System.out.println(isUnique.isUnique(arr));
        System.out.println(isUnique.isUnique(arr2));
    }
}
