package Utils;

/**
 * Utility: Primitive Array Mechanics & Binary Search Bounds
 * Use Case: Fast swapping, reversing, and finding exact insertion points.
 */
class ArrayAlgos {

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
