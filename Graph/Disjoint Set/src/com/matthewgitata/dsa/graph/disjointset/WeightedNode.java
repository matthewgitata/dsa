package com.matthewgitata.dsa.graph.disjointset;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The {@code WeightedNode} class defines a WeightedNode object
 * <p>
 * created by @matthewgitata on 15/02/2023.
 */
public class WeightedNode implements Comparable<WeightedNode> {
    public String name;
    public ArrayList<WeightedNode> neighbors = new ArrayList<WeightedNode>();
    public HashMap<WeightedNode, Integer> weightMap = new HashMap<>();
    public boolean isVisited = false;
    public WeightedNode parent;
    public int distance;
    public int index;
    public DisjointSet set;


    public WeightedNode(String name, int index) {
        this.name = name;
        distance = Integer.MAX_VALUE;
        this.index = index;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(WeightedNode o) {
        return this.distance - o.distance;
    }
}