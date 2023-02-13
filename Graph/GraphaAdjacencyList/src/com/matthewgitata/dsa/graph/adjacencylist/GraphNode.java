package com.matthewgitata.dsa.graph.adjacencylist;

import java.util.ArrayList;

/**
 * The {@code GraphNode} class defines a GraphNode.
 * <p>
 * created by @matthewgitata on 13/02/2023.
 */
public class GraphNode {
    public String name;
    public int index;
    public ArrayList<GraphNode> neighbors = new ArrayList<>();

    /**
     * Constructor.
     */
    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }
}