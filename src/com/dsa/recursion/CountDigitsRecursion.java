package com.dsa.recursion;

public class CountDigitsRecursion {

    public static int countDigits(int n) {

        // Base Case
        if(n == 0)
            return 0;

        // Recursive Case
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {

        int number = 12345;

        System.out.println("Digits: " + countDigits(number));
    }
}
