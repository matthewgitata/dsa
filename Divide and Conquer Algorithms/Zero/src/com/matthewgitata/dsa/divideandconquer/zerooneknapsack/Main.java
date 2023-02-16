package com.matthewgitata.dsa.divideandconquer.zerooneknapsack;

/**
 * The {@code Main} class contains method where
 * ZeroOneKnapsack operations are performed.
 * <p>
 * created by @matthewgitata on 16/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        ZeroOneKnapsack zok = new ZeroOneKnapsack();
        int[] profits = {31, 26, 17, 72};
        int[] weights = {3, 1, 2, 5};
        int maxProfit = zok.knapSack(profits, weights, 7);
        System.out.println(maxProfit);
    }
}