package com.dsa.recursion;

public class BinarySearchRecursion {

    public static int binarySearch(int[] arr, int left, int right, int target) {

        // Base Case
        if(left > right)
            return -1;

        int mid = (left + right) / 2;

        if(arr[mid] == target)
            return mid;

        if(target < arr[mid])
            return binarySearch(arr, left, mid - 1, target);

        return binarySearch(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,12,14};

        int result = binarySearch(arr, 0, arr.length - 1, 10);

        System.out.println("Element found at index: " + result);
    }
}
