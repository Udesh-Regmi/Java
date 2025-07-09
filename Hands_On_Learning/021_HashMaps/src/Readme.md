
---


# 🧠 HashMap & Hash Table - Complete Guide

---

## 📚 Introduction to Hashing

Hashing is a technique used to **uniquely identify** a specific object from a group of similar objects. In data structures, it allows **efficient data retrieval** by using a **hash function** to convert keys into array indices.

---

## 🗂️ What is a Hash Table?

A **Hash Table** is a data structure that stores data in an **array format**, where each data value has a unique key associated with it generated through a **hash function**.

- Offers **O(1)** average time complexity for insertion, deletion, and search.
- Uses **key-value** pairs.
- May involve **collision handling** via chaining or open addressing.

---

## 🧰 What is a HashMap?

- `HashMap` is an implementation of the **Map interface** in Java.
- Stores key-value pairs.
- **No order is guaranteed**.
- Allows **null** keys and multiple null values.
- **Not thread-safe**.

> HashMap is backed by a **Hash Table** internally.

---

## 🧮 Hash Function

A **hash function** is a mathematical function that maps input data (keys) to an integer (hash code or index).

### Custom Hash Function (Simple)

```java
index = key % table_size;
````

* For example, if table size is `10`, then inserting key `29`:

    * `index = 29 % 10 = 9`

This is simple but effective for learning and demo.

> A good hash function distributes data **uniformly** and avoids **clustering**.

---

## 💥 Collisions

A **collision** happens when two keys produce the **same index**.

### Ways to Handle:

* **Chaining:** Use a linked list (or ArrayList) at each index.
* **Open Addressing:** Search for the next available slot (linear probing, quadratic probing, etc.).

---

## 🔢 Example - Adding Elements to a Hash Table

We are given numbers:
**`10, 8, 47, 29, 9, 93, 00, 34, 56`**

Assume:

* Table size = `10`
* Hash Function = `key % 10`

### Hash Table Construction

| Key | Hash      | Index | Collision | Notes                          |
| --- | --------- | ----- | --------- | ------------------------------ |
| 10  | 10%10 = 0 | 0     | No        | Inserted at index 0            |
| 8   | 8%10 = 8  | 8     | No        | Inserted at index 8            |
| 47  | 47%10 = 7 | 7     | No        | Inserted at index 7            |
| 29  | 29%10 = 9 | 9     | No        | Inserted at index 9            |
| 9   | 9%10 = 9  | 9     | **Yes**   | Collision at 9 - Chain with 29 |
| 93  | 93%10 = 3 | 3     | No        | Inserted at index 3            |
| 00  | 0%10 = 0  | 0     | **Yes**   | Collision at 0 - Chain with 10 |
| 34  | 34%10 = 4 | 4     | No        | Inserted at index 4            |
| 56  | 56%10 = 6 | 6     | No        | Inserted at index 6            |

### Hash Table after insertion (with chaining):

```text
Index   | Elements
--------|--------------------
0       | 10 → 0
1       | 
2       | 
3       | 93
4       | 34
5       | 
6       | 56
7       | 47
8       | 8
9       | 29 → 9
```

---

## 🛠️ Java Implementation of Custom Hash Table with Chaining

```java
import java.util.LinkedList;

public class CustomHashTable {
    private final int SIZE = 10;
    private LinkedList<Integer>[] table;

    public CustomHashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashFunction(int key) {
        return key % SIZE;
    }

    public void insert(int key) {
        int index = hashFunction(key);
        table[index].add(key);
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Index " + i + ": ");
            for (int val : table[i]) {
                System.out.print(val + " -> ");
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        CustomHashTable ht = new CustomHashTable();
        int[] data = {10, 8, 47, 29, 9, 93, 0, 34, 56};
        for (int num : data) {
            ht.insert(num);
        }
        ht.display();
    }
}
```

---

## 🧠 Key Takeaways

* **Hashing** is a technique for fast data access using a calculated index.
* A **Hash Table** uses a hash function to map keys to indices.
* **Collisions** are inevitable; handle them with chaining or probing.
* **HashMap** is a high-level Java implementation built on Hash Tables.
* Design a **good hash function** to distribute keys evenly.

---

