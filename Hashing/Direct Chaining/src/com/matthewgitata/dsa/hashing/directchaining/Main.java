package com.matthewgitata.dsa.hashing.directchaining;

/**
 * The {@code Main} class contains method which all operations
 * on com.matthewgitata.dsa.hashing.directchaining.DirectChaining can be performed.
 * <p>
 * created by @matthewgitata on 10/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(15);
        directChaining.insertHashTable("The");
        directChaining.insertHashTable("quick");
        directChaining.insertHashTable("brown");
        directChaining.insertHashTable("fox");
        directChaining.insertHashTable("over");
        System.out.println("Display HashTable");
        directChaining.displayHashTable();
        System.out.println("Search in HashTable");
        directChaining.searchHashTable("fox");
        directChaining.searchHashTable("ox");
        System.out.println("Delete in HashTable");
        directChaining.deleteKeyHashTable("brown");
        directChaining.deleteKeyHashTable("ox");
        System.out.println("Display HashTable");
        directChaining.displayHashTable();
    }
}