package com.matthewgitata.dsa.tree.binarytreearr;

/**
 * The {@code Main} class contains method where all operations
 * on a Binary Tree are performed.
 * <p>
 * created by @matthewgitata on 01/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("BT Creation");
        BinaryTree newBinaryTree = new BinaryTree(5);
        System.out.println("BT Insertion");
        newBinaryTree.insert("A1");
        newBinaryTree.insert("A2");
        newBinaryTree.insert("A3");
        newBinaryTree.insert("A4");
        newBinaryTree.insert("A5");
        newBinaryTree.insert("A6");
    }
}