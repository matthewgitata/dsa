package com.matthewgitata.dsa.tree.tree;

import java.util.ArrayList;

/**
 * The {@code TreeNode} class defines the Nodes and
 * joins them together to form a Tree.
 * <p>
 * created by @matthewgitata on 31/01/2023
 */
public class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    /**
     * Initializes the data and children; Creates the Tree Node.
     *
     * @param data the data.
     */
    public TreeNode(String data) {
        this.data = data;
        children = new ArrayList<>();
    }

    /**
     * Adds children to the Tree Node
     *
     * @param node children Tree Node(s)
     */
    public void addChild(TreeNode node) {
        this.children.add(node);
    }

    /**
     * Prints to the console the Tree Node.
     *
     * @return children of the Tree Node
     */
    public String print(int level) {
        String ret;
        ret = " ".repeat(level) + data + "\n";
        for (TreeNode node : this.children) {
            ret += node.print(level + 1);
        }
        return ret;
    }
}
