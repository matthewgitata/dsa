package com.matthewgitata.dsa.divideandconquer.numberfactor;

/**
 * The {@code Main} class contains method where
 * NumberFactor operations are done.
 * <p>
 * created by @matthewgitata on 16/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        NumberFactor numberFactor = new NumberFactor();
        System.out.println(numberFactor.waysToGetN(5));
        System.out.println(numberFactor.waysToGetN(18));
    }
}