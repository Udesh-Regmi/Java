

## 🔍 Terms and Explanations (With Examples)

---

### ✅ **1. Compile-Time vs Run-Time**

**Your statement:**

> `// Left part happens at compile time || Right part happens at run time (also called Dynamic memory allocation)`

### 💡 Explanation:

* **Left Part (Compile-Time)**:

  ```java
  int[] numbers;
  ```

    * This is a **declaration**.
    * At **compile time**, the compiler understands you're declaring a reference variable named `numbers` that will point to an array of integers.
    * This variable lives in the **stack memory** and currently points to `null`.

* **Right Part (Run-Time)**:

  ```java
  numbers = new int[5];
  ```

    * This is **initialization** using the `new` keyword.
    * Happens **at runtime**.
    * Allocates a **new array object in the heap memory** of size 5, default-initialized to 0.
    * The reference variable `numbers` now points to this array in heap memory.

---

### ✅ **2. Stack and Heap Memory**

**Your statement:**

> `int[] numbers;` → Stack
> `new int[5];` → Heap

### 💡 Explanation:

* **Stack Memory**:

    * Stores **method calls** and **reference variables**.
    * Fast and automatically managed.
    * Example:

      ```java
      int[] arr; // 'arr' is a reference stored in stack
      ```

* **Heap Memory**:

    * Stores **objects**, including arrays.
    * Managed by the **Garbage Collector** in Java.
    * Example:

      ```java
      arr = new int[5]; // array object resides in heap
      ```

### 🧠 Visualization:

```
Stack                  Heap
-------                -------------
numbers ────────────▶ [10, 20, 30, 40, 50]
```

---

### ✅ **3. Dynamic Memory Allocation**

**Your statement:**

> `new int[5];` is dynamic memory allocation.

### 💡 Explanation:

* **Dynamic** means the memory is allocated **during runtime**, not compile-time.
* Java doesn’t allow the array size to be determined dynamically like in C with malloc, but memory is **still dynamically allocated** when `new` is used.

#### 🧪 Example:

```java
int size = 5;
int[] dynamicArray = new int[size]; // allocated at runtime
```

---

### ✅ **4. Zero-Indexed**

> **"Arrays in Java are zero-indexed."**

### 💡 Explanation:

* The first element of any array is at index **0**.
* So, for a 5-element array, valid indices are `0` to `4`.

#### 🧪 Example:

```java
int[] nums = {5, 10, 15};
System.out.println(nums[0]); // Output: 5
```

---

### ✅ **5. Fixed Size**

> **"Once created, their size is fixed."**

### 💡 Explanation:

* You **cannot resize** a native Java array after creation.
* If you want resizable behavior, use `ArrayList` instead.

#### 🧪 Example:

```java
int[] arr = new int[3];
// arr[3] = 10; // Error: ArrayIndexOutOfBoundsException
```

---

### ✅ **6. ArrayIndexOutOfBoundsException**

> **"Accessing an invalid index will throw this."**

### 💡 Explanation:

* Java **checks bounds** at runtime.
* This makes Java safer than C, where out-of-bounds access leads to undefined behavior.

#### 🧪 Example:

```java
int[] arr = new int[2];
System.out.println(arr[5]); // Runtime Error: ArrayIndexOutOfBoundsException
```

---

### ✅ **7. Non-continuous Memory (Java vs C/C++)**

**Your statement:**

> **In Java, array memory may not be continuous unlike C/C++.**

### 💡 Explanation:

* In **C/C++**, arrays are allocated in a **contiguous block** of memory.
* In **Java**, arrays are **objects** on the heap. The **JVM may or may not** allocate them contiguously.
* However, Java guarantees **logical continuity** — the index order is always consistent.
* JVM implementation may move objects during **Garbage Collection**, so physical layout is abstracted.

#### ✅ Correct Example for Java:

```java
int[] arr = new int[]{1, 2, 3, 4}; // logically continuous, but physically? JVM-dependent.
```

#### ❌ In C:

```c
int arr[4] = {1, 2, 3, 4}; // physically continuous in memory.
```

---

## 🧠 Recap Table

| Concept                    | Area    | Happens At | Memory Used | Safe? | Resizable? |
| -------------------------- | ------- | ---------- | ----------- | ----- | ---------- |
| `int[] numbers;`           | Declare | Compile    | Stack       | Yes   | ❌          |
| `new int[5];`              | Init    | Runtime    | Heap        | Yes   | ❌          |
| Java array index `0`-based | Access  | Runtime    | Stack+Heap  | Yes   | ❌          |
| Array bounds checked       | Access  | Runtime    | Stack+Heap  | Yes ✅ | ❌          |
| C-style contiguous memory  | C/C++   | Runtime    | Heap        | No ❌  | N/A        |

