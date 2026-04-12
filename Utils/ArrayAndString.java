package Utils;

import java.util.Arrays;

public class ArrayAndString {

    int[] arr = new int[1];
    int n = 1;
    int key = 1;

    Arrays.sort(arr);                     // Ascending
    Arrays.fill(arr, -1);                 // Initialize DP arrays
    int[] copy = Arrays.copyOf(arr, n);    // Clone array
    int[] range = Arrays.copyOfRange(arr, 0, 5); // Slice [start, end)

    // Binary Search (Only on SORTED arrays)
    int idx = Arrays.binarySearch(arr, key); // Returns index, or (-(insertion_point) - 1)



        StringBuilder sb = new StringBuilder();
        String s = "";
    sb.append("abc");
    sb.reverse();
    sb.deleteCharAt(0);
    sb.setCharAt(1, 'z');
    String result = sb.toString();

    // Substrings
    String sub = s.substring(0, 5); // [0, 5)
}
