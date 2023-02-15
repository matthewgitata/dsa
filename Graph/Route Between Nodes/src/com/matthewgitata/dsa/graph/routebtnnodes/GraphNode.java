package com.matthewgitata.dsa.graph.routebtnnodes;

import java.util.ArrayList;

/**
 * The {@code GraphNode} class defines the properties
 * of a GraphNode object.
 * <p>
 * created by @matthewgitata on 15/02/2023.
 */
public class GraphNode {
    public String name;
    public int index;
    public boolean isVisited = false;
    public GraphNode parent;
    public Graph.State state;

    public ArrayList<GraphNode> neighbors = new ArrayList<>();

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }
}