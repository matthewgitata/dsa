package com.matthewgitata.dsa.tree.bst;

import java.util.LinkedList;
import java.util.Queue;

/**
 * The {@code BinarySearchTree} class defines the properties of a
 * BinarySearchTree object as well as the accompanying functions that
 * can be performed on it including creation, insertion, node deletion,
 * search, traversal and BST deletion.
 * <p>
 * created by @matthewgitata on 08/02/2023.
 */
public class BinarySearchTree {
    BinaryNode root;

    /**
     * Initiates root; Creates BinarySearchTree, BST.
     */
    public BinarySearchTree() {
        this.root = null;
    }

    /**
     * Inserts a node to the BST.
     *
     * @param currentNode the current node.
     * @param value     node value to be inserted.
     * @return the root node.
     */
    private BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("The value successfully inserted.");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            return currentNode;

        }
    }

    /**
     * Insert root node.
     * @param value value of node to be inserted.
     */
    void insert(int value) {
        insert(this.root, value);
    }
}