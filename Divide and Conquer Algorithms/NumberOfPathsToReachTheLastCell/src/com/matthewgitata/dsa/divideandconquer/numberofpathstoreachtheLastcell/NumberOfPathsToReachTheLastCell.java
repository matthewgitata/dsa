package com.matthewgitata.dsa.divideandconquer.numberofpathstoreachtheLastcell;

/**
 * The {@code NumberOfPathsToReachTheLastCell} class defines method for solving
 * the Number Of Paths To Reach The Last Cell problem.
 * <p>
 * created by @matthewgitata on 17/02/2023.
 */
public class NumberOfPathsToReachTheLastCell {
    /**
     * Get the number of paths.
     *
     * @param arr  the array.
     * @param row  the row index.
     * @param col  the column index.
     * @param cost the assigned cost.
     */
    public int numberOfPaths(int[][] arr, int row, int col, int cost) {
        if (cost < 0) {
            return 0;
        }
        if (row == 0 && col == 0) {
            return (arr[0][0] - cost == 0) ? 1 : 0;
        }
        if (row == 0) {
            return numberOfPaths(arr, 0, col - 1, cost - arr[row][col]);
        }
        if (col == 0) {
            return numberOfPaths(arr, row - 1, col, cost - arr[row][col]);
        }
        int numOfPathsFromPreviousRow = numberOfPaths(arr, row - 1, col, cost - arr[row][col]);
        int numOfPathsFromPreviousCol = numberOfPaths(arr, row, col - 1, cost - arr[row][col]);
        return numOfPathsFromPreviousCol + numOfPathsFromPreviousRow;
    }
}