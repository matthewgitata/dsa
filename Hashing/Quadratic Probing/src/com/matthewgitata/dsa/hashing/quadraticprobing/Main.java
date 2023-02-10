package com.matthewgitata.dsa.hashing.quadraticprobing;

/**
 * The {@code Main} class contains method where all QuadraticProbing
 * operations are performed.
 * <p>
 * created by @matthewgitata on 10/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        QuadraticProbing quadraticProbing = new QuadraticProbing(13);
        quadraticProbing.insertKeyInHashTable("The");
        quadraticProbing.insertKeyInHashTable("quick");
        quadraticProbing.insertKeyInHashTable("black");
        quadraticProbing.insertKeyInHashTable("fox");
        quadraticProbing.insertKeyInHashTable("over");
        System.out.println("Display Hash Table");
        quadraticProbing.displayHashTable();
    }
}