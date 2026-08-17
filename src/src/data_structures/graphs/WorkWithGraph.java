package data_structures.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

public class WorkWithGraph {
//    рекурсивный вариант DFS
//    public void DFS(Node node, HashSet<Node> passed) {
//        System.out.println(node.value);
//        passed.add(node);
//
//        for (Edge edge: node.edges) {
//            if (!passed.contains(edge.adjacentNode)) {
//                DFS(edge.adjacentNode, passed);
//            }
//        }
//    }

    public void DFS(Node node, HashSet<Node> passed) {
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (stack.size() != 0) {
            node = stack.peek();

            if (!passed.contains(node)) {
                System.out.println(node.value);
                passed.add(node);
            }

            boolean hasChildren = false;

            for (Edge edge: node.edges) {
                if (!passed.contains(edge.adjacentNode)) {
                    stack.push(edge.adjacentNode);
                    hasChildren = true;
                    break;
                }
            }

            if (!hasChildren) {
                stack.pop();
            }
        }
    }

    public void DFSWrap(Graph graph) {
        HashSet<Node> passed = new HashSet<>();

        for (Map.Entry<Integer, Node> graphEntry: graph.graph.entrySet()) {
            Node node = graphEntry.getValue();
            if (!passed.contains(node)) {
                DFS(node, passed);
            }
        }
    }
}
