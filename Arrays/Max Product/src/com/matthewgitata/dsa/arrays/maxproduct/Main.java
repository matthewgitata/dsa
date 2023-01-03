package com.matthewgitata.dsa.arrays.maxproduct;

/**
 * Finds maximum product of two integers in
 * an array with positive elements.
 * <p>
 * Created by @matthewgitata on 03/01/2023
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 7, 5};
        MaxProduct maxProduct = new MaxProduct();
        System.out.println(maxProduct.findMaxProduct(arr));
    }
}