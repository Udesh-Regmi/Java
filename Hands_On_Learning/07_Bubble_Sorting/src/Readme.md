
# 🔁 Bubble Sort Algorithm

Bubble Sort is one of the simplest sorting algorithms that works by repeatedly swapping the adjacent elements if they are in the wrong order. It's also known as **Sinking Sort** or **Exchange Sort**.

---

## 📌 How It Works (In Simple Terms)

- Go through the list from start to end.
- Compare each pair of adjacent items.
- Swap them if they are in the wrong order.
- After each full pass, the largest element "bubbles up" to its correct position.
- Repeat this until no swaps are needed.

---

## ✅ Key Features

| Feature                  | Value            |
|--------------------------|------------------|
| Best Time Complexity     | O(n)             |
| Average Time Complexity  | O(n²)            |
| Worst Time Complexity    | O(n²)            |
| Space Complexity         | O(1)             |
| Stable Sort              | Yes              |
| Adaptive                 | Yes (with flag)  |
| In-Place Sort            | Yes              |

---

## 🧪 Example (With Steps)

Let's sort the array: `[64, 25, 12, 22, 11]`

### Initial Array:
`[64, 25, 12, 22, 11]`

### Pass 1:
- Compare 64 and 25 → Swap → `[25, 64, 12, 22, 11]`
- Compare 64 and 12 → Swap → `[25, 12, 64, 22, 11]`
- Compare 64 and 22 → Swap → `[25, 12, 22, 64, 11]`
- Compare 64 and 11 → Swap → `[25, 12, 22, 11, 64]`

### Pass 2:
- Compare 25 and 12 → Swap → `[12, 25, 22, 11, 64]`
- Compare 25 and 22 → Swap → `[12, 22, 25, 11, 64]`
- Compare 25 and 11 → Swap → `[12, 22, 11, 25, 64]`

### Pass 3:
- Compare 12 and 22 → No Swap
- Compare 22 and 11 → Swap → `[12, 11, 22, 25, 64]`

### Pass 4:
- Compare 12 and 11 → Swap → `[11, 12, 22, 25, 64]`

### Sorted Array:
`[11, 12, 22, 25, 64]`

---

## 🧠 When To Use Bubble Sort

- When simplicity is more important than efficiency
- For small datasets or teaching purposes
- When the list is *almost sorted* (best-case performance is O(n))

---

## 🚫 When NOT To Use It

- Large datasets
- Performance-critical systems

---

## 💻 Java Code

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted Array:   " + Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        boolean swapped;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }
}
```

---

## 🔚 Summary

Bubble Sort is great for learning and understanding sorting fundamentals, but it is not suitable for large or performance-sensitive applications. Consider using more efficient algorithms like Merge Sort, Quick Sort, or Tim Sort for production.
