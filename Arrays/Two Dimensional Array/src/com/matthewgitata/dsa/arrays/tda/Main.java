package com.matthewgitata.dsa.arrays.tda;

import java.util.Arrays;

/**
 * created by @matthewgitata on 02/10/2023
 */

public class Main {
    public static void main(String[] args) {
        TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
        tda.insertValueInTheArray(0, 0, 3);
        tda.insertValueInTheArray(0, 0, 3);
        System.out.println(Arrays.deepToString(tda.arr));
    }
}