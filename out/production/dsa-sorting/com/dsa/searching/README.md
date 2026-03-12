# DSA Searching Algorithms in Java

This project demonstrates common **Data Structures & Algorithms (DSA) Searching Algorithms** implemented using **Plain Java**.  
It provides a simple **console-based menu** where users can enter numbers and search for a specific value using different searching algorithms.

---

# Project Features

* Simple console-based program
* User can input any list of numbers
* Choose different searching algorithms
* Enter a target element to search
* Displays the index of the found element
* Clean and beginner-friendly implementations

---

# Project Structure

```
src
 └── com
      └── dsa
           └── searching
                ├── Main.java
                ├── BinarySearch.java
                ├── JumpSearch.java
                ├── LinerSearch.java
```

---

# Implemented Searching Algorithms

## 1. Linear Search

**Idea:**  
Linear Search checks each element one by one until the target element is found.

Example:

```
Array : [10, 20, 30, 40]
Search : 30
Result : Index = 2
```

Complexity:

| Case       | Time |
|------------|------|
| Best Case  | O(1) |
| Average    | O(n) |
| Worst Case | O(n) |

Space Complexity: **O(1)**

Best for:

* Small datasets
* Unsorted arrays

---

## 2. Binary Search

**Idea:**  
Binary Search works on **sorted arrays**.  
It repeatedly divides the search space in half until the element is found.

Example:

```
Array : [10, 20, 30, 40, 50]
Search : 30
Result : Index = 2
```

Complexity:

| Case       | Time     |
|------------|----------|
| Best Case  | O(1)     |
| Average    | O(log n) |
| Worst Case | O(log n) |

Space Complexity: **O(1)**

Binary Search is **much faster than Linear Search for large datasets**.

---

## 3. Jump Search

**Idea:**  
Jump Search works on **sorted arrays**.  
Instead of checking every element, it jumps ahead by fixed steps (√n) and then performs a linear search within that block.

Example:

```
Array : [10, 20, 30, 40, 50, 60, 70]
Search : 40
Result : Index = 3
```

Complexity:

| Case       | Time  |
|------------|-------|
| Best Case  | O(1)  |
| Average    | O(√n) |
| Worst Case | O(√n) |

Space Complexity: **O(1)**

---

# How to Run

Open the project in an IDE and run the `Main` class.

Example Console Flow:

```

===========================================
         DSA SEARCHING Algorithms         
===========================================

How many numbers do you want to enter? : 5

Enter 5 numbers:
10 20 30 40 50

Choose a Searching Algorithm:
1. Linear Search
2. Binary Search
3. Jump Search

Enter your choice: 2

Enter number to search: 30

Element found at index: 2
```

---

# Future Improvements

Add more searching algorithms:

* Interpolation Search
* Exponential Search
* Ternary Search
* Fibonacci Search

---

# Author

Created as part of **DSA practice using Java**.