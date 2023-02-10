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
}