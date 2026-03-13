package com.dsa.recursion;

public class ReverseStringRecursion {

    public static String reverse(String str){

        // Base Case
        if(str.isEmpty())
            return str;

        // Recursive Case
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args){

        String text = "HELLO";

        System.out.println(reverse(text));
    }
}
