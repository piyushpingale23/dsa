package com.dsa.recursion;

public class PowerRecursion {

    public static int power(int x, int n) {

        // Base Case
        if(n == 0)
            return 1;

        // Recursive Case
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {

        int result = power(2, 5);

        System.out.println("Result: " + result);
    }
}
