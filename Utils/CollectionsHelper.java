package Utils;

import java.util.*;

public class CollectionsHelper {
    
    public void mapExamples() {
        Map<Integer, Integer> map = new HashMap<>();
        int key = 1;

        // 1. Classic frequency counter
        map.put(key, map.getOrDefault(key, 0) + 1);

        // 2. computeIfAbsent (The Game Changer)
        // Use Case: Grouping items (like an Adjacency List for Graphs)
        Map<Integer, List<Integer>> adj = new HashMap<>();
        
        // Instead of checking if list exists, creating it, then adding...
        // This does it all in one line:
        adj.computeIfAbsent(1, k -> new ArrayList<>()).add(2);
        
        /* How it works:
           - If key '1' exists, it returns the existing list.
           - If key '1' is missing, it runs the "k -> new ArrayList<>()" function, 
             puts the new list in the map, and then returns it.
        */
    }

    public void heapExamples() {
        // PriorityQueue (Min-Heap by default)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Max-Heap (Descending)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        
        // Custom Object Heap (e.g., sorting pairs by weight)
        PriorityQueue<int[]> pairHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
    }

    public void dequeExamples() {
        // Deque (Double-ended queue - used for Sliding Window / BFS)
        Deque<Integer> dq = new ArrayDeque<>(); // ArrayDeque is faster than LinkedList for stacks/queues
        
        int x = 10;
        dq.addLast(x);      // Push to back
        dq.addFirst(x);     // Push to front
        dq.removeFirst();   // Pop from front
        dq.removeLast();    // Pop from back
        dq.peekFirst();     // Look at front
        dq.peekLast();      // Look at back
    }
}