package com.matthewgitata.dsa.graph.disjointset;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * The {@code Prims} class implements Prims Algorithm
 * <p>
 * created by 15/02/2023.
 */
public class Prims {
    ArrayList<WeightedNode> nodeList;

    /**
     * Constructor
     */
    public Prims(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    /**
     * Add node edges, undirected.
     */
    public void addUndirectedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
        first.weightMap.put(second, d);
        second.weightMap.put(first, d);
    }

    /**
     * Prims Algorithm.
     */
    void Prims(WeightedNode node) {
        for (int i = 0; i < nodeList.size(); i++) {
            nodeList.get(i).distance = Integer.MAX_VALUE;
        }
        node.distance = 0;
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        queue.addAll(nodeList);
        while (!queue.isEmpty()) {
            WeightedNode currentNode = queue.remove();
            for (WeightedNode neighbor : currentNode.neighbors) {
                if (queue.contains(neighbor)) {
                    if (neighbor.distance > currentNode.weightMap.get(neighbor)) {
                        neighbor.distance = currentNode.weightMap.get(neighbor);
                        neighbor.parent = currentNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        int cost = 0;
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.println("Node " + nodeToCheck + ", key " + nodeToCheck.distance + " Parent: "+  nodeToCheck.parent);
            cost = cost + nodeToCheck.distance;
        }
        System.out.println("\nTotal cost of MST: " + cost);
    }
}