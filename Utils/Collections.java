package Utils;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Collections {
    // Map - Count frequencies
    map.put(key, map.getOrDefault(key, 0) + 1);

    // PriorityQueue (Min-Heap by default)
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

    // Deque (Double-ended queue - used for Slidng Window / BFS)
    Deque<Integer> dq = new LinkedList<>();
    dq.addLast(x);
    dq.removeFirst();
    dq.peekFirst();
    
}
