package com.matthewgitata.dsa.greedyalgorithms.fractionalknapsackproblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * The {@code FractionalKnapsack} class solves the
 * Fractional Knapsack Problem.
 * <p>
 * created by @matthewgitata on 16/02/2023.
 */
public class FractionalKnapsack {
    /**
     * Fractional Knapsack.
     *
     * @param knapsackItems list of knapsack items.
     * @param capacity      the capacity.
     */
    static void knapsack(ArrayList<KnapsackItem> knapsackItems, int capacity) {
        Comparator<KnapsackItem> knapsackItemComparator = new Comparator<KnapsackItem>() {
            @Override
            public int compare(KnapsackItem o1, KnapsackItem o2) {
                if (o2.getRatio() > o1.getRatio()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(knapsackItems, knapsackItemComparator);
        int usedCapacity = 0;
        double totalValue = 0;

        for (KnapsackItem item : knapsackItems) {
            if (usedCapacity + item.getWeight() <= capacity) {
                usedCapacity += item.getWeight();
                System.out.println("Taken: " + item);
                totalValue += item.getValue();
            } else {
                int usedWeight = capacity - usedCapacity;
                double value = item.getRatio() * usedWeight;
                System.out.println("Taken: item index = " + item.getIndex() + " obtained value = " + value + ", " +
                        "used weight = " + usedWeight + ", ratio = " + item.getRatio());
                usedCapacity += usedWeight;
                totalValue += value;
            }
            if (usedCapacity == capacity) {
                break;
            }
        }
        System.out.println("Total value obtained: " + totalValue);
    }
}