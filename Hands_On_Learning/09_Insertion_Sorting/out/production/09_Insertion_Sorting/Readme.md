# 🔂 Insertion Sort Algorithm

Insertion Sort is a simple, stable, comparison-based sorting algorithm that builds the final sorted array one item at a time. It's efficient for small data sets or lists that are already mostly sorted.

---

## 📌 How It Works (In Simple Terms)

- Imagine sorting playing cards in your hand.
- Start with the second element.
- Compare it with the element(s) before it.
- Shift larger elements one position to the right.
- Insert the current element into the correct position.
- Repeat for all elements in the array.

---

## ✅ Key Features

| Feature                  | Value            |
|--------------------------|------------------|
| Best Time Complexity     | O(n)             |
| Average Time Complexity  | O(n²)            |
| Worst Time Complexity    | O(n²)            |
| Space Complexity         | O(1)             |
| Stable Sort              | ✅ Yes           |
| Adaptive                 | ✅ Yes           |
| In-Place Sort            | ✅ Yes           |

---

## 🧪 Example (With Steps)

Let’s sort this array:  
`[8, 5, 3, 1]`

### Initial Array:
`[8, 5, 3, 1]`

### Pass 1 (i = 1):
- Compare 5 with 8 → 5 < 8 → Shift 8 right
- Insert 5 at index 0  
  Result: `[5, 8, 3, 1]`

### Pass 2 (i = 2):
- Compare 3 with 8 → Shift 8
- Compare 3 with 5 → Shift 5
- Insert 3 at index 0  
  Result: `[3, 5, 8, 1]`

### Pass 3 (i = 3):
- Compare 1 with 8 → Shift 8
- Compare 1 with 5 → Shift 5
- Compare 1 with 3 → Shift 3
- Insert 1 at index 0  
  Result: `[1, 3, 5, 8]`

### Sorted Array:
`[1, 3, 5, 8]`

---

## 🧠 When To Use Insertion Sort

- Small datasets
- Arrays that are **already nearly sorted**
- Situations where **stability** matters

---

## 🚫 When NOT To Use It

- Large datasets
- Performance-critical applications

---

## 💻 Java Code

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 5, 3, 1};
        System.out.println("Original Array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array:   " + Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // Shift larger elements to the right
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert current at the correct position
            arr[j + 1] = current;
        }
    }
}
