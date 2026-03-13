# Sliding Window Technique in Data Structures & Algorithms (DSA)

## 1. Introduction

The **Sliding Window** technique is an efficient algorithmic method used to solve problems involving **sub arrays or substrings** in arrays or strings.

Instead of repeatedly calculating values for every possible sub array (which leads to **O(n²)** time complexity), the sliding window technique **reuses previous computations** by moving a window across the data structure.

This significantly improves performance and often reduces the time complexity to **O(n)**.

The technique is widely used in problems involving:

* Sub arrays
* Substrings
* Continuous elements
* Range-based calculations

---

# 2. Basic Idea of Sliding Window

A **window** represents a subset of elements inside an array or string.

Example array:

```
[2, 1, 5, 1, 3, 2]
```

Window size = **3**

```
[2,1,5] 1 3 2
  ↓
2 [1,5,1] 3 2
  ↓
2 1 [5,1,3] 2
  ↓
2 1 5 [1,3,2]
```

Instead of recomputing the entire window each time, we update the result using:

```
New Window Value = Previous Window Value - Element Leaving Window + Element Entering Window
```

This avoids redundant computations.

---

# 3. Types of Sliding Window

There are **two main types of sliding window techniques**.

## 3.1 Fixed Size Sliding Window

In this approach, the **window size remains constant**.

Example problems:

* Maximum sum of sub array of size **k**
* Average of sub arrays of size **k**
* Count distinct elements in window size **k**

Example:

Array:

```
[1,2,3,4,5]
Window Size = 3
```

Windows formed:

```
[1,2,3]
[2,3,4]
[3,4,5]
```

The window simply **slides forward one step at a time**.

---

## 3.2 Variable Size Sliding Window

In this approach, the **window size changes dynamically** based on a condition.

This technique typically uses **two pointers**:

* **Left pointer** → start of the window
* **Right pointer** → end of the window

The algorithm expands the window by moving the **right pointer** and shrinks it by moving the **left pointer**.

Example problems:

* Longest substring without repeating characters
* Smallest sub array with sum ≥ target
* Longest substring with k unique characters

---

# 4. Sliding Window vs Brute Force

## Brute Force Approach

Check every possible sub array.

Example:

```
for i = 0 to n
   for j = i to n
       calculate sum
```

Time Complexity:

```
O(n²)
```

---

## Sliding Window Approach

Reuse previously calculated results and move the window efficiently.

Time Complexity:

```
O(n)
```

This makes sliding window **much faster for large datasets**.

---

# 5. Example 1 – Fixed Size Sliding Window

## Problem

Find the **maximum sum of a sub array of size k**.

Example:

```
Array = [2,1,5,1,3,2]
k = 3
```

Sub arrays:

```
[2,1,5] → 8
[1,5,1] → 7
[5,1,3] → 9
[1,3,2] → 6
```

Maximum sum = **9**

---

## Java Implementation

```java
public class FixedSlidingWindowExample {

    public static int maxSumSubArray(int[] arr, int k) {

        int windowSum = 0;
        int maxSum;

        for(int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        for(int i = k; i < arr.length; i++) {

            windowSum += arr[i];
            windowSum -= arr[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {2,1,5,1,3,2};

        int result = maxSumSubArray(arr,3);

        System.out.println("Maximum Sum = " + result);
    }
}
```

Time Complexity:

```
O(n)
```

---

# 6. Example 2 – Variable Size Sliding Window

## Problem

Find the **smallest sub array whose sum is greater than or equal to a target value**.

Example:

```
Array = [2,3,1,2,4,3]
Target = 7
```

Valid sub arrays:

```
[4,3] → sum = 7
```

Minimum length = **2**

---

## Java Implementation

```java
public class VariableSlidingWindowExample {

    public static int minSubArrayLength(int target, int[] arr) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for(int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while(sum >= target) {

                minLength = Math.min(minLength, right - left + 1);

                sum -= arr[left];
                left++;
            }
        }

        if(minLength == Integer.MAX_VALUE)
            return 0;

        return minLength;
    }

    public static void main(String[] args) {

        int[] arr = {2,3,1,2,4,3};

        int result = minSubArrayLength(7, arr);

        System.out.println("Minimum Length = " + result);
    }
}
```

Time Complexity:

```
O(n)
```

---

# 7. Sliding Window Templates

## Fixed Window Template

```java
public class FixedWindowTemplate {
    public static void main(String[] args) {
        for(int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        for(int i = k; i < n; i++) {

            windowSum += arr[i];
            windowSum -= arr[i-k];
        }
    }
}

```

---

## Variable Window Template

```java
public class VariableWindowTemplate {
    public static void main(String[] args) {
        int left = 0;
        for(int right = 0; right < n; right++) {
            // Expand window
            while(condition) {
                // Shrink window
                left++;
            }
        }
    }
}
```

---

# 8. When to Use Sliding Window

Use the sliding window technique when the problem involves:

* **Contiguous sub arrays**
* **Substrings**
* **Continuous elements**
* **Range calculations**

Common problems include:

* Maximum sum sub array
* Longest substring without repeating characters
* Minimum window substring
* Maximum average sub array
* Count distinct elements in a window
* Longest substring with k distinct characters

---

# 9. Advantages of Sliding Window

Advantages of using sliding window:

* Reduces **time complexity**
* Avoids **repeated calculations**
* Efficient for **large datasets**
* Often reduces **O(n²) problems to O(n)**

---

# 10. Summary

The **Sliding Window Technique** is a powerful optimization method used in **Data Structures and Algorithms** for solving problems related to sub arrays and substrings.

Instead of recalculating results for every window, the algorithm **adds the new element entering the window and removes the element leaving the window**, making the solution highly efficient.

This technique is widely used in **coding interviews, competitive programming, and real-world applications involving streaming data and sequence processing**.
