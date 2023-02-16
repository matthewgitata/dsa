package com.matthewgitata.dsa.divideandconquer.longestpalindromicsubsequence;

/**
 * The {@code LongestPalindromicSubsequence} class implements the
 * Longest Palindromic Subsequence problem.
 * <p>
 * created by @matthewgitata on 16/02/2023.
 */
public class LongestPalindromicSubsequence {
    /**
     * Longest Palindromic Subsequence Impl.
     *
     * @param st         the input String.
     * @param startIndex the start index.
     * @param endIndex   the end index.
     * @return the length of the lps.
     */
    private int findLPSLength(String st, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return 0;
        }
        if (startIndex == endIndex) {
            return 1;
        }
       int count1 = 0;
        if (st.charAt(startIndex) == st.charAt(endIndex)) {
            count1 = 2 + findLPSLength(st, startIndex + 1, endIndex - 1);
        }
        int count2 = findLPSLength(st, startIndex + 1, endIndex);
        int count3 = findLPSLength(st, startIndex, endIndex - 1);
        return Math.max(count1, Math.max(count2, count3));
    }

    /**
     * LPS Impl
     */
    public int findLPSLength(String st) {
        return findLPSLength(st, 0, st.length() - 1);
    }
}