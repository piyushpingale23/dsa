package com.dsa.recursion;

public class SumRecursion {

    public static int sum(int n){

        // Base Case
        if(n == 1)
            return 1;

        // Recursive Case
        return n + sum(n - 1);
    }

    public static void main(String[] args){

        int result = sum(5);

        System.out.println("Sum is: " + result);
    }
}
