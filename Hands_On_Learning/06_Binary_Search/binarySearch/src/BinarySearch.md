# Binary Search Algorithm

Binary Search is an efficient algorithm used to find an element in a **sorted array**. The array must be **sorted in either ascending or descending order** for binary search to work.

---

## 🔍 How It Works

Binary Search works by repeatedly dividing the search space in half:

1. Compare the target value to the middle element of the array.
2. If the target matches the middle element, the search is complete.
3. If the target is smaller (or larger, depending on the sort order), repeat the process on the half of the array where the target could be located.
4. This continues until the element is found or the search space is exhausted.

This divide-and-conquer approach drastically reduces the number of comparisons needed.

---

## ⏱️ Time Complexity

| Case       | Time Complexity |
|------------|-----------------|
| Best Case  | **O(1)**        | Target is at the middle index on the first check  
| Worst Case | **O(log n)**    | Search space is halved repeatedly until found or empty  

Binary Search is significantly faster than linear search for large datasets due to its logarithmic behavior.

---

## 💾 Space Complexity

| Implementation Type | Space Complexity | Explanation |
|---------------------|------------------|-------------|
| Iterative           | **O(1)**         | Uses only a few variables (`start`, `end`, `mid`) regardless of input size  
| Recursive           | **O(log n)**     | Each recursive call adds a new frame to the call stack  

**Note:** In production-level systems, **iterative** binary search is typically preferred due to its lower memory footprint and better stack safety.

---

## 🧠 Memory Management (Simplified)

- Binary Search doesn't copy the array or allocate extra memory.
- It works **in-place**, meaning all operations are done within the original array.
- In the **iterative** version, memory remains constant.
- In the **recursive** version, each call consumes memory on the stack, growing with the depth of recursion (logarithmic).

---

## ✅ Key Takeaways

- Works only on sorted arrays (ascending or descending)
- Extremely efficient for large datasets
- Reduces comparisons compared to linear search
- Has constant or logarithmic space usage depending on implementation

---

## 📌 Real-World Use Cases

- Searching names in a sorted contact list
- Lookup operations in large databases
- Efficient range detection in time-series data
- Applied in libraries, kernels, finance systems, and low-latency apps

---

> 💡 **Pro Tip:** Always validate the array is sorted before applying binary search. Sorting an unsorted array takes O(n log n) time, which affects total performance.

