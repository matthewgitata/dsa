package com.matthewgitata.dsa.arrays.tda;

/**
 * created by @matthewgitata on 02/10/2023
 */

public class TwoDimensionalArray {
    int[][] arr = null;

    // Constructor
    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[0].length; column++) {
                arr[row][column] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in the Array
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("The value is successfully inserted.");
            } else {
                System.out.println("This cell is already occupied.");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array.");
        }
    }

    // Accessing cell value from given array
    public void accessCell(int row, int col) {
        System.out.println("Accessing Row#: " + row + ", Col# " + col);
        try {
            System.out.println("Cell value is " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array.");
        }
    }
}
