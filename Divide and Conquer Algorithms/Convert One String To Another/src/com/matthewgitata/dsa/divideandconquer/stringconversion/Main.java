package com.matthewgitata.dsa.divideandconquer.stringconversion;

/**
 * The {@code Main} class contains method which
 * all ConvertOneStringToAnother operations are performed.
 * <p>
 * created by @matthewgitata on 16/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        ConvertOneStringToAnother convertTo = new ConvertOneStringToAnother();
        System.out.println(convertTo.minOperations("Matthew", "Mathew"));
    }
}