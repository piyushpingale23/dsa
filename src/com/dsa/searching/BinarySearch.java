package com.dsa.searching;

/**
 * Binary Search is an efficient searching algorithm that works
 * on sorted arrays. <br>
 * <br>
 * It follows the Divide and Conquer technique by repeatedly
 * dividing the search space into two halves. <br>
 * <br>
 * The algorithm starts by comparing the target element with
 * the middle element of the array. <br>
 * <br>
 * If the target is equal to the middle element, the index
 * is returned. <br>
 * <br>
 * If the target is smaller than the middle element,
 * the search continues in the left half of the array. <br>
 * <br>
 * If the target is greater than the middle element,
 * the search continues in the right half of the array. <br>
 * <br>
 * This process continues until the element is found
 * or the search space becomes empty. <br>
 * <br>
 * Example: <br>
 * Array: [10, 20, 30, 40, 50] <br>
 * Search: 30 <br>
 * Result: Index = 2 <br>
 * <br>
 * Time Complexity: <br>
 * Best Case  : O(1) <br>
 * Average    : O(log n) <br>
 * Worst Case : O(log n) <br>
 * <br>
 * Space Complexity: O(1) <br>
 * Stable: Not applicable
 */
public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }
}
