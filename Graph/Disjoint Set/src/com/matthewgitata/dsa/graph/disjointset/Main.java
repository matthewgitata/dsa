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

        Prims graph = new Prims(nodeList);
        graph.addUndirectedEdge(0, 1, 5);
        graph.addUndirectedEdge(0, 2, 13);
        graph.addUndirectedEdge(0, 4, 15);
        graph.addUndirectedEdge(1, 2, 10);
        graph.addUndirectedEdge(1, 3, 8);
        graph.addUndirectedEdge(2, 3, 6);
        graph.addUndirectedEdge(2, 4, 20);

        System.out.println("Running Prims Algo on the graph: ");
        graph.Prims(nodeList.get(4));
    }
}