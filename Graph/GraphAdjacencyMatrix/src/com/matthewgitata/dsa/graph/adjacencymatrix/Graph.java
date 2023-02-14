package com.matthewgitata.dsa.graph.adjacencymatrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    /**
     * Get neighbors of a given node.
     *
     * @param node the node
     */
    public ArrayList<GraphNode> getNeighbors(GraphNode node) {
        ArrayList<GraphNode> neighbors = new ArrayList<>();
        int nodeIndex = node.index;
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1) {
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;
    }

    /**
     * BFS Internal.
     *
     * @param node node to traverse.
     */
    void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for (GraphNode neighbor : neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    //bfs
    public void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }

    /**
     * DFS Internal
     */

    void dfsFirst(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for (GraphNode neighbor : neighbors) {
                if (!neighbor.isVisited) {
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    /**
     * DFS
     */
    void dfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                dfsFirst(node);
            }
        }
    }
}