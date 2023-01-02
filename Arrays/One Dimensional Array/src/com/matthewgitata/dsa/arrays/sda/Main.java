package com.matthewgitata.dsa.arrays.sda;

/**
 * created by @matthewgitata on 02/01/2023
 */

public class Main {
    public static void main(String[] args) {
        // Create SDA Instance
        SingleDimensionalArray sda = new SingleDimensionalArray(10);

        // Insert elements into the array
        sda.insert(0, 28);
        sda.insert(3, 8);
        sda.insert(5, 7);
        sda.insert(5, 5);
        sda.insert(12, 120);

        // Access array elements
        System.out.println("\nArray access");
        var firstElement = sda.arr[0];
        System.out.println("First element: " + firstElement);
        var fourthElement = sda.arr[3];
        System.out.println("Fourth element: " + fourthElement);

        // Traverse array
        System.out.println("\nArray traversal.");
        sda.traverseArray();
        System.out.println();

        // Search for array element
        System.out.println("\nSearch for Array element");
        sda.searchInArray(8);
        sda.searchInArray(75);

        // Delete value from array
        System.out.println("\nDelete value from array");
        sda.deleteValue(3);
        sda.searchInArray(8);
    }
}