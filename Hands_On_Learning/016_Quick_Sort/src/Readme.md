


# Quick Sort Algorithm

## 🔍 What is Quick Sort?

Quick Sort is a **divide-and-conquer** sorting algorithm. It works by selecting a **pivot** element and partitioning the array such that elements less than the pivot come before it, and elements greater come after. This process is recursively applied to sub-arrays, eventually sorting the entire array.

> Quick Sort is one of the most efficient sorting algorithms in practice and is widely used in system libraries and production-level applications.

---

## 🧠 Why Use Quick Sort?

- **Performance**: Faster than other comparison-based algorithms like Bubble, Insertion, and Selection Sort in average scenarios.
- **In-place Sorting**: Doesn’t require extra space like Merge Sort.
- **Tail Recursion**: Can be optimized to avoid stack overflow.
- **Industry Standard**: Used in Java’s `Arrays.sort()` for primitives, Python's `sort()` (under the hood via Timsort, a hybrid with quicksort), and C/C++ STL `qsort()`.

---

## ⚙️ How Quick Sort Works (Approach)

### Step-by-Step Breakdown:

1. **Choose a Pivot**: Pick any element (commonly the first, last, or middle).
2. **Partition**:
    - Rearrange the array so that:
        - All elements smaller than the pivot go to the left.
        - All elements greater than the pivot go to the right.
3. **Recursive Sort**:
    - Recursively apply the above steps to the sub-arrays (left and right of the pivot).

> Recursive base case is when the array has 0 or 1 element.

---

## 🧮 Time & Space Complexity

| Case       | Time Complexity | Explanation                                  |
|------------|------------------|----------------------------------------------|
| Best Case  | O(n log n)       | Balanced partition, pivot divides evenly     |
| Average    | O(n log n)       | Typical case with random pivot               |
| Worst Case | O(n²)            | Pivot always picks worst (e.g. smallest/largest) element |
| Space      | O(log n)         | Due to recursion stack (not counting input)  |

> Worst case can be improved using **randomized pivot selection** or **median-of-three** method.

---

## 🧑‍💻 Java Implementation (Lomuto Partition Scheme)

```java
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9, 3, 7, 1, 6, 8, 2, 4};
        quickSort(arr, 0, arr.length - 1);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Lomuto Partition
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
````

---

## 🧩 Types of Problems Solved Using Quick Sort

| Problem Type         | Example Use Case                                 |
| -------------------- | ------------------------------------------------ |
| Sorting              | Large datasets where memory is a concern         |
| Kth smallest/largest | Used in **QuickSelect**, a variant of quick sort |
| Order statistics     | Efficiently find elements by rank                |
| Data deduplication   | Sorted arrays simplify duplicate removal         |
| In-place sorting     | Embedded or memory-constrained systems           |

---

## 📝 Best Practices

* Use **random pivot** or **median-of-three** strategy for better performance.
* Always test on edge cases: sorted input, all same elements, very large arrays.
* If recursion stack becomes deep, switch to **iterative quick sort** or **hybrid** with insertion sort for small sub-arrays.
* Avoid using quick sort on **linked lists** (use merge sort instead).

---

## 📌 Summary

* ✅ Quick Sort is fast, efficient, and widely used.
* ⚠️ Can degrade to O(n²) without proper pivot strategy.
* 📦 Works best on arrays, especially large datasets with low memory overhead.
* 🧠 Knowing Quick Sort helps understand core computer science concepts like recursion, partitioning, and in-place algorithms.




