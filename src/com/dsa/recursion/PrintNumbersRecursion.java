package com.dsa.recursion;

public class PrintNumbersRecursion {

    public static void printNumbers(int n){

        // Base Case
        if(n == 0)
            return;

        // Recursive Call
        printNumbers(n - 1);

        System.out.println(n);
    }

    public static void main(String[] args){
        printNumbers(5);
    }
}
