package com.matthewgitata.dsa.graph.disjointset;

import java.util.ArrayList;

/**
 * The {@code Main} class constitutes method where all
 * WeightedGraph operations are performed.
 * <p>
 * created by @matthewgitata on 14/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A", 0));
        nodeList.add(new WeightedNode("B", 1));
        nodeList.add(new WeightedNode("C", 2));
        nodeList.add(new WeightedNode("D", 3));

        DisjointSet.makeSet(nodeList);

        WeightedNode firstNode = nodeList.get(0);
        WeightedNode secondNode = nodeList.get(1);

        DisjointSet.findSet(firstNode);
        DisjointSet output = DisjointSet.findSet(secondNode);
        output.printAllNodesOfThisSet();

        DisjointSet.union(firstNode, secondNode);
        output = DisjointSet.findSet(secondNode);
        output.printAllNodesOfThisSet();
    }
}