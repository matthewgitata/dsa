package com.matthewgitata.dsa.tree.tree;

/**
 * The {@code Main} class contains method where operations
 * on a Tree are performed.
 * <p>
 * created by @matthewgitata on 31/01/2023.
 */
public class Main {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode wine = new TreeNode("Wine");
        TreeNode beer = new TreeNode("Beer");
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(wine);
        cold.addChild(beer);
        System.out.println(drinks.print(0));
    }
}