package com.dsa.helper;

public class DsaHelper {

    public static void swapVariables(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
