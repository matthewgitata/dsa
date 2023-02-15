package com.matthewgitata.dsa.graph.disjointset;

import java.util.ArrayList;

/**
 * The {@code DisjointSet} class defines the properties of a DisjointSet
 * object and operations performed on it.
 * <p>
 * created by @matthewgitata on 15/02/2023.
 */
public class DisjointSet {
    private ArrayList<WeightedNode> nodeList = new ArrayList<>();

    /**
     * Make Set.
     *
     * @param nodeList the weighted nodes list
     */
    public static void makeSet(ArrayList<WeightedNode> nodeList) {
        for (WeightedNode node : nodeList) {
            DisjointSet set = new DisjointSet();
            set.nodeList.add(node);
            node.set = set;
        }
    }

    /**
     * Find Set.
     *
     * @param node the weighted node to find
     * @return the Disjoint Set.
     */
    public static DisjointSet findSet(WeightedNode node) {
        return node.set;
    }

    /**
     * Union.
     *
     * @param node1 first weighted node.
     * @param node2 second weighted node.
     * @return the union set.
     */
    public static DisjointSet union(WeightedNode node1, WeightedNode node2) {
        if (node1.set.equals(node2.set)) {
            return null;
        } else {
            DisjointSet set1 = node1.set;
            DisjointSet set2 = node2.set;
            if (set1.nodeList.size() > set2.nodeList.size()) {
                ArrayList<WeightedNode> nodeSet2 = set2.nodeList;
                for (WeightedNode node : nodeSet2) {
                    node.set = set1;
                    set1.nodeList.add(node);
                }
                return set1;
            } else {
                ArrayList<WeightedNode> nodeSet1 = set1.nodeList;
                for (WeightedNode node : nodeSet1) {
                    node.set = set2;
                    set2.nodeList.add(node);
                }
                return set2;
            }
        }
    }

    /**
     * Print Set.
     */
    public void printAllNodesOfThisSet() {
        System.out.println("Printing all nodes of the set: ");
        for (WeightedNode node : nodeList) {
            System.out.print(node + " ");
        }
        System.out.println();
    }
}