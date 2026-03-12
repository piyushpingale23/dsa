package com.dsa.searching;

import java.util.Arrays;
import java.util.Scanner;
import static com.dsa.searching.LinearSearch.linearSearch;
import static com.dsa.searching.BinarySearch.binarySearch;
import static com.dsa.searching.JumpSearch.jumpSearch;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("        DSA SEARCHING Algorithms         ");
        System.out.println("=========================================");

        System.out.print("\nHow many numbers do you want to enter? : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("\nEnter " + n + " numbers (space separated):");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\n---------------------------------");
        System.out.println("Choose a Searching Algorithm");
        System.out.println("---------------------------------");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.println("3. Jump Search");
        System.out.println("---------------------------------");
        System.out.print("\nEnter your choice: ");

        int choice = scanner.nextInt();

        System.out.print("\nEnter number to search: ");
        int target = scanner.nextInt();

        System.out.println("\nArray: " + Arrays.toString(arr));

        int result;

        switch (choice) {

            case 1:
                result = linearSearch(arr, target);
                break;
            case 2:
                Arrays.sort(arr);
                System.out.println("Sorted Array: " + Arrays.toString(arr));
                result = binarySearch(arr, target);
                break;
            case 3:
                Arrays.sort(arr);
                System.out.println("Sorted Array: " + Arrays.toString(arr));
                result = jumpSearch(arr, target);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        if (result != -1) {
            System.out.println("\nElement found at index: " + result);
        } else {
            System.out.println("\nElement not found.");
        }

        System.out.println("---------------------------------");
        System.out.println(" Searching completed!");
        System.out.println("---------------------------------");
    }
}