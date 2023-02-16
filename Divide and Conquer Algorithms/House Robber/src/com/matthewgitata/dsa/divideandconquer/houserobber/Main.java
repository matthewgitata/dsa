package com.matthewgitata.dsa.divideandconquer.houserobber;

/**
 * The {@code House Robber} class contains method
 * where HouseRobber operation is performed.
 * <p>
 * created by @matthewgitata on 16/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        int[] houseNetWorth = {6, 7, 1, 30, 8, 2, 4};
        System.out.println(houseRobber.maxMoney(houseNetWorth));
    }
}