package com.matthewgitata.dsa.tree.avl;

/**
 * The {@code BinaryNode} class defines the properties of a
 * BinaryNode object.
 * <p>
 * created by @matthewgitata on 08/02/2023.
 */
public class BinaryNode {
    public int value;
    public int height;
    public BinaryNode left;
    public BinaryNode right;

    /**
     * Initialize height of new node to 0.
     */
    public BinaryNode() {
        this.height = 0;
    }
}