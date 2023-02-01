package com.matthewgitata.dsa.tree.binarytree;

/**
 * The {@code Main} class contains method where all operations on a
 * BinaryTree are performed.
 * <p>
 * created by @matthewgitata on 31/01/2023
 */
public class Main {
    public static void main(String[] args) {
        BinaryTreeLL binaryTree = new BinaryTreeLL();
        BinaryNode N1 = new BinaryNode();
        N1.value = "N1";
        BinaryNode N2 = new BinaryNode();
        N2.value = "N2";
        BinaryNode N3 = new BinaryNode();
        N3.value = "N3";
        BinaryNode N4 = new BinaryNode();
        N4.value = "N4";
        BinaryNode N5 = new BinaryNode();
        N5.value = "N5";
        BinaryNode N6 = new BinaryNode();
        N6.value = "N6";
        BinaryNode N7 = new BinaryNode();
        N7.value = "N7";
        BinaryNode N8 = new BinaryNode();
        N8.value = "N8";
        BinaryNode N9 = new BinaryNode();
        N9.value = "N9";

        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;
        N4.left = N8;
        N4.right = N9;
        N3.left = N6;
        N3.right = N7;
        binaryTree.root = N1;

        System.out.println("PreOrder Traversal");
        binaryTree.preOrder(binaryTree.root);
        System.out.println("\nInOrder Traversal");
        binaryTree.inOrder(binaryTree.root);
        System.out.println("\nPostOrder Traversal");
        binaryTree.postOrder(binaryTree.root);
        System.out.println("\nLevelOrder Traversal");
        binaryTree.levelOrder();
        System.out.println("\nNode search");
        binaryTree.search("N5");


        //Insertion method
        System.out.println("\n\nTree 2 Insertion method.");
        BinaryTreeLL binaryTree2 = new BinaryTreeLL();
        System.out.println("\nInsertion");
        binaryTree2.insert("Z1");
        binaryTree2.insert("Z2");
        binaryTree2.insert("Z3");
        binaryTree2.insert("Z4");
        binaryTree2.insert("Z5");
        binaryTree2.insert("Z6");
        binaryTree2.levelOrder();

        //Get deepest node
        System.out.println("\nDeepest node.");
        System.out.println(binaryTree2.getDeepestNode().value);

        //Delete deepest node
        System.out.println("\nDelete Deepest node.");
        binaryTree2.levelOrder();
        binaryTree2.deleteDeepestNode();
        System.out.println("");
        binaryTree2.levelOrder();
        // Delete a node from BT
        System.out.println("\nDelete a node from BT.");
        binaryTree2.deleteNode("Z2");
        binaryTree2.levelOrder();
        //Delete Binary Tree
        System.out.println("Delete Binary Tree");
        binaryTree2.deleteBT();
    }
}