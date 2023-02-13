package com.matthewgitata.dsa.graph.adjacencymatrix;

import java.util.ArrayList;

/**
 * The {@code Graph} class defines the properties of a
 * Graph object and the various operations performed on it.
 * <p>
 * created by @matthewgitata on 13/02/2023.
 */
public class Graph {
    ArrayList<GraphNode> nodeList;
    int[][] adjacencyMatrix;

    /**
     * Constructor.
     *
     * @param nodeList list of the nodes.
     */
    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
        this.adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    /**
     * Add node edges to adjacency matrix, undirected.
     *
     * @param i the index of first node
     * @param j the index of second node
     */
    public void addUndirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    /**
     * Print adjacency matrix to console.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("   ");
        for (int i = 0; i < nodeList.size(); i++) {
            sb.append(nodeList.get(i).name + " ");
        }
        sb.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            sb.append(nodeList.get(i).name + ": ");
            for (int j : adjacencyMatrix[i]) {
                sb.append((j) + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}