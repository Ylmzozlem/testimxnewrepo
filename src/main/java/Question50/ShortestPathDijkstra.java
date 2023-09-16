package Question50;

import java.util.*;

public class ShortestPathDijkstra {
    private int V;
    private List<List<Node>> adjList;

    public ShortestPathDijkstra(int v) {
        V = v;
        adjList = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, int weight) {
        Node node = new Node(destination, weight);
        adjList.get(source).add(node);
    }

    public int[] dijkstra(int startNode) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[startNode] = 0;

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(V, Comparator.comparingInt(node -> node.weight));
        priorityQueue.add(new Node(startNode, 0));

        while (!priorityQueue.isEmpty()) {
            int u = priorityQueue.poll().node;

            for (Node neighbor : adjList.get(u)) {
                int v = neighbor.node;
                int weight = neighbor.weight;

                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    priorityQueue.add(new Node(v, dist[v]));
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int V = 5;
        ShortestPathDijkstra graph = new ShortestPathDijkstra(V);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 4, 7);
        graph.addEdge(3, 4, 9);

        int startNode = 0;
        int[] dist = graph.dijkstra(startNode);

        for (int i = 0; i < V; i++) {
            System.out.println("Shortest distance from node " + startNode + " to node " + i + ": " + dist[i]);
        }
    }

    static class Node {
        int node;
        int weight;

        Node(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
}
