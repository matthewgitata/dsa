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
        linearProbing.insertInHashTable("black");
        linearProbing.insertInHashTable("fox");
        linearProbing.insertInHashTable("over");
        System.out.println("Search Hash Table");
        linearProbing.searchHashTable("fox");
        linearProbing.searchHashTable("ox");
        System.out.println("Display Hash Table");
        linearProbing.displayHashTable();
        System.out.println("Delete Key Hash Table");
        linearProbing.deleteKeyHashTable("over");
        linearProbing.deleteKeyHashTable("fox");
        System.out.println("Display Hash Table");
        linearProbing.displayHashTable();
    }
}