package Graphs;

import java.util.*;

/**
 * Algorithm: Kahn's Topological Sort (BFS)
 * Time Complexity: O(V + E)
 * Use Case: Ordering DAGs (Directed Acyclic Graphs), Cycle detection in Directed Graphs.
 */
class Topological {

    // Returns the sorted array, or an empty array if a cycle exists
    public int[] topoSort(int V, List<List<Integer>> adj) {
        int[] inDegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int neighbor : adj.get(i)) {
                inDegree[neighbor]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        // Add nodes with no dependencies to start the chain
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) q.add(i);
        }
        
        int[] topo = new int[V];
        int index = 0;
        
        while (!q.isEmpty()) {
            int node = q.poll();
            topo[index++] = node;
            
            for (int neighbor : adj.get(node)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
        }
        
        // If index != V, it means we couldn't process all nodes due to a cycle
        if (index != V) return new int[0]; 
        
        return topo;
    }
}
