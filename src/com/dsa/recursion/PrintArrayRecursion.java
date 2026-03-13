package com.dsa.recursion;

public class PrintArrayRecursion {

    public static void printArray(int[] arr, int index){

        // Base Case
        if(index == arr.length)
            return;

        System.out.println(arr[index]);

        // Recursive Call
        printArray(arr, index + 1);
    }

    public static void main(String[] args){

        int[] arr = {10,20,30,40};

        printArray(arr, 0);
    }
}
