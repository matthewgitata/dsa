package com.matthewgitata.dsa.divideandconquer.houserobber;

/**
 * The {@code HouseRobber} class contains method solving
 * the House Robber problem.
 * <p>
 * created by @matthewgitata on 16/02/2023.
 */
public class HouseRobber {

    /**
     * House Robber Solution.
     *
     * @param houseNetWorth the net worth of the houses.
     * @param currentIndex  the current index.
     * @return
     */
    private int maxMoneyRecursive(int[] houseNetWorth, int currentIndex) {
        if (currentIndex >= houseNetWorth.length) {
            return 0;
        }

        int stealCurrentHouse = houseNetWorth[currentIndex] + maxMoneyRecursive(houseNetWorth, currentIndex + 2);
        int skipCurrentHouse = maxMoneyRecursive(houseNetWorth, currentIndex + 1);
        return Math.max(stealCurrentHouse, skipCurrentHouse);
    }

    /**
     * Global Solution for the HRP.
     *
     * @param houseNetWorth the net worth of the houses.
     */
    public int maxMoney(int[] houseNetWorth) {
        return maxMoneyRecursive(houseNetWorth, 0);
    }
}