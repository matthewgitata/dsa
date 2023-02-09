package com.matthewgitata.dsa.tree.avl;

/**
 * The {@code Main} class contains method where all operations
 * on an AVL can be performed.
 * <p>
 * created by @matthewgitata on 08/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        AVL newAVL = new AVL();

        newAVL.insert(5);
        newAVL.insert(10);
        newAVL.insert(15);
        newAVL.insert(20);

        System.out.println("\nPreOrder Traversal.");
        newAVL.preOrder(newAVL.root);

        System.out.println("\nInOrder Traversal.");
        newAVL.inOrder(newAVL.root);

        System.out.println("\nPostOrder Traversal.");
        newAVL.postOrder(newAVL.root);

        System.out.println("\nLevelOrder Traversal.");
        newAVL.levelOrder();

        System.out.println("\nSearch for Node.");
        newAVL.search(newAVL.root, 10);
        newAVL.search(newAVL.root, 60);

        System.out.println("\nDelete AVL Tree.");
        newAVL.levelOrder();
        newAVL.delete(5);
        System.out.println();
        newAVL.levelOrder();

        System.out.println("\nDelete AVL Tree.");
        newAVL.deleteAVL();
    }
}