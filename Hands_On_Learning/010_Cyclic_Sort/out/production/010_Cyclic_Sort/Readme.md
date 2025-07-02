# 📘 Cyclic Sort Algorithm in Java

## 🧠 What is Cyclic Sort?

Cyclic Sort is an efficient **in-place sorting algorithm** specifically designed for **arrays containing elements from 1 to N (or 0 to N-1)**, with **no duplicates**. It rearranges the elements by placing them directly into their correct indices using swapping.

> ⚠️ Note: **Cyclic Sort only works** when the input array consists of distinct integers within a known range such as `1 to n` or `0 to n-1`.

---

## ✅ When to Use Cyclic Sort

- Array has consecutive values like `1 to n` or `0 to n-1`
- No duplicate or missing numbers
- You want an **O(n)** time complexity solution

---

## ⏱️ Time and Space Complexity

| Complexity Type | Value      |
|----------------|------------|
| Time           | O(n)       |
| Space          | O(1)       |
| In-Place       | Yes        |
| Stable         | No         |

---

## 📦 Sample Input and Output

**Input:**  
`int[] arr = {3, 5, 2, 1, 4};`

**Output:**  
`[1, 2, 3, 4, 5]`

---

## 🧮 Algorithm Explanation

The idea is to keep placing each element at its correct index (`element - 1` for 1-based arrays) until the whole array is sorted.

### 🔁 Process:

1. Start from index `i = 0`.
2. If the current element is not at its correct position, swap it with the element at its correct index.
3. Otherwise, move to the next index.

---

## 🧑‍💻 Java Implementation

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cyclic Sort:");
        int[] arr = {3, 5, 2, 1, 4};
        cyclicSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
