package com.dsa.sorting;

import com.dsa.helper.DsaHelper;

/**
 * Bubble Sort is a simple sorting algorithm that repeatedly compares two adjacent elements <br>
 * and swaps them if they are in the wrong order. <br>
 * <br>
 * In each pass, the largest element "bubbles up" to its correct position at the end of the array. <br>
 * <br>
 * Example: <br>
 * Input  : [5, 1, 4, 2] <br>
 * Output : [1, 2, 4, 5] <br>
 * <br>
 * Time Complexity: <br>
 * Best Case    : O(n)    (when array is already sorted) <br>
 * Average Case : O(n^2) <br>
 * Worst Case   : O(n^2) <br>
 * <br>
 * Space Complexity: O(1) <br>
 * Stable: Yes
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        int arrLength = arr.length;

        for (int i = 0; i < arrLength; i++) {

            for (int j = 1; j < arrLength - i - 1; j++) {
                if (arr[i] > arr[j]) {
                    DsaHelper.swapVariables (arr, i, j);
                }
            }
        }
    }


}
