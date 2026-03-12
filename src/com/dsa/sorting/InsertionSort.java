package com.dsa.sorting;

/**
 * Insertion Sort is a simple sorting algorithm. <br>
 * <br>
 * It works by taking one element at a time and inserting it <br>
 * into its correct position in the already sorted part of the array. <br>
 * <br>
 * It is similar to how we sort playing cards in our hand. </br>
 * <br>
 * Time Complexity: <br>
 * Best Case  : O(n) <br>
 * Average    : O(n^2) <br>
 * Worst Case : O(n^2) <br>
 * <br>
 * Space Complexity: O(1) <br>
 * Stable: Yes
 */
public class InsertionSort {

    public static void insertionSort(int[] arr) {

        int arrLength = arr.length;

        for (int i = 1; i < arrLength; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
