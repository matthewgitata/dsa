package com.matthewgitata.dsa.tree.avl;

import java.util.LinkedList;
import java.util.Queue;

/**
 * The {@code AVL} class defines the properties of an AVL object and
 * its accompanying operations including creation, search, traversal,
 * insertion, node deletion and AVL Tree deletion.
 * <p>
 * created by @matthewgitata on 08/02/2023.
 */
public class AVL {
    BinaryNode root;

    /**
     * Initializes root; Creates AVL Tree.
     */
    public AVL() {
        this.root = null;
    }

    /**
     * PreOrder Traversal.
     *
     * @param node the root node
     */
    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * InOrder Traversal.
     *
     * @param node the root node
     */
    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.value + " ");
        inOrder(node.right);
    }

    /**
     * PostOrder Traversal.
     *
     * @param node the root node
     */
    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " ");
    }

    /**
     * LevelOrder Traversal.
     */
    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.value);
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    /**
     * Search for a node.
     *
     * @param node the root node.
     * @value value we are searching for.
     */
    public void search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value " + value + " is not found in BST!");
        }
        if (node.value == value) {
            System.out.println("Value " + value + " is found in BST!");
        } else if (value < node.value) {
            search(node.left, value);
        } else {
            search(node.right, value);
        }
    }
}