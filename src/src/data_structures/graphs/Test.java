package data_structures.graphs;

public class Test {
    public static void main(String[] args) {
        int [][] graphMatrix = new int[][]{{7, 6, 1}, {7, 2, 1}, {7, 5, 1}, {6, 7, 1}, {6, 4, 1}, {2, 1, 1}, {5, 9, 1}, {8, 10, 1}};

        Graph myGraph = new Graph(graphMatrix);

        WorkWithGraph test = new WorkWithGraph();

        test.DFSWrap(myGraph);
    }
}
