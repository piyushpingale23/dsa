# Space Complexity

## 1. Introduction

Space Complexity measures **how much memory an algorithm uses as the input size increases**.

It includes memory used by:

- Variables
- Data structures
- Function calls (recursion stack)

Instead of measuring memory in bytes, we use **Big-O notation** to describe how memory usage grows with input size.

Example:

If an algorithm requires memory proportional to `n`, then:

```
Space Complexity = O(n)
```

Space complexity helps developers understand:

- Memory efficiency
- Scalability of algorithms
- Performance with large datasets

---

# 2. Why Space Complexity is Important

Memory is a **limited resource**.

If an algorithm uses too much memory, it may:

- Slow down the program
- Cause memory overflow
- Crash the system

Example:

Processing **10 numbers** requires little memory.

Processing **10,000,000 numbers** requires much more memory.

Efficient algorithms should balance:

```
Time Complexity
Space Complexity
```

Sometimes developers **use more memory to improve speed**.

Example:

Using **HashMap** for faster searching.

---

# 3. Types of Space Used in Algorithms

Space complexity mainly consists of two parts:

## 3.1 Input Space

Memory required to store the input data.

Example:

```java
int[] arr = new int[100];
```

This memory is **given by the user input**.

---

## 3.2 Auxiliary Space

Extra memory used by the algorithm **excluding input space**.

Example:

```java
int sum = 0;
```

Here `sum` is **auxiliary space**.

---

# 4. Constant Space — O(1)

Constant space means the algorithm uses **fixed memory**, regardless of input size.

Example:

```java
public class ConstantSpaceExample {

    public static int findMax(int a, int b){

        if(a > b)
            return a;
        else
            return b;

    }

}
```

Memory used:

```
a
b
```

Even if inputs grow larger, memory usage **does not increase**.

Therefore:

```
Space Complexity = O(1)
```

---

# 5. Linear Space — O(n)

Linear space means memory grows **proportionally with input size**.

Example:

```java
public class LinearSpaceExample {

    public static int[] copyArray(int[] arr){

        int[] newArray = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            newArray[i] = arr[i];
        }

        return newArray;

    }

}
```

If array size = `n`

New array size = `n`

Therefore:

```
Space Complexity = O(n)
```

---

# 6. Quadratic Space — O(n²)

Occurs when algorithms create **2D structures**.

Example:

```java
public class MatrixExample {

    public static int[][] createMatrix(int n){

        return matrix;

    }

}
```

Memory required:

```
n × n
```

Therefore:

```
Space Complexity = O(n²)
```

---

# 7. Logarithmic Space — O(log n)

Occurs in recursive algorithms that **divide the problem into halves**.

Example: Recursive Binary Search.

```java
public class BinarySearchExample {

    public static int binarySearch(int[] arr, int low, int high, int key){

        if(low > high)
            return -1;

        int mid = (low + high) / 2;

        if(arr[mid] == key)
            return mid;

        if(arr[mid] > key)
            return binarySearch(arr, low, mid - 1, key);

        return binarySearch(arr, mid + 1, high, key);

    }

}
```

Each recursive call adds **one stack frame**.

Number of recursive calls:

```
log₂(n)
```

Therefore:

```
Space Complexity = O(log n)
```

---

# 8. Space Complexity in Recursion

Recursive functions use **stack memory**.

Example:

```java
public class FactorialExample {

    public static int factorial(int n){

        if(n == 0)
            return 1;

        return n * factorial(n - 1);

    }

}
```

If `n = 5`

Stack calls:

```
factorial(5)
factorial(4)
factorial(3)
factorial(2)
factorial(1)
```

Total stack frames = `n`

Therefore:

```
Space Complexity = O(n)
```

---

# 9. Iterative vs Recursive Space

## Iterative Approach

```java
public static int factorial(int n){

    int result = 1;

    for(int i = 1; i <= n; i++){
        result *= i;
    }

    return result;

}
```

Memory used:

```
result
i
```

```
Space Complexity = O(1)
```

---

## Recursive Approach

Recursive factorial:

```
Space Complexity = O(n)
```

Because of the **call stack**.

---

# 10. Common Space Complexities Table

| Space Complexity | Name | Example |
|------------------|------|---------|
| O(1) | Constant | Swap two numbers |
| O(log n) | Logarithmic | Binary Search recursion |
| O(n) | Linear | Copy array |
| O(n²) | Quadratic | Matrix storage |

---

# 11. Example Space Complexity Analysis

Example:

```java
public class Example {

    public static void printNumbers(int n){

        for(int i = 0; i < n; i++){
            System.out.println(i);
        }

    }

}
```

Memory used:

```
i
n
```

No additional data structures.

Therefore:

```
Space Complexity = O(1)
```

Even though:

```
Time Complexity = O(n)
```

---

# 12. Example with Extra Memory

Example:

```java
public class Example {

    public static int[] createArray(int n){

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = i;
        }

        return arr;

    }

}
```

Memory allocated:

```
arr[n]
```

Therefore:

```
Space Complexity = O(n)
```

---

# 13. Time vs Space Tradeoff

Sometimes we **increase memory usage to reduce time complexity**.

Example:

### Without HashMap

Searching element in array:

```
Time Complexity = O(n)
Space Complexity = O(1)
```

### With HashMap

```
Time Complexity = O(1)
Space Complexity = O(n)
```

Tradeoff:

```
More memory → faster execution
```

---

# 14. Practical Developer Example

Suppose we want to reverse an array.

### Method 1: Using Extra Array

```
Space Complexity = O(n)
```

### Method 2: In-place Swap

```
Space Complexity = O(1)
```

Better solution:

```
In-place algorithm
```

---

# 15. Summary

Important points:

- Space complexity measures **memory usage of an algorithm**
- Includes **variables, data structures, recursion stack**
- Written using **Big-O notation**
- Efficient algorithms balance **time and space**

Best space complexities:

```
O(1)
O(log n)
```

Avoid large memory usage when possible:

```
O(n²)
```

---

# Time vs Space Example

| Algorithm | Time Complexity | Space Complexity |
|----------|----------------|------------------|
| Linear Search | O(n) | O(1) |
| Binary Search | O(log n) | O(1) |
| Merge Sort | O(n log n) | O(n) |
| Quick Sort | O(n log n) | O(log n) |

---

# End of Notes