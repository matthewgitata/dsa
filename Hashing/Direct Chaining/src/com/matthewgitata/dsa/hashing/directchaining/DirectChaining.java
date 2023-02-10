package com.matthewgitata.dsa.hashing.directchaining;

import java.util.LinkedList;

/**
 * The {@code DirectChaining} class defines the properties of a DirectChaining
 * object and operations it contains including insertion, searching, and
 * delete.
 * <p>
 * created by @matthewgitata on 10/02/2023.
 */
public class DirectChaining {
    LinkedList<String>[] hashTable;
    int maxChainSize = 5;

    /**
     * Create the hash table.
     *
     * @param size fixed size of hash table
     */
    DirectChaining(int size) {
        hashTable = new LinkedList[size];
    }

    /**
     * Hash function.
     *
     * @param word the string to insert
     * @param M    the  number of cells in array.
     * @return index to insert {@code word} in the hash table.
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
     * Insert key in hash table.
     *
     * @param word the string to insert
     */
    public void insertHashTable(String word) {
        int newIndex = modASCIIHashFunction(word, hashTable.length);
        if (hashTable[newIndex] == null) {
            hashTable[newIndex] = new LinkedList<>();
            hashTable[newIndex].add(word);
        } else {
            hashTable[newIndex].add(word);
        }
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