package Graphs;

import java.util.*;

/**
 * Algorithm: Prim's Minimum Spanning Tree (MST)
 * Time Complexity: O(E log V)
 * Space Complexity: O(V)
 */
class MST {

    // Returns the total cost of the Minimum Spanning Tree
    public int prims(int V, List<List<int[]>> adj) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> Integer.compare(x[1], y[1]));
        boolean[] vis = new boolean[V];
        
        // {node, edgeWeight}
        pq.add(new int[]{0, 0}); 
        int sum = 0;
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int weight = curr[1];
            
            if (vis[node]) continue; // If already in MST, skip (prevents cycles)
            
            vis[node] = true;
            sum += weight;
            
            for (int[] edge : adj.get(node)) {
                int adjNode = edge[0];
                int edgeWeight = edge[1];
                if (!vis[adjNode]) {
                    pq.add(new int[]{adjNode, edgeWeight});
                }
            }
        }
        return sum;
    }
}
