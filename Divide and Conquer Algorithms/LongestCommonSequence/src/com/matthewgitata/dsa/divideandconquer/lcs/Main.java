package com.matthewgitata.dsa.divideandconquer.lcs;

/**
 * The {@code Main} class contains the method where
 * Long Common Subsequence operations are performed.
 * <p>
 * created by @matthewgitata on 16/01/2023.
 */
public class Main {
    public static void main(String[] args) {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        System.out.println(lcs.findCSLength("elephant", "erepat"));
    }
}