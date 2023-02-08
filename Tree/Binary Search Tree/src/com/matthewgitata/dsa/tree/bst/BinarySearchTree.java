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
     * @param value       node value to be inserted.
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
     *
     * @param value value of node to be inserted.
     */
    void insert(int value) {
        root = insert(this.root, value);
    }

    /**
     * PreOrder Traversal.
     *
     * @param node the root node.
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
     * @param node the root node.
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
     * @param node the root node.
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
     * @param node  the root node
     * @param value the value to be search for.
     * @return the found node.
     */
    public BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value " + value + " not found in BST.");
            return null;
        } else if (root.value == value) {
            System.out.println("Value " + value + " found in BST.");
            return node;
        } else if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    /**
     * Find minimum node.
     *
     * @param root the root node.
     * @return the minimum node.
     */
    public BinaryNode minimumNode(BinaryNode root) {
        if (root.left == null) {
            return root;
        } else {
            return minimumNode(root.left);
        }
    }

    /**
     * Deletes a node in BST.
     *
     * @param root  the root node.
     * @param value the node value to be deleted.
     * @return the binary node being deleted from the BST.
     */
    BinaryNode deleteNode(BinaryNode root, int value) {
        if (root == null) {
            System.out.println("Value is not found in BST!");
            return null;
        }
        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.right != null && root.left != null) {
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                root.value = minNodeForRight.value;
                root.right = deleteNode(root.right, minNodeForRight.value);
            } else if (root.right != null) {
                root = root.right;
            }
            if (root.left != null) {
                root = root.left;
            } else {
                root = null;
            }
        }
        return root;
    }

    /**
     * Deletes BST.
     */
    public void deleteBST() {
        root = null;
        System.out.println("BST has been deleted successfully.");
    }
}