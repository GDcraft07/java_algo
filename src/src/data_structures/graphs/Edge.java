package data_structures.graphs;

public class Edge {
    Node adjacentNode;
    int weight;

    public Edge(Node adjacentNode, int wight) {
        this.adjacentNode = adjacentNode;
        this.weight = wight;
    }
}
