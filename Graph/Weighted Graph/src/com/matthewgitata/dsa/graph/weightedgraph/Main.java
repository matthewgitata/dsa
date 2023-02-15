package com.matthewgitata.dsa.graph.weightedgraph;

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

        WeightedGraph newGraph = new WeightedGraph(nodeList);
        newGraph.addWeightedEdge(0, 3, 1);
        newGraph.addWeightedEdge(0, 1, 8);
        newGraph.addWeightedEdge(1, 2, 1);
        newGraph.addWeightedEdge(2, 0, 4);
        newGraph.addWeightedEdge(3, 1, 2);
        newGraph.addWeightedEdge(3, 2, 1);

        System.out.println("Printing Floyd Warshall Algorithm from source:A");
        newGraph.floydWarshall();
    }
}