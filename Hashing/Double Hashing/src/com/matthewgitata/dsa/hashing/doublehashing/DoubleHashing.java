package com.matthewgitata.dsa.hashing.doublehashing;

import java.util.ArrayList;

public class DoubleHashing {
    String[] hashTable;
    int noOfCellsUsedInHashTable;

    /**
     * Constructor.
     */
    public DoubleHashing(int size) {
        hashTable = new String[size];
        noOfCellsUsedInHashTable = 0;
    }

    /**
     * HashFunction to be used on keys.
     */
    public int simpleASCIIHashFunction(String word, int M) {
        char[] ch;
        ch = word.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < word.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    /**
     * ReHash keys
     */
    public void rehashKeys(String newStringToBeInserted) {
        noOfCellsUsedInHashTable = 0;
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

    /**
     * Adds all digits together.
     */
    private int addAllDigitsTogether(int sum) {
        int value = 0;
        while (sum > 0) {
            value = sum % 10;
            sum = sum / 10;
        }
        return value;
    }

    /**
     * Second hashing function.
     */
    public int secondHashFunction(String x, int M) {
        char[] ch;
        ch = x.toCharArray();
        int i, sum;
        for (i = 0, sum = 0; i < x.length(); i++) {
            sum = sum + ch[i];
        }
        while (sum > hashTable.length) {
            sum = addAllDigitsTogether(sum);
        }
        return sum % M;
    }

    /**
     * get load factor
     */
    public double getLoadFactor() {
        return noOfCellsUsedInHashTable * 1.0/hashTable.length;
    }

    /**
     * Insert Key
     */
    public void insertKeyInHashTable(String value) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(value);
        } else {
            int x = simpleASCIIHashFunction(value, hashTable.length);
            int y = secondHashFunction(value, hashTable.length);
            for (int i = 0; i < hashTable.length; i++) {
                int newIndex = (x + i * y) % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = value;
                    System.out.println(value + " inserted at location: " + newIndex);
                    break;
                } else {
                    System.out.println(newIndex + " is occupied. Trying next index..");
                }
            }
        }
        noOfCellsUsedInHashTable++;
    }

}
