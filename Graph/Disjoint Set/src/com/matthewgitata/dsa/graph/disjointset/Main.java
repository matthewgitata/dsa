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
        nodeList.add(new WeightedNode("E", 4));

        Kruskal graph = new Kruskal(nodeList);
        graph.addWeightedUndirectedEdge(0, 1, 5);
        graph.addWeightedUndirectedEdge(0, 2, 13);
        graph.addWeightedUndirectedEdge(0, 4, 15);
        graph.addWeightedUndirectedEdge(1, 2, 10);
        graph.addWeightedUndirectedEdge(1, 3, 8);
        graph.addWeightedUndirectedEdge(2, 3, 6);
        graph.addWeightedUndirectedEdge(2, 4, 20);

        System.out.println("Running Kruskal Algo on the graph: ");
        graph.Kruskal();
    }
}