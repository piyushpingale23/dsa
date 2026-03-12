package com.dsa.searching;

/**
 * Linear Search is the simplest searching algorithm. <br>
 * <br>
 * It works by checking each element of the array one by one
 * until the target element is found or the array ends. <br>
 * <br>
 * It does not require the array to be sorted. <br>
 * <br>
 * The algorithm starts from the first element and compares
 * each element with the target value. If a match is found,
 * the index of that element is returned. <br>
 * <br>
 * If the element is not found after checking all elements,
 * the algorithm returns -1. (element not found) <br>
 * <br>
 * Example: <br>
 * Array: [10, 20, 30, 40] <br>
 * Search: 30 <br>
 * Result: Index = 2 <br>
 * <br>
 * Time Complexity: <br>
 * Best Case  : O(1) <br>
 * Average    : O(n) <br>
 * Worst Case : O(n) <br>
 * <br>
 * Space Complexity: O(1) <br>
 * Stable: Yes
 */
public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
