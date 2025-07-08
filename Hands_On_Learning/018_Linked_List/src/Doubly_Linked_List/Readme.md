


# 🔁 Doubly Linked List in Java

This repository contains a **production-ready implementation of a Doubly Linked List** in Java. It supports **bidirectional traversal**, dynamic memory management, and efficient node insertions/deletions.

---

## 📘 What is a Doubly Linked List?

A **Doubly Linked List** is a linear data structure where each node contains:
- `value`: The actual data
- `next`: Pointer to the next node
- `prev`: Pointer to the previous node

This allows **traversing in both directions**, unlike a singly linked list.

### 📊 Visual Structure:
```

null ← A ⇄ B ⇄ C ⇄ D → null

```

---

## 🌟 Features

✅ Insert at Head  
✅ Insert at Tail  
✅ Insert at Specific Index  
✅ Delete from Head  
✅ Delete from Tail  
✅ Delete from Specific Index  
✅ Traverse Forward  
✅ Traverse Backward  
✅ Find Node by Value  
✅ Get Node by Index  

---

## 📂 Folder Structure

```

Doubly\_Linked\_List/
├── LinkedList.java     # Core logic and data structure
└── Main.java           # Example runner with exercises

````

---

## 🚀 Getting Started

### 🔧 Run the Program
```bash
javac Doubly_Linked_List/*.java
java Doubly_Linked_List.Main
````

---

## ✍️ Sample Output

```
➡ Inserting at head:
30 <-> 20 <-> 10 <-> END
➡ Inserting at tail:
30 <-> 20 <-> 10 <-> 99 <-> 100 <-> END
➡ Inserting at position 2 (value: 55):
30 <-> 20 <-> 55 <-> 10 <-> 99 <-> 100 <-> END
➡ Deleting first element:
20 <-> 55 <-> 10 <-> 99 <-> 100 <-> END
➡ Deleting last element:
20 <-> 55 <-> 10 <-> 99 <-> END
➡ Deleting at position 2:
20 <-> 55 <-> 99 <-> END
➡ Display in reverse:
99 <-> 55 <-> 20 <-> START
✅ All operations executed.
```

---

## 🧠 Core Methods

| Method                       | Description                                  |
| ---------------------------- | -------------------------------------------- |
| `insertFirst(int val)`       | Insert a new node at the beginning.          |
| `insertLast(int val)`        | Insert a new node at the end.                |
| `insert(int val, int index)` | Insert at a specific index (0-based).        |
| `deleteFirst()`              | Remove and return the first node’s value.    |
| `deleteLast()`               | Remove and return the last node’s value.     |
| `delete(int index)`          | Delete node at specified index.              |
| `find(int val)`              | Find a node containing the given value.      |
| `get(int index)`             | Get node at a specific index.                |
| `display()`                  | Traverse and display list from head to tail. |
| `displayReverse()`           | Traverse and display list from tail to head. |

---

## 💡 Time Complexity

| Operation        | Time Complexity |
| ---------------- | --------------- |
| Insert Head/Tail | O(1)            |
| Insert at Index  | O(n)            |
| Delete Head/Tail | O(1)            |
| Delete at Index  | O(n)            |
| Traverse         | O(n)            |
| Search           | O(n)            |

---

## 💼 Use Cases

* Web browser history (back/forward navigation)
* Undo-redo functionality in editors
* MRU/LRU cache implementation
* Playlist navigation systems
* Doubly-linked queues and deques

---

## 📌 Enhancements You Can Add

* ✅ Convert into Circular Doubly Linked List
* ✅ Add sorting methods (merge sort, quick sort)
* ✅ Add iterator support for `for-each` loop
* ✅ Add unit testing with JUnit
* ✅ Export/serialize list to file or JSON

---


