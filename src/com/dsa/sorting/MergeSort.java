package com.dsa.sorting;

/**
 * Merge Sort is a sorting algorithm based on the Divide and Conquer technique. <br>
 * <br>
 * It works by dividing the array into two halves until each
 * sub array contains only one element. <br>
 * <br>
 * A single element array is always considered sorted. <br>
 * <br>
 * After dividing, the algorithm starts merging the sub arrays
 * while sorting them in the correct order. <br>
 * <br>
 * During the merge process, elements from the left and right
 * sub arrays are compared, and the smaller element is placed
 * into the original array. <br>
 * <br>
 * This process continues until all sub arrays are merged and
 * the entire array becomes sorted. <br>
 * <br>
 * Example: <br>
 * Original Array: [38, 27, 43, 3] <br>
 * Divide: [38,27] [43,3] <br>
 * Divide again: [38] [27] [43] [3] <br>
 * Merge: [27,38] [3,43] <br>
 * Final Sorted Array: [3,27,38,43] <br>
 * <br>
 * Time Complexity: <br>
 * Best Case  : O(n log n) <br>
 * Average    : O(n log n) <br>
 * Worst Case : O(n log n) <br>
 * <br>
 * Space Complexity: O(n) <br>
 * Stable: Yes
 */
public class MergeSort {

    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            // Find middle index
            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(arr, left, mid);

            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge sorted halves
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data into temporary arrays
        System.arraycopy(arr, left, leftArr, 0, n1);

        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge the arrays
        while (i < n1 && j < n2) {

            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }
}
