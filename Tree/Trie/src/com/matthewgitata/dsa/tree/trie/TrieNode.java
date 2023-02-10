package com.matthewgitata.dsa.tree.trie;

import java.util.HashMap;
import java.util.Map;

/**
 * The {@code TrieNode} class defines the properties of a
 * TrieNode object.
 * <p>
 * created by @matthewgitata on 09/02/2023.
 */
public class TrieNode {
    Map<Character, TrieNode> children;
    boolean endOfString;

    /**
     * Create a TrieNode.
     */
    public TrieNode() {
        children = new HashMap<>();
        endOfString = false;
    }
}