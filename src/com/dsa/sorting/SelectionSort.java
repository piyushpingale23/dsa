package com.dsa.sorting;

import com.dsa.helper.DsaHelper;

/**
 * Selection Sort is a simple sorting algorithm that repeatedly <br>
 * finds the smallest element from the unsorted part of the array <br>
 * and places it at the correct position in the sorted part. <br>
 * <br>
 * In each pass, the minimum element is selected and swapped with the first unsorted element.
 * <br>
 * Example: <br>
 * Input  : [64, 25, 12, 22, 11] <br>
 * Output : [11, 12, 22, 25, 64] <br>
 * <br>
 * Time Complexity: <br>
 * Best Case    : O(n^2) <br>
 * Average Case : O(n^2) <br>
 * Worst Case   : O(n^2) <br>
 * <br>
 * Space Complexity: O(1) <br>
 * Stable: No
 */
public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            DsaHelper.swapVariables(arr, minIndex, i);
        }
    }
}
