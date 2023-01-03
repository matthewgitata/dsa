package com.matthewgitata.dsa.arrays.rotatematrix;

import java.util.Arrays;

/**
 * Rotates image by 90 degrees (clockwise).
 * <p>
 * created by @matthewgitata
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RotateMatrix rotateMatrix = new RotateMatrix();
        System.out.println(rotateMatrix.rotateMatrix(matrix));
        System.out.println(Arrays.deepToString(matrix));
    }
}