package com.matthewgitata.dsa.arrays.tda;

import java.util.Arrays;

/**
 * created by @matthewgitata on 02/10/2023
 */

public class Main {
    public static void main(String[] args) {
        TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
        tda.insertValueInTheArray(0, 0, 3);
        tda.insertValueInTheArray(0, 1, 8);
        tda.insertValueInTheArray(1, 0, 5);
        tda.insertValueInTheArray(1, 1, 7);
        tda.insertValueInTheArray(2, 2, 5);
        System.out.println(Arrays.deepToString(tda.arr));
        System.out.println();

        // Accessing cell value from given array
        tda.accessCell(0, 0);

        // Traversing 2D Array
        System.out.println("\nTraversing the array.");
        tda.traverse2DArray();
        System.out.println();

        // Searching 2D Array
        tda.searchingValue(8);
        tda.searchingValue(13);
    }
}