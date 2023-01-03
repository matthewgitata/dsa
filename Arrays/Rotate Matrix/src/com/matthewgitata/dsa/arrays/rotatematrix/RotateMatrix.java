package com.matthewgitata.dsa.arrays.rotatematrix;

/**
 * The {@code RotateMatrix} class contains a method to
 * rotate an image represented by an N * N  matrix
 * by 90 degrees (clockwise).
 * <p>
 * created by @matthewgitata
 */
public class RotateMatrix {
    /**
     * Rotates an image represented by an N * N  matrix
     * by 90 degrees (clockwise).
     *
     * @param matrix matrix to be rotated
     * @return {@code matrix} rotated by 90 degrees (clockwise.)
     */
    public boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return false;
        }
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return true;
    }
}