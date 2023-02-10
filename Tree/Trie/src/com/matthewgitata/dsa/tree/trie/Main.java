package com.matthewgitata.dsa.tree.trie;

/**
 * The {@code Main} class contain methods where all operations
 * performed on a Trie are done.
 * <p>
 * created by @matthewgitata on 09/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        Trie newTrie = new Trie();
        newTrie.insert("API");
        newTrie.insert("APP");
        newTrie.insert("APIS");
    }
}