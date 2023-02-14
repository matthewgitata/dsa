package com.matthewgitata.dsa.graph.weightedgraph;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * The {@code WeightedGraph} defines the properties of WeightedGraph
 * and its operations.
 * <p>
 * created by @matthewgitata on 14/02/2023.
 */
public class WeightedGraph {
    ArrayList<WeightedNode> nodeList;

    /**
     * Constructor.
     *
     * @param nodeList list of the nodes
     */
    public WeightedGraph(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    /**
     * Dijkstra's Algorithm
     *
     * @param node the source node
     */
    public void dijkstra(WeightedNode node) {
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        node.distance = 0;
        queue.addAll(nodeList);
        while (!queue.isEmpty()) {
            WeightedNode currentNode = queue.remove();
            for (WeightedNode neighbor : currentNode.neighbors) {
                if (queue.contains(neighbor)) {
                    if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
                        neighbor.distance = (currentNode.distance + currentNode.weightMap.get(neighbor));
                        neighbor.parent = currentNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }

    /**
     * Print path
     */
    void pathPrint(WeightedNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    /**
     * Add weighted edges.
     *
     * @param i the first node's index
     * @param j the second node's index
     * @param d the cost of edge
     */
    public void addWeightedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbors.add(second);
        first.weightMap.put(second, d);
    }

    /**
     * Bellman Ford Algorithm
     *
     * @param sourceNode the source node.
     */
    void bellmanFord(WeightedNode sourceNode) {
        sourceNode.distance = 0;
        for (int i = 0; i < nodeList.size(); i++) {
            for (WeightedNode currentNode : nodeList) {
                for (WeightedNode neighbor : currentNode.neighbors) {
                    if (neighbor.distance > (currentNode.distance + currentNode.weightMap.get(neighbor))) {
                        neighbor.distance = currentNode.distance + currentNode.weightMap.get(neighbor);
                        neighbor.parent = currentNode;
                    }
                }
            }
            System.out.println("Checking for Negative Cycle..");
            for (WeightedNode currentNode : nodeList) {
                for (WeightedNode neighbor : currentNode.neighbors) {
                    if (neighbor.distance > (currentNode.distance + currentNode.weightMap.get(neighbor))) {
                        System.out.println("Negative Cycle Found\n");
                        System.out.println("Vertex name: " + neighbor.name);
                        System.out.println("Old cost: " + neighbor.distance);
                        int newDistance = currentNode.distance + currentNode.weightMap.get(neighbor);
                        System.out.println("New cost: " + newDistance);
                        return;
                    }
                }
            }
            System.out.println("Negative Cycle not found.");

            for (WeightedNode nodeToCheck : nodeList) {
                System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck + ", Path ");
                pathPrint(nodeToCheck);
                System.out.println();
            }
        }
    }

}