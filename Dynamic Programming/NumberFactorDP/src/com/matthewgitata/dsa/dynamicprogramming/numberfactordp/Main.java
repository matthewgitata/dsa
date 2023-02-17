package com.matthewgitata.dsa.dynamicprogramming.numberfactordp;

/**
 * The {@code NumberFactor} class contains method in
 * which NumberFactor operations are performed.
 * <p>
 * created by @matthewgitata on 17/01/2023.
 */
public class Main {
    public static void main(String[] args) {
        NumberFactor nf = new NumberFactor();
        System.out.println(nf.waysToGetNTopDown(8));
        System.out.println(nf.waysToGetNBottomUp(8));
    }
}