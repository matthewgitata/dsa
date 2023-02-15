package com.matthewgitata.dsa.graph.disjointset;

/**
 * The {@code UndirectedEdge} class define properties of an
 * UndirectedEdge.
 * <p>
 * created by @matthewgitata on 15/02/2023.
 */
public class UndirectedEdge {
    public WeightedNode first;
    public WeightedNode second;
    public int weight;

    /**
     * Constructor.
     */
    public UndirectedEdge(WeightedNode first, WeightedNode second, int weight) {
        this.first = first;
        this.second = second;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge("+ first + second + "), weight = " + weight;
    }
}