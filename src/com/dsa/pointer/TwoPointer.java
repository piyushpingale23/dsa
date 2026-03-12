package com.dsa.pointer;

/**
 * Two Pointer Technique <br>
 * <br>
 * The Two Pointer technique is an algorithmic approach used in Data Structures <br>
 * and Algorithms where two indices (pointers) are used to traverse a data structure <br>
 * such as an array, string, or list simultaneously. <br>
 * <br>
 * The two pointers can move in different ways depending on the problem: <br>
 * - Towards each other (start and end) <br>
 * - In the same direction <br>
 * - At different speeds <br>
 * <br>
 * This technique helps reduce time complexity in many problems by avoiding <br>
 * nested loops and reducing O(n²) solutions to O(n). <br>
 * <br>
 * This technique is mainly used for: <br>
 * - Finding pairs with a given sum in a sorted array <br>
 * - Checking palindromes <br>
 * - Removing duplicates from sorted arrays <br>
 * - Sliding window problems <br>
 * - Partitioning arrays <br>
 * <br>
 * How it works: <br>
 * 1. Initialize two pointer variables (commonly left and right). <br>
 * 2. One pointer starts from the beginning and the other from the end. <br>
 * 3. Compare elements using both pointers. <br>
 * 4. Move the pointers based on the condition of the problem. <br>
 * <br>
 * Example: <br>
 * Array: [1, 2, 3, 4, 6, 8] <br>
 * Target Sum = 10 <br>
 * <br>
 * Pointer movement: <br>
 * left = 0 → element = 1 <br>
 * right = 5 → element = 8 <br>
 * <br>
 * 1 + 8 = 9 (less than 10) → move left pointer <br>
 * <br>
 * left = 1 → element = 2 <br>
 * right = 5 → element = 8 <br>
 * <br>
 * 2 + 8 = 10 → Target Found <br>
 * <br>
 * Java Example: <br>
 * <br>
 * int[] arr = {1, 2, 3, 4, 6, 8}; <br>
 * int target = 10; <br>
 * <br>
 * int left = 0; <br>
 * int right = arr.length - 1; <br>
 * <br>
 * while (left < right) { <br>
 *     int sum = arr[left] + arr[right]; <br>
 * <br>
 *     if (sum == target) { <br>
 *         System.out.println("Pair Found: " + arr[left] + ", " + arr[right]); <br>
 *         break; <br>
 *     } else if (sum < target) { <br>
 *         left++; <br>
 *     } else { <br>
 *         right--; <br>
 *     } <br>
 * } <br>
 * <br>
 * Time Complexity: <br>
 * O(n) because the array is traversed once using two pointers. <br>
 * <br>
 * Space Complexity: <br>
 * O(1) because no extra space is required. <br>
 * <br>
 * Advantages: <br>
 * - Reduces time complexity from O(n²) to O(n) in many problems <br>
 * - Efficient for sorted arrays and pair searching problems <br>
 * <br>
 * Disadvantages: <br>
 * - Mostly works effectively when the array is sorted <br>
 * - Not suitable for all types of problems
 */
public class TwoPointer {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 8};
        int target = 10;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + " + " + arr[right] + " = " + target);
                break;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
    }

}
