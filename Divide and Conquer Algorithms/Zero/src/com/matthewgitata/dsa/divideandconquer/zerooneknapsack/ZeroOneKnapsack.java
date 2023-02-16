package com.matthewgitata.dsa.divideandconquer.zerooneknapsack;

/**
 * The {@code ZeroOneKnapsack} class contains operation to
 * solve the Zero One Knapsack problem.
 * <p>
 * created by @matthewgitata on 16/02/2023.
 */
public class ZeroOneKnapsack {
    /**
     * Zero One Knapsack solution.
     *
     * @param profits      the profits.
     * @param weights      the weights.
     * @param capacity     the capacity.
     * @param currentIndex the current index.
     * @retun the maximum profit.
     */
    private int knapSack(int[] profits, int[] weights, int capacity, int currentIndex) {
        if (capacity <= 0 || currentIndex < 0 || currentIndex >= profits.length) {
            return 0;
        }
        int profit1 = 0;
        if (weights[currentIndex] <= capacity) {
            profit1 = profits[currentIndex] + knapSack(profits, weights, capacity - weights[currentIndex], currentIndex + 1);
        }
        int profit2 = knapSack(profits, weights, capacity, currentIndex+1);
        return Math.max(profit1, profit2);
    }

    /**
     * @param profits
     * @param weights
     * @param capacity
     * @return max profit
     */
    public int knapSack(int[] profits, int[] weights, int capacity) {
        return this.knapSack(profits, weights, capacity, 1);
    }
}