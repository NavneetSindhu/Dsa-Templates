package Utils;

import java.util.Arrays;

/**
 * Utility: Primitive Array Mechanics & Binary Search Bounds
 * Use Case: Fast swapping, reversing, and finding exact insertion points.
 */
class ArrayAlgos {

    public void arrayMethods() {
        int[] arr = {3, 1, 2};
        int n = arr.length;
        int key = 2;

        // 1. Core Array Operations
        Arrays.sort(arr);                     // Ascending
        Arrays.fill(arr, -1);                 // Essential for DP table initialization
        int[] copy = Arrays.copyOf(arr, n);    // Clone/Resize array
        int[] range = Arrays.copyOfRange(arr, 0, 2); // Slice [start, end)

        // 2. Binary Search (Only on SORTED arrays)
        // Returns index of key. If not found, returns (-(insertion_point) - 1)
        int idx = Arrays.binarySearch(arr, key); 
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Lower Bound: Returns index of the FIRST element >= target. 
    // Returns arr.length if no such element exists.
    public static int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = arr.length;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                ans = mid; // Potential answer, check left for an earlier one
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    // Upper Bound: Returns index of the FIRST element strictly > target.
    // Returns arr.length if no such element exists.
    public static int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = arr.length;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                ans = mid; // Potential answer, check left for an earlier one
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
