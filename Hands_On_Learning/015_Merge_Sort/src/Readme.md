
# 📚 Merge Sort - Comprehensive Guide

---

## 🔍 What is Merge Sort?

**Merge Sort** is a **divide-and-conquer** algorithm that divides the input array into smaller sub-arrays, recursively sorts them, and then **merges** the sorted sub-arrays to produce the final sorted array.

It is a **stable** and **comparison-based** sorting algorithm and guarantees **O(n log n)** time complexity, making it suitable for large datasets and linked list sorting.

---

## 🧠 Why Merge Sort?

- ✅ **Consistent O(n log n) performance** for worst, average, and best cases.
- ✅ **Stable sort** (preserves order of equal elements).
- ✅ **Preferred for linked lists** and **external sorting** (e.g., sorting very large files).
- ❌ Not in-place (requires additional memory), so not ideal for memory-constrained environments.

---

## 🛠️ Merge Sort Algorithm – Step-by-Step Approach

### 1. **Divide**  
Split the array into two halves.

### 2. **Conquer**  
Recursively sort both halves.

### 3. **Combine (Merge)**  
Merge the sorted halves into one sorted array.

### 🔁 Recursive Strategy

```java
void mergeSort(int[] arr, int left, int right) {
    if (right - left <= 1) return; // Base case
    int mid = (left + right) / 2;
    mergeSort(arr, left, mid);     // Sort left half
    mergeSort(arr, mid, right);    // Sort right half
    merge(arr, left, mid, right);  // Merge both halves
}
````

---

## ⏱️ Time and Space Complexity

| Case    | Time Complexity | Space Complexity | Explanation                              |
| ------- | --------------- | ---------------- | ---------------------------------------- |
| Best    | O(n log n)      | O(n)             | Always splits in half and merges         |
| Average | O(n log n)      | O(n)             | Divide + Merge consistently log n levels |
| Worst   | O(n log n)      | O(n)             | Even in reverse-sorted input             |

* Space is `O(n)` due to the auxiliary array used during merge.
* Not in-place due to copying during the merge step.

---

## 🧩 Real-World Use Cases

* **Sorting Linked Lists**: Linked lists can't do binary partitioning easily; Merge Sort avoids index-based operations.
* **External Sorting**: Merge sort works well with large files by sorting chunks and merging them.
* **Stable Sorting Required**: Banking systems, transactional logs, etc., require stability in sort.

---

## 🧪 Problems Solvable Using Merge Sort

1. **Count Inversions in Array**
   Track how far elements are from the sorted position.

2. **Sort Linked List in O(n log n)**
   Avoid random access – use pointer-based divide and merge.

3. **Smallest/Largest K Elements**
   Sort and slice needed portion efficiently.

4. **Merge K Sorted Arrays/Lists**
   Core technique: repeatedly merging sorted sequences.

5. **Find Maximum Distance Between Elements**
   Leverage sorted properties to minimize comparisons.

6. **Find the Median in Two Sorted Arrays**
   Use merge logic for accurate selection in log scale.

---

## 📌 Summary

| Feature            | Merge Sort              |
| ------------------ | ----------------------- |
| Time Complexity    | O(n log n) in all cases |
| Space Complexity   | O(n)                    |
| Stability          | ✅ Stable                |
| In-Place           | ❌ Not in-place          |
| Recursion          | ✅ Uses recursion        |
| Divide-and-Conquer | ✅ Yes                   |

---

## ✅ When to Use Merge Sort?

* Need stable sorting
* Sorting **linked lists**
* Working with **large datasets** (external storage)
* Need guaranteed performance regardless of input

---

## 🔗 Reference Implementation (Java)

```java
public class MergeSort {
    public static void mergeSort(int[] arr, int s, int e) {
        if (e - s <= 1) return;
        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid, e);
        merge(arr, s, mid, e);
    }

    private static void merge(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];
        int i = s, j = mid, k = 0;

        while (i < mid && j < e) {
            mix[k++] = (arr[i] < arr[j]) ? arr[i++] : arr[j++];
        }
        while (i < mid) mix[k++] = arr[i++];
        while (j < e) mix[k++] = arr[j++];

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
```



