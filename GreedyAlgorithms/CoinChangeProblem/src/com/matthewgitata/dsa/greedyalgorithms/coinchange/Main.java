package com.matthewgitata.dsa.greedyalgorithms.coinchange;

import java.util.Arrays;

/**
 * The {@code Main} class contains method where
 * CoinChangeProblem operations are performed.
 * <p>
 * created by @matthewgitata on 16/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        int[] coins = {1, 2, 4, 5, 10, 20, 1000};
        int amount = 2035;
        System.out.println("Coins available: " + Arrays.toString(coins));
        System.out.println("Target amount: " + amount);
        CoinChange.coinChangeProblem(coins, amount);
    }
}