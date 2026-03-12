package com.dsa.sorting;

/**
 * Quick Sort is a fast and widely used sorting algorithm based on
 * the Divide and Conquer technique. <br>
 * <br>
 * It works by selecting a pivot element from the array and
 * partitioning the other elements into two groups: <br>
 * <br>
 * 1. Elements smaller than the pivot <br>
 * 2. Elements greater than the pivot <br>
 * <br>
 * After partitioning, the pivot element is placed in its correct
 * sorted position in the array. <br>
 * <br>
 * The same process is then applied recursively to the left and
 * right sub arrays until the entire array is sorted. <br>
 * <br>
 * Pivot can be chosen in multiple ways: <br>
 * - First element <br>
 * - Last element <br>
 * - Middle element <br>
 * - Random element <br>
 * <br>
 * Time Complexity: <br>
 * Best Case  : O(n log n) <br>
 * Average    : O(n log n) <br>
 * Worst Case : O(n^2) <br>
 * <br>
 * Worst case occurs when the pivot chosen is always the
 * smallest or largest element in the array. <br>
 * <br>
 * Space Complexity: O(log n) (due to recursion stack) <br>
 * Stable: No
 */
public class QuickSort {

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
