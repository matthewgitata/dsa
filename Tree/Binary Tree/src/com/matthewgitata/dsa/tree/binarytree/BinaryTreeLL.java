package com.matthewgitata.dsa.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

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

    /**
     * PostOrder Traversal.
     *
     * @param node the root node
     */
    void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    /**
     * LevelOrder Traversal.
     */
    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }

    }

    /**
     * Searches for a node in a BinaryTree.
     *
     * @param value the node's value being searched for.
     */
    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                System.out.println("The value " + value + " is found in Tree.");
                return;
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The value " + value + " is not found in Tree");
    }
}