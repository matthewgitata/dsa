package com.matthewgitata.dsa.graph.adjacencylist;

import java.util.ArrayList;

/**
 * The {@code Main} class contains method where all
 * Graph operations are performed.
 * <p>
 * created by @matthewgitata on 13/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));

        Graph g = new Graph(nodeList);
        g.addUndirected(0, 1);
        g.addUndirected(0, 2);
        g.addUndirected(0, 3);
        g.addUndirected(1, 4);
        g.addUndirected(2, 3);
        g.addUndirected(3, 4);
        
        System.out.println(g.toString());
        g.bfs();
    }
}