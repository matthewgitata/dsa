package com.matthewgitata.dsa.greedyalgorithms.coinchange;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The {@code CoinChange} class implements the
 * Coin Change Problem.
 * <p>
 * created by @matthewgitata on 16/02/2023.
 */
public class CoinChange {

    /**
     * Coin Change Algorithm.
     *
     * @param coins the array of the coins.
     * @param N     the total amount.
     */
    static void coinChangeProblem(int[] coins, int N) {
        Arrays.sort(coins);
        int index = coins.length - 1;
        while (true) {
            int coinValue = coins[index];
            index--;
            int maxAmount = (N / coinValue) * coinValue;
            if (maxAmount > 0) {
                System.out.println("Coin value: " + coinValue + " taken count: " + (N / coinValue));
                N = N - maxAmount;
            }
            if (N == 0) break;
        }
    }
}