package com.matthewgitata.dsa.arrays.sda;

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

    // Search for an element
    public void searchInArray(int valueToSearch) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == valueToSearch) {
                System.out.println("Element exists at index " + index + ".");
                return;
            }
        }
        System.out.println(valueToSearch + " is not found.");
    }

    // Delete value from array
    public void deleteValue(int valueToDeleteIndex) {
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully.");
        } catch (
                ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of the array.");
        }
    }

}