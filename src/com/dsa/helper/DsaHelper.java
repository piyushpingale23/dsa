package com.dsa.helper;

public class DsaHelper {

    public static void swapVariables(int[] arr, int i, int i1) {

        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
