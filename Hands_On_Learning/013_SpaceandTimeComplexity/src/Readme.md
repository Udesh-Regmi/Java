# 🚀 Time and Space Complexity – A Beginner to Pro-Level Guide

Understanding time and space complexity is critical in designing efficient algorithms and writing scalable software. This document breaks down the concepts in a clean, digestible format.

---

## 🧠 What is Time Complexity?

**Time complexity ≠ Time taken to run the program.**

Time complexity is a **mathematical function** that represents **how the execution time of an algorithm grows** with respect to the **input size `N`**.

> ✅ **It is machine-independent.**  
> ✅ **It ignores hardware and environment factors.. **

---

### 🧩 Why Time Complexity Matters

- Allows us to compare algorithms independently of hardware.
- Helps in predicting scalability for very large datasets.
- Provides worst-case guarantees.

---

## 🧠 What is Space Complexity?

**Space Complexity** refers to the total amount of memory used by an algorithm (including input, auxiliary space, and recursion stack) as a function of the input size `N`.

---

## 🔍 What to Focus On When Analyzing Complexity?

- ✅ Focus on **worst-case time** complexity.
- ✅ Think about how your algorithm behaves for **large or infinite input sizes**.
- ✅ **Ignore constants** when analyzing growth.  
  E.g., O(2N) → O(N)
- ✅ **Ignore less dominating terms**.  
  E.g., O(N³ + log N) → O(N³)

---

## 💡 Example: Linear Search

```
int[] arr = {1, 2, 3, 4, 5};
int target = 4;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        return i;
    }
}
```


## 🧮 Big-O Notation O()
### 🔤 Word-Level Definition:
* O(N³) means the algorithm’s runtime will not exceed N³ operations for large inputs.

* It can still run faster (e.g., O(N²), O(N log N)) for certain inputs — but it never grows beyond N³.

* Big-O is an upper bound, it tells us the worst-case scenario.


### Mathematical Definition: 
* lim
x->infinity f(x)/g(x) < 0
 
### 🧪 Common Complexities Table

| Complexity | Name         | Example Scenarios                        |
| ---------- | ------------ | ---------------------------------------- |
| O(1)       | Constant     | Accessing array by index                 |
| O(log N)   | Logarithmic  | Binary Search                            |
| O(N)       | Linear       | Linear Search, Sum of Array              |
| O(N log N) | Linearithmic | Merge Sort, Quick Sort (avg case)        |
| O(N²)      | Quadratic    | Bubble Sort, Insertion Sort              |
| O(2^N)     | Exponential  | Recursive Fibonacci, Subset Problems     |
| O(N!)      | Factorial    | Traveling Salesman, N-Queens Brute Force |


## 🧭 Big-Omega Notation `Ω()`

### 🔤 Word-Level Definition:

- **Big-Omega (Ω)** represents the **best-case lower bound** of an algorithm's time or space complexity.
- It tells us the **minimum number of operations** that an algorithm will perform **regardless of optimizations or lucky inputs**.
- Just like Big-O is used for worst-case, **Big-Omega is for best-case**.

> 💬 Example:  
> In **Linear Search**,
> - Best Case: The element is at the first index → 1 operation → **Ω(1)**
> - Worst Case: Element not present or at end → **O(N)**

---

### 🧠 Mathematical Definition of Big-Omega:

Let `f(N)` be the actual time taken by the algorithm.

We say:

f(N) = Ω(g(N)) if there exist constants C > 0 and N₀ such that:
f(N) ≥ C * g(N) for all N ≥ N₀


Where:
- `g(N)` is the bounding function from below.
- `C` is a positive constant.
- `N₀` is the input size after which this lower bound holds.

---

### 🧪 When to Use Big-Omega?

- To describe the **best performance guarantee**.
- Important in **theoretical analysis** and **algorithm lower bounds**.
- Useful when showing **no algorithm can do better than Ω(N log N)** for certain problems (like comparison-based sorting).

---

### 🧠 Common Examples

| Algorithm           | Best Case       | Ω Notation     |
|---------------------|------------------|-----------------|
| Linear Search       | Element at start | Ω(1)            |
| Binary Search       | First guess hit  | Ω(1)            |
| Insertion Sort      | Sorted input     | Ω(N)            |
| Merge Sort          | Always same      | Ω(N log N)      |
| Recursive Fibonacci | Recursive Tree   | Ω(2^N)          |

---

📌 **Note**:  
Big-Omega gives you **hope** — but in production, we must code defensively and optimize for **Big-O (worst-case)**, not just Omega.

---


## ⚖️ Big-Theta Notation `Θ()`

### 🔤 Word-Level Definition:

- **Big-Theta (Θ)** describes the **tight bound** on an algorithm’s growth.
- It gives both:
  - **Lower bound** (like Ω)
  - **Upper bound** (like O)

> In simple terms:  
> The algorithm **always** takes this amount of time — **not more, not less** — up to a constant factor.

So, if an algorithm is Θ(N²), that means:
- It **won’t take less** than N² time (Ω)
- It **won’t take more** than N² time (O)
- Hence, it **always behaves like N²** for large input sizes

---

### 🧠 Mathematical Definition of Big-Theta:

Let `f(N)` be the time or space function of the algorithm.

We say:
```

f(N) = Θ(g(N)) if there exist constants C₁ > 0, C₂ > 0, and N₀ such that:
C₁ \* g(N) ≤ f(N) ≤ C₂ \* g(N)   for all N ≥ N₀

```

This tells us:
- The function is **sandwiched** between two constant multiples of `g(N)`
- It’s a **tight asymptotic bound**

---

### 📌 Why Big-Theta is Important

- It **precisely characterizes** an algorithm's behavior.
- Useful when **best-case and worst-case** are the same (e.g., Merge Sort).
- Helps in understanding **algorithm efficiency in all scenarios**, not just optimistic or pessimistic cases.

---

### 🧪 Common Examples

| Algorithm           | Tight Bound         | Θ Notation      |
|---------------------|----------------------|------------------|
| Merge Sort          | Always Θ(N log N)    | Θ(N log N)       |
| Binary Search       | Always Θ(log N)      | Θ(log N)         |
| Linear Search       | Worst O(N), Best Ω(1)| ❌ Not Θ(N)       |
| Insertion Sort      | Best Ω(N), Worst O(N²) | ❌ Not Θ(N²)     |
| Selection Sort      | Always Θ(N²)         | Θ(N²)            |

---

### ✅ When Can We Use Θ?

- Only when **best-case = worst-case = average-case (asymptotically)**
- Cannot be used if algorithm has **varying performance across inputs**

---

📚 **Rule of Thumb**  
> Use Θ when the algorithm’s time or space complexity is **well-characterized and stable** for all input patterns.

---






