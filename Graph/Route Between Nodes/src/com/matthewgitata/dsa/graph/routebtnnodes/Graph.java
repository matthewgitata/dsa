package com.matthewgitata.dsa.graph.routebtnnodes;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * The {@code Graph} class defines the properties of a
 * Graph object and operations done on it.
 * <p>
 * created by @matthewgitata on 15/02/2023.
 */
public class Graph {
    static ArrayList<GraphNode> nodesList;

    public enum State {
        Unvisited, Visited, Visiting;
    }

    public Graph(ArrayList<GraphNode> nodesList) {
        this.nodesList = nodesList;
    }

    public void addDirectedEdge(int i, int j) {
        GraphNode first = nodesList.get(i);
        GraphNode second = nodesList.get(j);
        first.neighbors.add(second);
    }

    /**
     * Route between nodes.
     */
    public static boolean search(GraphNode start, GraphNode end) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        for (GraphNode node : nodesList) {
            node.state = State.Unvisited;
        }
        start.state = State.Visiting;
        queue.add(start);
        GraphNode currentNode;
        while (!queue.isEmpty()) {
            currentNode = queue.removeFirst();
            if (currentNode != null) {
                for (GraphNode neighbor : currentNode.neighbors) {
                    if (neighbor.state == State.Unvisited) {
                        if (neighbor == end) {
                            return true;
                        } else {
                            neighbor.state = State.Visiting;
                            queue.add(neighbor);
                        }
                    }
                }
                currentNode.state = State.Visited;
            }
        }
        return false;
    }
}