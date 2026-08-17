package data_structures.graphs;

import java.util.HashMap;

public class Graph {
    HashMap<Integer, Node> graph;

    public Graph() {
        this.graph = new HashMap<>();
    }

    public Node addOrGetNode(int value) {
        if (value == -1) {
            return null;
        }

        else {
            if (this.graph.containsKey(value)) {
                return this.graph.get(value);
            }

            else {
                Node node = new Node(value);
                this.graph.put(value, node);
                return node;
            }
        }
    }

    public Graph(int[][] graphData) {
        this.graph = new HashMap<>();
        for (int[] row : graphData) {
            Node node = addOrGetNode(row[0]);
            Node adjacentNode = addOrGetNode(row[1]);
            if (adjacentNode == null) {
                continue;
            }
            Edge edge = new Edge(adjacentNode, row[2]);
            node.edges.add(edge);
            adjacentNode.parents.put(node, edge);
        }
    }
}
