package com.matthewgitata.dsa.tree.binarytree;

/**
 * The {@code BinaryTreeLL} class defines the properties of a BinaryTreeLL
 * and the accompanying operations including create, insert, delete,
 * search, traverse, and deleteTree.
 * <p>
 * created by @matthewgitata on 31/01/2023
 */
public class BinaryTreeLL {
    BinaryNode root;

    /**
     * Create a BinaryTreeLL.
     */
    public BinaryTreeLL() {
        this.root = null;
    }

    /**
     * PreOrder Traversal.
     *
     * @param node the root node
     */
    void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * InOrder Traversal.
     *
     * @param node the root node
     */
    void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }
}