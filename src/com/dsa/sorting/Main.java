package com.dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;
import static com.dsa.sorting.BubbleSort.bubbleSort;
import static com.dsa.sorting.InsertionSort.insertionSort;
import static com.dsa.sorting.MergeSort.mergeSort;
import static com.dsa.sorting.QuickSort.quickSort;
import static com.dsa.sorting.SelectionSort.selectionSort;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("        DSA SORTING Algorithms         ");
        System.out.println("=======================================");

        System.out.print("\nHow many numbers do you want to sort? : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("\nEnter " + n + " numbers (space separated):");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\n---------------------------------");
        System.out.println("Choose a Sorting Algorithm");
        System.out.println("---------------------------------");
        System.out.println("1. Insertion Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Selection Sort");
        System.out.println("4. Quick Sort");
        System.out.println("5. Merge Sort");
        System.out.println("---------------------------------");
        System.out.print("\nEnter your choice: ");

        int choice = scanner.nextInt();

        System.out.println("\nOriginal Array: " + Arrays.toString(arr));

        switch (choice) {
            case 1:
                insertionSort(arr);
                break;
            case 2:
                bubbleSort(arr);
                break;
            case 3:
                selectionSort(arr);
                break;
            case 4:
                quickSort(arr);
                break;
            case 5:
                mergeSort(arr);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("---------------------------------");
        System.out.println("\n Sorting completed!");
        System.out.println("---------------------------------");
    }

}
