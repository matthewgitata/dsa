package com.matthewgitata.dsa.hashing.doublehashing;

/**
 * The {@code Main} class contains method where all operations
 * performed on a DoubleHashing object.
 * <p>
 * created by @matthewgitata on 10/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        DoubleHashing doubleHashing = new DoubleHashing(14);
        doubleHashing.insertKeyInHashTable("The");
        doubleHashing.insertKeyInHashTable("quick");
        doubleHashing.insertKeyInHashTable("black");
        doubleHashing.insertKeyInHashTable("fox");
        doubleHashing.insertKeyInHashTable("over");
        System.out.println("Display Hash Table");
        doubleHashing.displayHashTable();
    }
}