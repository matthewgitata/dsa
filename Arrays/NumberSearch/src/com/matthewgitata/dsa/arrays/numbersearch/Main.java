package com.matthewgitata.dsa.arrays.numbersearch;

/**
 * Checks if an array contains a certain number.
 * <p>
 * created by @matthewgitata on 03/01/2023
 */
public class Main {
    public static void main(String[] args) {
        int[] numArray = {3, 8, 5, 7, 5};
        NumberSearch numberSearch = new NumberSearch();
        System.out.println(numberSearch.searchForValue(numArray, 8));
        System.out.println(numberSearch.searchForValue(numArray, 7));
        System.out.println(numberSearch.searchForValue(numArray, 16));
    }
}