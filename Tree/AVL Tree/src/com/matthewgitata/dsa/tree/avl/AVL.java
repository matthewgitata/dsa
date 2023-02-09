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
        System.out.print(node.value + " ");
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
        System.out.print(node.value + " ");
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
     * Search for a node.
     *
     * @param node the root node.
     * @value value we are searching for.
     */
    public void search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value " + value + " is not found in BST!");
        } else if (node.value == value) {
            System.out.println("Value " + value + " is found in BST!");
        } else if (value < node.value) {
            search(node.left, value);
        } else {
            search(node.right, value);
        }
    }

    /**
     * Gets height of the Binary Node.
     *
     * @param node the root node
     */
    public int getHeight(BinaryNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    /**
     * Rotate Right
     *
     * @param disbalancedNode the disbalanced node.
     * @return the new root.
     */
    private BinaryNode rotateRight(BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right;
        newRoot.right = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    /**
     * Rotate Left
     *
     * @param disbalancedNode the disbalanced node.
     * @return the new root.
     */
    private BinaryNode rotateLeft(BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left;
        newRoot.left = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    /**
     * Get Balance.
     *
     * @param node the root node
     * @return the int equivalent of condition causing disbalance
     */
    public int getBalance(BinaryNode node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    /**
     * Inserts a node
     *
     * @param node      the root node.
     * @param nodeValue the value of node to be inserted.
     * @return the type of the binary method.
     */
    private BinaryNode insertNode(BinaryNode node, int nodeValue) {
        if (node == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = nodeValue;
            newNode.height = 1;
            return newNode;
        } else if (nodeValue < node.value) {
            node.left = insertNode(node.left, nodeValue);
        } else if (nodeValue > node.value) {
            node.right = insertNode(node.right, nodeValue);
        }
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getBalance(node);

        if (balance > 1 && nodeValue < node.left.value) {
            return rotateRight(node);
        }

        if (balance > 1 && nodeValue > node.left.right.value) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balance < -1 && nodeValue > node.right.value) {
            return rotateLeft(node);
        }

        if (balance < -1 && nodeValue < node.right.left.value) {
            node.right = rotateRight(node);
            return rotateLeft(node);
        }
        return node;
    }

    public void insert(int value) {
        this.root = insertNode(root, value);
    }
}