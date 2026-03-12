# DSA Sorting Algorithms in Java

This project demonstrates common **Data Structures & Algorithms (DSA) Sorting Algorithms** implemented using **Plain Java**.
It provides a simple **console-based menu** where users can enter numbers and choose a sorting algorithm to sort them.

---

# Project Features

* Simple console-based program
* User can input any list of numbers
* Choose different sorting algorithms
* Displays original and sorted array
* Clean and beginner-friendly implementations

---

# Project Structure

```
src
 └── com
      └── dsa
           └── sorting
                ├── Main.java
                ├── BubbleSort.java
                ├── SelectionSort.java
                ├── InsertionSort.java
                ├── MergeSort.java
                └── QuickSort.java
```

---

# Implemented Sorting Algorithms

## 1. Insertion Sort

**Idea:**
Builds the sorted array step by step by inserting each element into its correct position.

Example:

```
Input  : [5, 2, 4, 6]
Output : [2, 4, 5, 6]
```

Complexity:

| Case       | Time  |
|------------|-------|
| Best Case  | O(n)  |
| Average    | O(n²) |
| Worst Case | O(n²) |

Space Complexity: **O(1)**
Stable: **Yes**

Best for:

* Small datasets
* Nearly sorted arrays

---

## 2. Selection Sort

**Idea:**
Finds the smallest element and places it at the beginning, repeating for the rest of the array.

Example:

```
Input  : [64, 25, 12, 22]
Output : [12, 22, 25, 64]
```

Complexity:

| Case       | Time  |
|------------|-------|
| Best Case  | O(n²) |
| Average    | O(n²) |
| Worst Case | O(n²) |

Space Complexity: **O(1)**
Stable: **No**

---

## 3. Bubble Sort

**Idea:**
Repeatedly swaps adjacent elements if they are in the wrong order.

Example:

```
Input  : [5, 1, 4, 2]
Output : [1, 2, 4, 5]
```

Complexity:

| Case       | Time  |
|------------|-------|
| Best Case  | O(n)  |
| Average    | O(n²) |
| Worst Case | O(n²) |

Space Complexity: **O(1)**
Stable: **Yes**

---

## 4. Quick Sort

**Idea:**
Uses **divide and conquer**.
Selects a pivot and partitions the array into smaller and larger elements.

Example:

```
Input  : [10, 7, 8, 9, 1, 5]
Output : [1, 5, 7, 8, 9, 10]
```

Complexity:

| Case       | Time       |
|------------|------------|
| Best Case  | O(n log n) |
| Average    | O(n log n) |
| Worst Case | O(n²)      |

Space Complexity: **O(log n)**

Fast in practice and widely used.

---

## 5. Merge Sort

**Idea:**
Divides the array into halves, sorts each half, and merges them.

Example:

```
Input  : [38, 27, 43, 3]
Output : [3, 27, 38, 43]
```

Complexity:

| Case       | Time       |
|------------|------------|
| Best Case  | O(n log n) |
| Average    | O(n log n) |
| Worst Case | O(n log n) |

Space Complexity: **O(n)**
Stable: **Yes**

---

# How to Run

Open the project in an IDE and run the `Main` class.

Example Console Flow:

```
=========================================
         DSA SORTING Algorithms
=========================================

How many numbers do you want to sort? : 5

Enter 5 numbers:
5 2 8 1 3

Choose a Sorting Algorithm
1. Insertion Sort
2. Selection Sort
3. Bubble Sort
4. Quick Sort
5. Merge Sort

Enter your choice: 3

Sorted Array: [1, 2, 3, 5, 8]
```

---

# Future Improvements

* Add more algorithms:

    * Heap Sort
    * Counting Sort
    * Radix Sort

---

# Author

Created as part of **DSA practice using Java**.
