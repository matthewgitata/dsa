package com.matthewgitata.dsa.graph.disjointset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * The {@code Kruskal} class implements the Kruskal algorithm.
 */
public class Kruskal {
    ArrayList<WeightedNode> nodeList;
    ArrayList<UndirectedEdge> edgeList = new ArrayList<>();

    /**
     * Constructor.
     */
    public Kruskal(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    /**
     * Add edges, weighted.
     *
     * @param firstIndex  the first node's index
     * @param secondIndex the second node's index
     * @param weight      the weight of the edge
     */
    public void addWeightedUndirectedEdge(int firstIndex, int secondIndex, int weight) {
        UndirectedEdge edge = new UndirectedEdge(nodeList.get(firstIndex), nodeList.get(secondIndex), weight);
        WeightedNode first = edge.first;
        WeightedNode second = edge.second;
        first.neighbors.add(second);
        second.neighbors.add(first);
        first.weightMap.put(second, weight);
        second.weightMap.put(first, weight);
        edgeList.add(edge);
    }

    /**
     * Kruskal algorithm.
     */
    void Kruskal() {
        DisjointSet.makeSet(nodeList);
        Comparator<UndirectedEdge> comparator = new Comparator<UndirectedEdge>() {
            @Override
            public int compare(UndirectedEdge o1, UndirectedEdge o2) {
                return o1.weight - o2.weight;
            }
        };
        Collections.sort(edgeList, comparator);
        int cost = 0;
        for (UndirectedEdge edge : edgeList) {
            WeightedNode first = edge.first;
            WeightedNode second = edge.second;
            if (!DisjointSet.findSet(first).equals(DisjointSet.findSet(second))) {
                DisjointSet.union(first, second);
                cost += edge.weight;
                System.out.println("Taken " + edge);
            }
        }
        System.out.println("\nTotal cost of MST:" + cost);
    }
}