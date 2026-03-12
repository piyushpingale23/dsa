package com.dsa.pointer;

/**
 * One Pointer Technique <br>
 * <br>
 * The One Pointer technique is a simple approach used in Data Structures <br>
 * and Algorithms where a single index (pointer) is used to traverse <br>
 * through a data structure such as an array, string, or list. <br>
 * <br>
 * The pointer moves step-by-step from the beginning to the end <br>
 * (or sometimes from the end to the beginning) and processes each element. <br>
 * <br>
 * This technique is mainly used for: <br>
 * - Traversing arrays or lists <br>
 * - Counting elements <br>
 * - Searching an element <br>
 * - Calculating sum or maximum/minimum values <br>
 * <br>
 * How it works: <br>
 * 1. Initialize a pointer variable (usually i or index). <br>
 * 2. Start from the first element of the array. <br>
 * 3. Move the pointer one step at a time. <br>
 * 4. Perform the required operation on each element. <br>
 * <br>
 * Example: <br>
 * Array: [2, 4, 6, 8] <br>
 * <br>
 * Pointer movement: <br>
 * i = 0 → element = 2 <br>
 * i = 1 → element = 4 <br>
 * i = 2 → element = 6 <br>
 * i = 3 → element = 8 <br>
 * <br>
 * Java Example: <br>
 * <br>
 * int[] arr = {2,4,6,8}; <br>
 * int sum = 0; <br>
 * <br>
 * for(int i = 0; i < arr.length; i++) { <br>
 *     sum += arr[i]; <br>
 * } <br>
 * <br>
 * Time Complexity: <br>
 * O(n) because the array is traversed once. <br>
 * <br>
 * Space Complexity: <br>
 * O(1) because no extra space is required. <br>
 * <br>
 * Advantages: <br>
 * - Simple and easy to implement <br>
 * - Efficient for linear traversal problems <br>
 * <br>
 * Disadvantages: <br>
 * - Cannot optimize problems that require comparing multiple elements at the same time.
 */
public class OnePointer {

    public static void main(String[] args) {

        int[] array = {2, 4, 6, 8, 10};
        int sum = 0;

        for (int i : array) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
