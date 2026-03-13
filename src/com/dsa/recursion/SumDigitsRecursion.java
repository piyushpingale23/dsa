package com.dsa.recursion;

public class SumDigitsRecursion {

    public static int sumDigits(int n) {

        // Base Case
        if(n == 0)
            return 0;

        // Recursive Case
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {

        int number = 1234;

        System.out.println("Sum of digits: " + sumDigits(number));
    }
}
