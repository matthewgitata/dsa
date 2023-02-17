package com.matthewgitata.dsa.dynamicprogramming.numberfactordp;

/**
 * The {@code NumberFactor} class implements the NumberFactor
 * problem by using the Dynamic Programming top-down
 * alias memoization and bottom-up approaches.
 * <p>
 * created by @matthewgitata on 17/02/2023.
 */
public class NumberFactor {
    /**
     * Top-down approach
     *
     * @param dp the array to save calculated sub-problems
     * @param n  the number to find ways for.
     * @return number of ways to express {@code n} as sum of 1,3,4.
     */
    private int waysToGetNTopDown(int[] dp, int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        if (dp[n] == 0) {
            int sp1 = waysToGetNTopDown(dp, n - 1);
            int sp2 = waysToGetNTopDown(dp, n - 3);
            int sp3 = waysToGetNTopDown(dp, n - 4);
            dp[n] = sp1 + sp2 + sp3;
        }
        return dp[n];
    }

    /**
     * Top down
     */
    public int waysToGetNTopDown(int n) {
        int[] dp = new int[n + 1];
        return waysToGetNTopDown(dp, n);
    }

    /**
     * Bottom-up approach.
     *
     * @param n the number to find ways for.
     * @return number of ways to express {@code n} as sum of 1,3,4.
     */
    public int waysToGetNBottomUp(int n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 3] + dp[i - 4];
        }
        return dp[n];
    }
}