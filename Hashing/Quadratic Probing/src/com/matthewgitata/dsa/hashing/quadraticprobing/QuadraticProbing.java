package com.matthewgitata.dsa.hashing.quadraticprobing;

import java.util.ArrayList;

/**
 * The {@code QuadraticProbing} class defines the properties of a QuadraticProbing object
 * and the functions for its various operations.
 * <p>
 * created by @matthewgitata on 10/02/2023.
 */
public class QuadraticProbing {
    String[] hashTable;
    int usedCellNumber;

    /**
     * Constructor.
     */
    public QuadraticProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    /**
     * HashFunction to be used on keys.
     */
    public int modASCIIHashFunction(String word, int M) {
        char[] ch;
        ch = word.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < word.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    /**
     * Return load factor of HashTable.
     */
    public double getLoadFactor() {
        return usedCellNumber * 1.0 / hashTable.length;
    }

    /**
     * ReHash keys
     */
    public void rehashKeys(String newStringToBeInserted) {
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<>();
        for (String s : hashTable) {
            if (s != null) {
                data.add(s);
            }
            data.add(newStringToBeInserted);
            hashTable = new String[hashTable.length * 2];
            for (String z : data) {
                insertKeyInHashTable(z);
            }
        }
    }

    /**
     * Insert Key in HashTable
     */
    public void insertKeyInHashTable(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(word);
        } else {
            int index = modASCIIHashFunction(word, hashTable.length);
            int counter = 0;
            for (int i = 0; i < index + hashTable.length; i++) {
                int newIndex = index + (counter * counter) % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = word;
                    System.out.println(word + " has been inserted successfully.");
                    break;
                } else {
                    System.out.println("New index is already occupied. Trying next one...");
                }
                counter++;
            }
        }
        usedCellNumber++;
    }

    /**
     * Display hash table.
     */
    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("HashTable does not exist.");
        } else {
            System.out.println("-----------------------Hash Table-----------------------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index " + i + ", key " + hashTable[i]);
            }
        }
    }
}