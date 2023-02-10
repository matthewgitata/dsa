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
        System.out.println("Trie Insertion.");
        newTrie.insert("APIS");
        newTrie.insert("APP");
        System.out.println("Trie Search");
        newTrie.search("APP");
        newTrie.search("APIS");
        newTrie.search("API");
        System.out.println("Trie String Deletion");
        newTrie.delete("APIS");
        newTrie.search("APIS");
    }
}