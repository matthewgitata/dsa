package com.matthewgitata.dsa.graph.adjacencymatrix;

/**
 * The {@code GraphNode} class defines the properties of a GraphNode
 * object.
 * <p>
 * created by @matthewgitata on 13/02/2023.
 */
public class GraphNode {
    public String name;
    public int index;
    public boolean isVisited = false;

    /**
     * Constructor
     *
     * @param name  the name of the node.
     * @param index the index of the node.
     */
    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }
}