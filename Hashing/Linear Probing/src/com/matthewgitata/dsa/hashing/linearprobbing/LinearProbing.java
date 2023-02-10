package com.matthewgitata.dsa.hashing.linearprobbing;

import java.util.ArrayList;

/**
 * The {@code LinearProbing} class defines a LinearProbing objects and
 * its operations.
 * <p>
 * created by @matthewgitata on 10/02/2023.
 */
public class LinearProbing {
    String[] hashtable;
    int usedCellNumber;

    /**
     * Create Hash Table.
     */
    public LinearProbing(int size) {
        hashtable = new String[size];
        usedCellNumber = 0;
    }

    /**
     * Hash function to find index.
     *
     * @param word the string to hash
     * @param M    the index value hashed
     */
    public int modASCIIHashFunction(String word, int M) {
        char[] ch;
        ch = word.toCharArray();
        int i, sum;
        for (i = 0, sum = 0; i < word.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    /**
     * Get load factor.
     *
     * @return the double type of number.
     */
    public double getLoadFactor() {
        double loadFactor = usedCellNumber * 1.0 / hashtable.length;
        return loadFactor;
    }

    /**
     * Rehashing method.
     *
     * @param word the string to rehash.
     */
    public void rehashKeys(String word) {
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<>();
        for (String s : hashtable) {
            if (s != null) {
                data.add(s);
            }
            data.add(word);
            hashtable = new String[hashtable.length * 2];
            for (String z : data) {
                insertInHashTable(s);
            }
        }
    }

    /**
     * Insert in Hash Table.
     *
     * @param word the string value to insert
     */
    public void insertInHashTable(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(word);
        } else {
            int index = modASCIIHashFunction(word, hashtable.length);
            for (int i = index; i < index + hashtable.length; i++) {
                int newIndex = i % hashtable.length;
                if (hashtable[newIndex] == null) {
                    hashtable[newIndex] = word;
                    System.out.println("The " + word + " successfully inserted at location: " + newIndex);
                    break;
                } else {
                    System.out.println(newIndex + " is already occupied. Trying next empty cell.");
                }
            }
        }
        usedCellNumber++;
    }

    /**
     * Display hash table.
     */
    public void displayHashTable() {
        if (hashtable == null) {
            System.out.println("HashTable does not exist.");
        } else {
            System.out.println("-----------------------Hash Table-----------------------");
            for (int i = 0; i < hashtable.length; i++) {
                System.out.println("Index " + i + ", key " + hashtable[i]);
            }
        }
    }

    /**
     * Search
     *
     * @param word the string to search
     * @return true if {@code word} exists in HashTable, otherwise false.
     */
    public boolean searchHashTable(String word) {
        int index = modASCIIHashFunction(word, hashtable.length);
        for (int i = index; i < index + hashtable.length; i++) {
            int newIndex = i % hashtable.length;
            if (hashtable[newIndex] != null && hashtable[newIndex].equals(word)) {
                System.out.println(word + " found at location: " + newIndex);
                return true;
            }
        }
        System.out.println(word + " not found in HashTable.");
        return false;
    }

    /**
     * Delete
     *
     * @param word the word to delete.
     */
    public void deleteKeyHashTable(String word) {
        int index = modASCIIHashFunction(word, hashtable.length);
        for (int i = index; i < index + hashtable.length; i++) {
            int newIndex = i % hashtable.length;
            if (hashtable[newIndex] != null && hashtable[newIndex].equals(word)) {
                hashtable[newIndex] = null;
                System.out.println(word + " has been deleted from HashTable.");
                return;
            }
        }
        System.out.println(word + " not found in HashTable");
    }

}