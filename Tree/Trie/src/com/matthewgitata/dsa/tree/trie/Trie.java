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
}