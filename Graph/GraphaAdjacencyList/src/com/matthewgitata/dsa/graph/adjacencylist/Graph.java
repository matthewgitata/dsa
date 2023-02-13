package com.matthewgitata.dsa.graph.adjacencylist;

import java.util.ArrayList;

/**
 * The {@code Graph} class defines a Graph object's
 * properties and operations.
 * <p>
 * created by @matthewgitata on 13/02/2023.
 */
public class Graph {
    public ArrayList<GraphNode> nodeList;

    /**
     * Constructor.
     */
    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    /**
     * Add node edges to Graph, undirected.
     *
     * @param i index of first node.
     * @param j index of second node.
     */
    public void addUndirected(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }

    /**
     * Print Graph to console.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nodeList.size(); i++) {
            sb.append(nodeList.get(i).name + ": ");
            for (int j = 0; j < nodeList.get(i).neighbors.size(); j++) {
                if (j == nodeList.get(i).neighbors.size() - 1) {
                    sb.append((nodeList.get(i).neighbors.get(j).name));
                } else {
                    sb.append((nodeList.get(i).neighbors.get(j).name) + "->");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}