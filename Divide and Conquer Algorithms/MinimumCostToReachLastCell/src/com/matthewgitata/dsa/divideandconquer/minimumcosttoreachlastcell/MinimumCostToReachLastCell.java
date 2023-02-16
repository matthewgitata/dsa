package com.matthewgitata.dsa.divideandconquer.minimumcosttoreachlastcell;

/**
 * The {@code MinimumCostToReachLastCell} class implements the
 * Minimum Cost To Reach Last Cell problem.
 * <p>
 * created by @matthewgitata on 17/02/2023.
 */
public class MinimumCostToReachLastCell {

    /**
     * Find minimum cost.
     *
     * @param cost the two-dimensional array with cost.
     * @param row  the row index.
     * @param col  the column index.
     * @return the minimum cost from first to last element.
     */
    public int findMinCost(int[][] cost, int row, int col) {
        if (row == -1 || col == -1) {
            return Integer.MAX_VALUE;
        }
        if (row == 0 && col == 0) {
            return cost[0][0];
        }
        int minCost1 = findMinCost(cost, row, col - 1);
        int minCost2 = findMinCost(cost, row - 1, col);
        int minCost = Integer.min(minCost1, minCost2);
        return minCost + cost[row][col];
    }
}