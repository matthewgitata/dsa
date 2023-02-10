package com.matthewgitata.dsa.hashing.linearprobbing;

/**
 * The {@code Main} class contains method where all operation done on
 * LinearProbing object are done.
 * <p>
 * created by @matthewgitata on 10/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        LinearProbing linearProbing = new LinearProbing(14);
        linearProbing.insertInHashTable("The");
        linearProbing.insertInHashTable("quick");
        linearProbing.insertInHashTable("brown");
        linearProbing.insertInHashTable("fox");
        linearProbing.insertInHashTable("over");
        linearProbing.displayHashTable();
    }
}