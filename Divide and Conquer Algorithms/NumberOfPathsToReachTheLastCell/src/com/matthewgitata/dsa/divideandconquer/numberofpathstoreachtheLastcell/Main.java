package com.matthewgitata.dsa.divideandconquer.numberofpathstoreachtheLastcell;

/**
 * The {@code Main} class contains method in which
 * NumberOfPathsToReachTheLastCell operations are performed.
 * <p>
 * created by @matthewgitata on 17/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        int[][] arr =
                {
                        {4, 7, 1, 6},
                        {5, 7, 3, 9},
                        {3, 2, 1, 2},
                        {7, 1, 6, 3},
                };
        int cost = 25;

        NumberOfPathsToReachTheLastCell nop = new NumberOfPathsToReachTheLastCell();
        System.out.println(nop.numberOfPaths(arr, arr.length-1, arr[0].length-1, cost));
    }
}