
# 🔁 Bubble Sort / Sinking Sort / Exchange Sort Explained

Bubble Sort is one of the simplest sorting algorithms. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

### 💡 How it works (in simple terms):

- Imagine bubbles rising in water.
- The largest bubble rises to the top in each pass.
- Similarly, the largest number is "bubbled" to the end of the array in each round.
- After every pass, the largest remaining unsorted element settles at its correct position.

### 📦 Properties

- **Time Complexity**:
  - Best Case (already sorted): O(n)
  - Worst/Average Case: O(n²)
- **Space Complexity**: O(1)
- **Stable**: Yes (does not change the relative order of equal elements)
- **In-place**: Yes
- **Adaptive**: Yes, with optimization
### Initial Array
`[64, 25, 12, 22, 11]`

### Pass 1
Comparing elements up to index 4 (unsorted portion)

- Compare `arr[0] = 64` and `arr[1] = 25` → Swap → `[25, 64, 12, 22, 11]`
- Compare `arr[1] = 64` and `arr[2] = 12` → Swap → `[25, 12, 64, 22, 11]`
- Compare `arr[2] = 64` and `arr[3] = 22` → Swap → `[25, 12, 22, 64, 11]`
- Compare `arr[3] = 64` and `arr[4] = 11` → Swap → `[25, 12, 22, 11, 64]`

### Pass 2
Comparing elements up to index 3 (unsorted portion)

- Compare `arr[0] = 25` and `arr[1] = 12` → Swap → `[12, 25, 22, 11, 64]`
- Compare `arr[1] = 25` and `arr[2] = 22` → Swap → `[12, 22, 25, 11, 64]`
- Compare `arr[2] = 25` and `arr[3] = 11` → Swap → `[12, 22, 11, 25, 64]`

### Pass 3
Comparing elements up to index 2 (unsorted portion)

- Compare `arr[0] = 12` and `arr[1] = 22` → No Swap → `[12, 22, 11, 25, 64]`
- Compare `arr[1] = 22` and `arr[2] = 11` → Swap → `[12, 11, 22, 25, 64]`

### Pass 4
Comparing elements up to index 1 (unsorted portion)

- Compare `arr[0] = 12` and `arr[1] = 11` → Swap → `[11, 12, 22, 25, 64]`

### Final Sorted Array
`[11, 12, 22, 25, 64]`

### 🧠 Bubble Sort vs Other Sorting Algorithms

| Feature                | Bubble Sort      | Selection Sort   | Insertion Sort   |
|------------------------|------------------|------------------|------------------|
| Time Complexity (Best) | O(n)             | O(n²)            | O(n)             |
| Time Complexity (Worst)| O(n²)            | O(n²)            | O(n²)            |
| Space Complexity       | O(1)             | O(1)             | O(1)             |
| Stable?                | Yes              | No               | Yes              |
| Adaptive?              | Yes (with check) | No               | Yes              |
| Method                 | Swapping         | Selection        | Insertion        |
