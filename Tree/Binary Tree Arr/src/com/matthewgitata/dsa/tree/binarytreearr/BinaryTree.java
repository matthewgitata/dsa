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

    /**
     * Checks if Binary Tree is full.
     *
     * @return true if BT is full, otherwise false.
     */
    public boolean isFull() {
        if (lastUsedIndex == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Inserts node into the BinaryTree.
     *
     * @param value node value to be inserted.
     */
    public void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("The value of " + value + " has been successfully inserted.");
        } else {
            System.out.println("The Binary Tree is Full!");
        }
    }

    /**
     * PreOrder Traversal.
     *
     * @param index the root node index.
     */
    public void preOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        System.out.print(arr[index] + " ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }

    /**
     * InOrder Traversal.
     *
     * @param index the root node index
     */
    public void inOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        inOrder(index * 2);
        System.out.print(arr[index] + " ");
        inOrder(index * 2 + 1);
    }

}