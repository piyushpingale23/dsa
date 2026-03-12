package com.dsa.searching;

/**
 * Jump Search is a searching algorithm designed for sorted arrays. <br>
 * <br>
 * Instead of checking every element one by one, the algorithm
 * jumps ahead by a fixed number of steps and then performs
 * a linear search within that block. <br>
 * <br>
 * The optimal jump size is generally √n where n is the
 * number of elements in the array. <br>
 * <br>
 * First, the algorithm jumps through the array in blocks
 * until it finds a block where the target element could exist. <br>
 * <br>
 * Then it performs a linear search within that block
 * to find the exact position of the element. <br>
 * <br>
 * Example: <br>
 * Array: [10, 20, 30, 40, 50, 60, 70] <br>
 * Search: 40 <br>
 * Jump size ≈ √7 ≈ 2 <br>
 * Result: Index = 3 <br>
 * <br>
 * Time Complexity: <br>
 * Best Case  : O(1) <br>
 * Average    : O(√n) <br>
 * Worst Case : O(√n) <br>
 * <br>
 * Space Complexity: O(1) <br>
 * Stable: Not applicable
 */
public class JumpSearch {

    public static int jumpSearch(int[] arr, int target) {

        int n = arr.length;
        int step = (int)Math.sqrt(n);
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int)Math.sqrt(n);

            if (prev >= n)
                return -1;
        }

        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target)
                return i;
        }

        return -1;
    }

}
