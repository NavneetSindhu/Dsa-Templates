package Graphs;

import java.util.*;

/**
 * Algorithm: Graph Traversals (BFS & DFS)
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */
class Traversals {

    public List<Integer> bfs(int V, List<List<Integer>> adj, int startNode) {
        List<Integer> bfsOrder = new ArrayList<>();
        boolean[] vis = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(startNode);
        vis[startNode] = true;
        
        while (!q.isEmpty()) {
            int curr = q.poll();
            bfsOrder.add(curr);
            
            for (int neighbor : adj.get(curr)) {
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        return bfsOrder;
    }

    public void dfs(int node, boolean[] vis, List<List<Integer>> adj, List<Integer> dfsOrder) {
        vis[node] = true;
        dfsOrder.add(node);
        
        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                dfs(neighbor, vis, adj, dfsOrder);
            }
        }
    }
}
