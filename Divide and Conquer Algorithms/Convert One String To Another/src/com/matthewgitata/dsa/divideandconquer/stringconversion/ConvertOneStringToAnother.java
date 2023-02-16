package com.matthewgitata.dsa.divideandconquer.stringconversion;

/**
 * The {@code ConvertOneStringToAnother} class contains method in which
 * converts one String to another.
 * <p>
 * created by @matthewgitata on 16/02/2023.
 */
public class ConvertOneStringToAnother {
    /**
     * Find minimum operations.
     *
     * @param s1 the String to convert to.
     * @param s2 the String to convert to {@code s1}.
     * @param i1 the first index.
     * @param i2 the first index.
     * @return the number of operation to convert s1 to s2.
     */
    private int findMinOperations(String s1, String s2, int i1, int i2) {
        if (i1 == s1.length()) {
            return s2.length() - i2;
        }
        if (i2 == s2.length()) {
            return s1.length() - i1;
        }
        if (s1.charAt(i1) == s2.charAt(i2)) {
            return findMinOperations(s1, s2, i1 + 1, i2 + 1);
        }
        int deleteOp = 1 + findMinOperations(s1, s2, i1 + 1, i2);
        int insertOp = 1 + findMinOperations(s1, s2, i1, i2 + 1);
        int replaceOp = 1 + findMinOperations(s1, s2, i1 + 1, i2 + 1);
        return Math.min(deleteOp, Math.min(insertOp, replaceOp));
    }

    /**
     * Global Method.
     */
    public int minOperations(String s1, String s2) {
        return findMinOperations(s1, s2, 0, 0);
    }
}