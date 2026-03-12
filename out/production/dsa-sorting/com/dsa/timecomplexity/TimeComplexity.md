# Time Complexity

## 1. Introduction

Time Complexity is a concept that measures **how the running time of an algorithm increases as the input size increases**.

Instead of calculating actual execution time in seconds, time complexity measures the **number of operations performed**.

Example:

If an algorithm processes `n` elements and performs `n` operations, the time complexity is:

```
O(n)
```

This helps developers understand:

* Algorithm efficiency
* Performance for large datasets
* Which algorithm is better

---

# 2. Why Time Complexity is Important

For small inputs, almost all algorithms run fast.

But when data becomes very large, inefficient algorithms become extremely slow.

Example:

Sorting 10 numbers → very fast
Sorting 10,000,000 numbers → algorithm matters

Example comparison:

| Algorithm   | Time Complexity |
|-------------|-----------------|
| Bubble Sort | O(n²)           |
| Merge Sort  | O(n log n)      |

For large data, **Merge Sort is dramatically faster**.

---

# 3. Big-O Notation

Big-O notation describes the **growth rate of an algorithm**.

It represents the **worst-case time complexity**.

Common complexities:

```
O(1)
O(log n)
O(n)
O(n log n)
O(n²)
O(2^n)
O(n!)
```

As `n` grows larger, execution time increases depending on complexity.

---

# 4. Types of Time Complexity

---

# 4.1 Constant Time — O(1)

An algorithm runs in constant time if the number of operations **does not depend on input size**.

Example:

```java
int getFirstElement(int[] arr){
    return arr[0];
}
```

Explanation:

Even if the array contains:

* 10 elements
* 100 elements
* 1 million elements

The operation is always **one step**.

Therefore:

```
Time Complexity = O(1)
```

---

# 4.2 Logarithmic Time — O(log n)

Algorithms with logarithmic complexity **reduce the problem size by half each step**.

Common example: **Binary Search**

Example process:

```
n = 16

Step 1 → 16
Step 2 → 8
Step 3 → 4
Step 4 → 2
Step 5 → 1
```

Number of steps = log₂(n)

Java Example:

```java
int binarySearch(int[] arr, int key){

    int low = 0;
    int high = arr.length - 1;

    while(low <= high){

        int mid = (low + high) / 2;

        if(arr[mid] == key)
            return mid;

        if(arr[mid] < key)
            low = mid + 1;
        else
            high = mid - 1;
    }

    return -1;
}
```

Time Complexity:

```
O(log n)
```

---

# 4.3 Linear Time — O(n)

Linear time means the algorithm processes **each element once**.

Example:

```java
int findSum(int[] arr){

    int sum = 0;

    for (int j : arr) {
        sum += j;
    }

    return sum;
}
```

If array size increases, operations increase proportionally.

```
Operations = n
Time Complexity = O(n)
```

---

# 4.4 Linearithmic Time — O(n log n)

This complexity appears in **efficient sorting algorithms**.

Examples:

* Merge Sort
* Quick Sort (average case)
* Heap Sort

Explanation:

```
Divide array → log n levels
Process each level → n work

Total work = n * log n
```

Therefore:

```
Time Complexity = O(n log n)
```

---

# 4.5 Quadratic Time — O(n²)

Occurs when **nested loops** are used.

Example:

```java
public class NestedLoopsExample {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
```

Operations:

```
n * n = n²
```

Time Complexity:

```
O(n²)
```

Common algorithms:

* Bubble Sort
* Selection Sort
* Insertion Sort (worst case)

---

# 4.6 Exponential Time — O(2ⁿ)

Very slow algorithms.

Common in **recursive problems**.

Example: Fibonacci recursion.

```java
int fib(int n){

    if(n <= 1)
        return n;

    return fib(n-1) + fib(n-2);
}
```

Each call creates **two new calls**.

Therefore:

```
Time Complexity = O(2ⁿ)
```

---

# 4.7 Factorial Time — O(n!)

This is the **worst time complexity**.

Example problem:

Traveling Salesman Problem (Brute Force).

If cities = 10

```
10! = 3,628,800 possibilities
```

Very expensive computation.

---

# 5. Best Case, Average Case, Worst Case

Algorithms can behave differently depending on input.

Example: Linear Search

---

## Best Case

Element found at first index.

```
O(1)
```

---

## Average Case

Element found in middle.

```
O(n/2) → O(n)
```

---

## Worst Case

Element at last index or not present.

```
O(n)
```

---

# 6. Common Time Complexities Table

| Complexity | Name         | Example             |
|------------|--------------|---------------------|
| O(1)       | Constant     | Array access        |
| O(log n)   | Logarithmic  | Binary Search       |
| O(n)       | Linear       | Linear Search       |
| O(n log n) | Linearithmic | Merge Sort          |
| O(n²)      | Quadratic    | Bubble Sort         |
| O(2ⁿ)      | Exponential  | Fibonacci recursion |
| O(n!)      | Factorial    | Traveling Salesman  |

---

# 7. Rules to Calculate Time Complexity

---

## Rule 1: Ignore Constants

```
O(2n) → O(n)
O(100) → O(1)
```

Constants do not matter in Big-O.

---

## Rule 2: Drop Lower Order Terms

```
O(n² + n + 10) → O(n²)
```

The highest growth dominates.

---

## Rule 3: Sequential Loops Add

Example:

```java
public class SequentialLoopsExample {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        
        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }
    }
}
```

Total complexity:

```
O(n + n) = O(n)
```

---

## Rule 4: Nested Loops Multiply

Example:

```java
public class NestedLoopExample {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + j);
            }
        }
    }
}
```

Operations:

```
n * n = n²
```

Therefore:

```
O(n²)
```

---

# 8. Example Time Complexity Analysis

Example 1:

```java
public class LinearTimeExample {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}
```

Operations = n

```
Time Complexity = O(n)
```

---

Example 2:

### Example: Nested Loop (Quadratic Time)

```java
public class NestedLoopExample {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " + " + j + " = " + (i + j));
            }
        }
    }
}
```

Time Complexity:

O(n²)

Operations:

```
n * n = n²
```

```
Time Complexity = O(n²)
```

---

# 9. Growth Rate Comparison

Assume:

```
n = 1000
```

| Complexity | Approx Operations |
|------------|-------------------|
| O(1)       | 1                 |
| O(log n)   | 10                |
| O(n)       | 1000              |
| O(n log n) | 10000             |
| O(n²)      | 1,000,000         |
| O(2ⁿ)      | Extremely large   |

This shows why **efficient algorithms are important**.

---

# 10. Practical Developer Example

Suppose we want to find a number.

### Linear Search

```
O(n)
```

Check every element.

### Binary Search

```
O(log n)
```

Divide array repeatedly.

Binary search is **much faster for large data**.

---

# 11. Summary

Important points:

* Time complexity measures algorithm efficiency
* Big-O notation represents worst-case growth
* Lower complexity means faster algorithms
* Always prefer efficient algorithms for large datasets

Best complexities:

```
O(1)
O(log n)
O(n)
O(n log n)
```

Avoid when possible:

```
O(n²)
O(2ⁿ)
O(n!)
```

---

| n    | O(1) | O(log n) | O(n) | O(n log n) | O(n²)   |
|------|------|----------|------|------------|---------|
| 10   | 1    | 3        | 10   | 33         | 100     |
| 100  | 1    | 7        | 100  | 664        | 10000   |
| 1000 | 1    | 10       | 1000 | 9965       | 1000000 |

---

# End of Notes
