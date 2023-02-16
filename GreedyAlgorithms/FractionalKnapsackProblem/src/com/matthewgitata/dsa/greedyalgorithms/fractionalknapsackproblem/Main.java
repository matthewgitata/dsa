package com.matthewgitata.dsa.greedyalgorithms.fractionalknapsackproblem;

import java.util.ArrayList;

/**
 * The {@code Main} class contains main method
 * where all FractionalKnapsackProblem operations
 * are performed.
 * <p>
 * created by @matthewgitata on 16/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<KnapsackItem> knapsackItems = new ArrayList<>();
        int[] value = {100, 120, 60};
        int[] weight = {20, 30, 10};
        int capacity = 50;
        for (int i = 0; i < value.length; i++) {
            knapsackItems.add(new KnapsackItem(i + 1, value[i], weight[i]));
        }

        FractionalKnapsack.knapsack(knapsackItems, capacity);
    }
}