package Graphs;

import java.util.*;

/**
 * Algorithm: Dijkstra, Bellman-Ford, Floyd-Warshall
 * Use Case: Shortest path routing. 
 * Warning: Dijkstra fails on negative weights. Floyd-Warshall is O(V^3).
 */
class ShortestPath {

    // Dijkstra (O(E log V))
    public int[] dijkstra(int V, List<List<int[]>> adj, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        
        // Min-Heap sorting by distance: {node, distance}
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> Integer.compare(x[1], y[1]));
        pq.add(new int[]{src, 0});
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int currDist = curr[1];
            
            if (currDist > dist[node]) continue; // Skip stale records
            
            for (int[] edge : adj.get(node)) {
                int adjNode = edge[0];
                int weight = edge[1];
                
                if (currDist + weight < dist[adjNode]) {
                    dist[adjNode] = currDist + weight;
                    pq.add(new int[]{adjNode, dist[adjNode]});
                }
            }
        }
        return dist;
    }

    // Bellman-Ford (O(V * E)) - Edges provided as {u, v, weight}
    public int[] bellmanFord(int V, int[][] edges, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, (int) 1e8); // Standard CP infinity for BF
        dist[src] = 0;
        
        for (int i = 1; i <= V; i++) {
            for (int[] edge : edges) {
                int u = edge[0], v = edge[1], w = edge[2];
                if (dist[u] != 1e8 && dist[u] + w < dist[v]) {
                    if (i == V) return new int[]{-1}; // Negative Cycle Tripwire
                    dist[v] = dist[u] + w;
                }
            }
        }
        return dist;
    }

    // Floyd-Warshall (O(V^3)) - Operates directly on the adjacency matrix
    public void floydWarshall(int[][] matrix) {
        int n = matrix.length;
        
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][k] != Integer.MAX_VALUE && matrix[k][j] != Integer.MAX_VALUE) {
                        matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    }
                }
            }
        }
    }
}
