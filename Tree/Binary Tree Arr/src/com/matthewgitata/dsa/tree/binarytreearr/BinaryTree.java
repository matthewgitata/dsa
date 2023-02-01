package com.matthewgitata.dsa.tree.binarytreearr;

/**
 * The {@code BinaryTree} class contains defines the properties of a BinaryTree
 * object and the accompanying operations icluding create, insert, traverse, search,
 * and delete.
 * <p>
 * created by @matthewgitata on 01/02/2023.
 */
public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    /**
     * Initialize arr; Create BinaryTree
     *
     * @param size size of the array holding BT.
     */
    public BinaryTree(int size) {
        arr = new String[size + 1];
        lastUsedIndex = 0;
        System.out.println("Blank Tree of size " + size + " has been created.");
    }
}