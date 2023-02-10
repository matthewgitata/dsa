package com.matthewgitata.dsa.tree.trie;

/**
 * The {@code Trie} class defines the properties of a Trie object and
 * its operations including creation, insertion, search, and delete.
 * <p>
 * created by @matthewgitata on 09/02/2023.
 */
public class Trie {
    private TrieNode root;

    /**
     * Create a Trie.
     */
    public Trie() {
        root = new TrieNode();
        System.out.println("The Trie has been created.");
    }

    /**
     * Insert to Trie.
     *
     * @param word word to insert to Trie.
     */
    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfString = true;
        System.out.println("Successfully inserted " + word + " in Trie.");
    }

    /**
     * Search in Trie.
     *
     * @param word String to search for.
     * @return true if {@code word} exists in Trie, otherwise false.
     */
    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                System.out.println("Word " + word + " does not exist in Trie");
                return false;
            }
            current = node;
        }
        if (current.endOfString == true) {
            System.out.println("Word " + word + " exists in Trie");
            return true;
        } else {
            System.out.println("Word " + word + " does not exist in Trie. But it's a prefix of another String.");
        }
        return current.endOfString;
    }
}