package com.dsa.recursion;

public class FibonacciRecursion {

    public static int fibonacci(int n){

        // Base Case
        if(n <= 1)
            return n;

        // Recursive Case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args){

        int n = 7;

        for(int i = 0; i < n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}
