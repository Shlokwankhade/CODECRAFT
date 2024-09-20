import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph {
    private Map<Integer, List<Integer>> adjList;  // Adjacency list for the graph

    // Constructor to initialize the graph
    public Graph() {
        adjList = new HashMap<>();
    }

    // Method to add an edge to the graph (undirected)
    public void addEdge(int v, int w) {
        adjList.computeIfAbsent(v, k -> new ArrayList<>()).add(w);
        adjList.computeIfAbsent(w, k -> new ArrayList<>()).add(v);  // Since it's undirected
    }

    // Depth-First Search recursive helper method
    private void DFSUtil(int v, Set<Integer> visited) {
        // Mark the current node as visited
        visited.add(v);
        System.out.print(v + " ");  // Print the visited vertex

        // Recursively visit all adjacent vertices that have not been visited
        for (int neighbor : adjList.getOrDefault(v, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    // Method to perform DFS traversal from a given starting vertex
    public void DFS(int startVertex) {
        // Set to keep track of visited vertices
        Set<Integer> visited = new HashSet<>();
        DFSUtil(startVertex, visited);
    }

    public static void main(String[] args) {
        // Create a graph
        Graph graph = new Graph();
        
        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        System.out.println("DFS Traversal starting from vertex 0:");
        graph.DFS(0);  // Perform DFS starting from vertex 0
    }
}
