package com.matthewgitata.dsa.graph.adjacencylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

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

    /**
     * BFS Internal.
     */
    void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            for (GraphNode neighbor : currentNode.neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    /**
     * BFS
     */
    void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }

    /**
     * DFS Internal
     */
    void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            for (GraphNode neighbor : currentNode.neighbors) {
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
                dfsVisit(node);
            }
        }
    }

    /**
     * Add node edges to Graph, directed
     *
     * @param i the index of first vertex
     * @param j the index of second vertex
     */
    public void addDirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);
    }

    /**
     * Topological internal.
     */
    void topologicalVisit(GraphNode node, Stack<GraphNode> stack) {
        for (GraphNode neighbor : node.neighbors) {
            if (!neighbor.isVisited) {
                topologicalVisit(neighbor, stack);
            }
        }
        node.isVisited = true;
        stack.push(node);
    }

    /**
     * Topological Sort.
     */
    void topologicalSort() {
        Stack<GraphNode> stack = new Stack<>();
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                topologicalVisit(node, stack);

            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().name + " ");
        }
    }
}