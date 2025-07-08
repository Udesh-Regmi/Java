

# 📌 **What is a Linked List?**

A **Linked List** is a **linear data structure** in which elements (called **nodes**) are **not stored in contiguous memory locations**. Instead, each node holds:

1. **Data**
2. A **reference (or pointer)** to the next node in the sequence.

Unlike arrays, linked lists don’t require pre-allocating a fixed size, making them ideal for dynamic memory usage.

---

## 🌟 **Key Features of Linked List**

| Feature                          | Description                                               |
| -------------------------------- | --------------------------------------------------------- |
| ✅ Dynamic Size                   | Memory is allocated at runtime. Easily grows and shrinks. |
| ✅ Efficient Insertions/Deletions | No shifting of elements (unlike arrays).                  |
| ❌ No Random Access               | Accessing an element requires traversal from head.        |
| ✅ Uses Pointers                  | Nodes are connected via references (pointers).            |
| ✅ Memory Friendly                | Can be implemented even when memory is fragmented.        |

---

## 🧠 **Why Use Linked List Instead of Array?**

| Feature       | Array           | Linked List              |
| ------------- | --------------- | ------------------------ |
| Size          | Fixed           | Dynamic                  |
| Memory usage  | May waste space | Allocates as needed      |
| Insert/Delete | Costly (O(n))   | Efficient (O(1) at head) |
| Access        | Fast (O(1))     | Slow (O(n))              |

---

## 🚀 **Applications of Linked Lists**

| Domain                   | Use Case                                          |
| ------------------------ | ------------------------------------------------- |
| 🔁 OS Scheduling         | Task queues and round-robin algorithms.           |
| 🧾 Memory Management     | Dynamic memory allocation (malloc/free).          |
| 🔄 Undo/Redo Systems     | Using doubly linked lists for reversible actions. |
| 🌐 Web Browsers          | Back/forward navigation using doubly linked list. |
| 📦 Queues/Stacks         | Efficiently implemented using linked lists.       |
| 🧮 Polynomial Arithmetic | Representing and manipulating polynomials.        |

---

## 🧱 **Types of Linked Lists**

| Type                     | Description                                                                                        | Illustration              |
| ------------------------ | -------------------------------------------------------------------------------------------------- | ------------------------- |
| **Singly Linked List**   | Each node has one pointer to the next node. Traversal is only forward.                             | `A → B → C → null`        |
| **Doubly Linked List**   | Each node has two pointers: one to the next and one to the previous node. Bidirectional traversal. | `null ← A ⇄ B ⇄ C → null` |
| **Circular Linked List** | Last node points back to the head, forming a loop. Can be singly or doubly.                        | `A → B → C → A (loop)`    |

---

## 📖 **Definition of Singly Linked List**

A **Singly Linked List** is a type of linked list where **each node points only to its immediate next node**, and the last node points to `null`.

### Structure:

```text
[Data | Next] → [Data | Next] → [Data | null]
```

* The list begins with a reference to the **head node**.
* Every node contains:

  * A **value (data)**.
  * A **next pointer** that links to the next node.
* **Traversal is only in one direction** – from head to tail.

### Example:

```text
Head → 10 → 20 → 30 → null
```

---

## ✅ Advantages of Singly Linked List

* Simple and easy to implement.
* Uses less memory than doubly linked list.
* Efficient insertions and deletions at the beginning.

---

## ❌ Disadvantages

* Cannot traverse backward.
* Deleting the last node requires traversal from the head.
* Searching is O(n) — linear time.

---



# 📚 Singly Linked List in Java Code Sample Example.


---

## 🚀 Features

✅ Insert at head  
✅ Insert at tail  
✅ Insert at any index  
✅ Delete from head  
✅ Delete from tail  
✅ Delete at any index  
✅ Find node by value  
✅ Get node by index  
✅ Display entire list  

---

## 📂 File Structure

```bash
Singly_Linked_List/
├── LinkedList.java   # Core logic
└── Main.java         # Example usage
````

---

## 📌 Class Overview

### `LinkedList`

Handles all operations on the list. Maintains:

* `head` → First node
* `tail` → Last node
* `SIZE` → Count of nodes

### `Node` (Private Inner Class)

Each node contains:

* `int value` → Stored data
* `Node next` → Pointer to next node

---

## ✨ Sample Usage (Main.java)

```java
public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertFirst(20);
        ll.insertFirst(30);
        ll.insertFirst(50);
        ll.insertFirst(0);
        ll.insertFirst(70);

        ll.display();                // 70 -> 0 -> 50 -> 30 -> 20 -> END
        ll.deleteFirst();           // removes 70
        ll.find(1);                 // searches for value 1 (not found)
        ll.display();               // 0 -> 50 -> 30 -> 20 -> END

        ll.insertLast(111);
        ll.insertLast(2323);
        ll.insert(1, 4);            // insert 1 at index 4
        ll.deleteLast();           // removes 2323
        ll.delete(2);              // removes element at index 2
        ll.display();              // Final state of list
    }
}
```

---

## 🔧 Methods Explained

| Method                       | Description                         |
| ---------------------------- | ----------------------------------- |
| `insertFirst(int val)`       | Adds node at the beginning.         |
| `insertLast(int val)`        | Adds node at the end.               |
| `insert(int val, int index)` | Inserts node at a specific index.   |
| `deleteFirst()`              | Removes the head node.              |
| `deleteLast()`               | Removes the last node.              |
| `delete(int index)`          | Deletes a node from a given index.  |
| `get(int index)`             | Returns node at index (0-based).    |
| `find(int val)`              | Searches for a node by value.       |
| `display()`                  | Prints the list in readable format. |

---

## 🧠 Time Complexity

| Operation       | Time |
| --------------- | ---- |
| Insert First    | O(1) |
| Insert Last     | O(1) |
| Insert at Index | O(n) |
| Delete First    | O(1) |
| Delete Last     | O(n) |
| Delete at Index | O(n) |
| Search (find)   | O(n) |
| Get by Index    | O(n) |

---

## 📈 Enhancements Ideas

* Add support for circular linked list
* Implement a doubly linked list version
* Add unit tests using JUnit
* Build a GUI or visualizer
* Add iterator for enhanced for-loop support

---
