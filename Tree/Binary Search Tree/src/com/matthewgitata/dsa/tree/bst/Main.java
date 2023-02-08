package com.matthewgitata.dsa.tree.bst;

/**
 * The {@code Main} class contains method where all BST operations can be
 * performed.
 * <p>
 * created by @matthewgitata on 07/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        BinarySearchTree newBST = new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);

        System.out.println("\nPreOrder Traversal.");
        newBST.preOrder(newBST.root);

        System.out.println("\nInOrder Traversal.");
        newBST.inOrder(newBST.root);

        System.out.println("\nPostOrder Traversal.");
        newBST.postOrder(newBST.root);

        System.out.println("\nLevelOrder Traversal.");
        newBST.levelOrder();

        System.out.println("\nSearch for Node.");
        newBST.search(newBST.root, 100);
        newBST.search(newBST.root, 200);

        System.out.println("\nDelete a Node.");
        newBST.levelOrder();
        System.out.println();
        newBST.deleteNode(newBST.root, 40);
        newBST.levelOrder();

        System.out.println("Delete BST");
        newBST.deleteBST();
    }
}