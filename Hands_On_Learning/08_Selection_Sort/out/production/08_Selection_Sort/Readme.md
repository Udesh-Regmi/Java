# 🔽 Selection Sort Algorithm

Selection Sort is a simple comparison-based sorting algorithm. It divides the array into a sorted and unsorted region. It repeatedly selects the smallest (or largest) element from the unsorted region and moves it to the end of the sorted region.

---

## 📌 How It Works (In Simple Terms)

- Start from the first index.
- Search the entire unsorted portion to find the minimum element.
- Swap it with the first unsorted element.
- Move the boundary of the sorted region one element forward.
- Repeat until the array is sorted.

---

## ✅ Key Features

| Feature                  | Value            |
|--------------------------|------------------|
| Best Time Complexity     | O(n²)            |
| Average Time Complexity  | O(n²)            |
| Worst Time Complexity    | O(n²)            |
| Space Complexity         | O(1)             |
| Stable Sort              | ❌ (not stable)   |
| Adaptive                 | ❌               |
| In-Place Sort            | ✅               |

---

## 🧪 Example (With Steps)

Let’s sort this array in ascending order:  
`[29, 10, 14, 37, 13]`

### Initial Array:
`[29, 10, 14, 37, 13]`

### Pass 1:
- Minimum from index 0–4 → **10**
- Swap 29 ↔ 10  
  Result: `[10, 29, 14, 37, 13]`

### Pass 2:
- Minimum from index 1–4 → **13**
- Swap 29 ↔ 13  
  Result: `[10, 13, 14, 37, 29]`

### Pass 3:
- Minimum from index 2–4 → **14**
- No swap needed  
  Result: `[10, 13, 14, 37, 29]`

### Pass 4:
- Minimum from index 3–4 → **29**
- Swap 37 ↔ 29  
  Result: `[10, 13, 14, 29, 37]`

### Sorted Array:
`[10, 13, 14, 29, 37]`

---

## 🧠 When To Use Selection Sort

- Memory usage must be minimal (O(1) space)
- Dataset is small
- Simplicity and predictability are priorities

---

## 🚫 When NOT To Use It

- Large datasets
- When performance is critical
- When stable sorting is required

---

## 💻 Java Code

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        System.out.println("Original Array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted Array:   " + Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap if minIndex is not the current i
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
