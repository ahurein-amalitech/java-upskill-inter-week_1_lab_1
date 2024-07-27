import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Graph {
    private int numVertices;
    private List<List<Node>> adjList;

    class Node {
        int vertex;
        int weight;

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add an edge to the graph
    public void addEdge(int src, int dest, int weight) {
        adjList.get(src).add(new Node(dest, weight));
        adjList.get(dest).add(new Node(src, weight)); // For undirected graph
    }

    public void primMST() {
        boolean[] inMST = new boolean[numVertices];
        int[] key = new int[numVertices];
        int[] parent = new int[numVertices];
        PriorityQueue<Node> pq = new PriorityQueue<>(numVertices, Comparator.comparingInt(node -> node.weight));

        for (int i = 0; i < numVertices; i++) {
            key[i] = Integer.MAX_VALUE;
        }

        pq.add(new Node(0, 0));
        key[0] = 0;
        parent[0] = -1;

        while (!pq.isEmpty()) {
            int u = pq.poll().vertex;
            inMST[u] = true;

            for (Node neighbor : adjList.get(u)) {
                int v = neighbor.vertex;
                int weight = neighbor.weight;

                if (!inMST[v] && weight < key[v]) {
                    key[v] = weight;
                    pq.add(new Node(v, key[v]));
                    parent[v] = u;
                }
            }
        }

        printMST(parent);
    }

    private void printMST(int[] parent) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < numVertices; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + getEdgeWeight(i, parent[i]));
        }
    }

    private int getEdgeWeight(int src, int dest) {
        for (Node neighbor : adjList.get(src)) {
            if (neighbor.vertex == dest) {
                return neighbor.weight;
            }
        }
        return 0;
    }
}
