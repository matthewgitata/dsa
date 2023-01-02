package com.matthewgitata.dsa.arrays.arrayinsertion;

/**
 * created by @matthewgitata on 02/01/2023
 */

public class SingleDimensionalArray {
    int[] arr = null;

    public SingleDimensionalArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // Array Insertion
    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted.");
            } else {
                System.out.println("This cell is already occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access an array.");
        }
    }

    // Array Traversal
    public void traverseArray() {
        try {
            for (int index = 0; index < arr.length; index++) {
                System.out.print(arr[index] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }

}