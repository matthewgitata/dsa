package com.matthewgitata.dsa.arrays.permutation;

/**
 * Checks whether two arrays are permutations of each other.
 * <p>
 * Created by @matthewgitata on 03/01/2023
 */
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 5, 6};
        int[] arr2 = {3, 8, 5, 7, 5};
        int[] arr3 = {1, 3, 2, 5, 6};
        PermutationCheck permutationCheck = new PermutationCheck();
        System.out.println(permutationCheck.isPermutationOfUsingSumAndProduct(arr1, arr2));
        System.out.println(permutationCheck.isPermutationOf(arr1, arr3));
    }
}
