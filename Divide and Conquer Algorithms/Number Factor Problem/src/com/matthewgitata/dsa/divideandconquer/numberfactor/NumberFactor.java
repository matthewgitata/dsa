package com.matthewgitata.dsa.divideandconquer.numberfactor;

/**
 * The {@code NumberFactor} class contains method
 * that solves the Number Factor problem.
 * <p>
 * created by @matthewgitata on 16/02/2023.
 */
public class NumberFactor {

    /**
     * Solves Number Factor Problem.
     *
     * @param n the given number.
     * @return number of ways to express {@code n} as a sum of 1,3 and 4.
     */
    public int waysToGetN(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        } else {
            return waysToGetN(n - 1) + waysToGetN(n - 3) + waysToGetN(n - 4);
        }
    }
}