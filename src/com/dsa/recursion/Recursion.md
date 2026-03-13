# Recursion in Data Structures & Algorithms (DSA)

## What is Recursion?

Recursion is a programming technique where a **function calls itself** in order to solve a problem.

Instead of solving the whole problem at once, recursion **breaks the problem into smaller subproblems of the same type** until it reaches a condition where it stops. This stopping condition is called the **Base Case**.

A recursive function always contains two important parts:

1. **Base Case** – Condition where recursion stops.
2. **Recursive Case** – Function calls itself with a smaller input.

If the base case is missing, the program will run indefinitely and eventually cause a **StackOverflowError**.

---

# Structure of a Recursive Function

```java
returnType functionName(parameters){

    // Base Case
    if(condition){
        return value;
    }

    // Recursive Case
    return functionName(smallerInput);
}