

# 🔁 Circular Linked List in Java

This repository contains a **production-grade implementation of a Circular Linked List** in Java. It supports efficient insertion, deletion, and traversal — all while maintaining a circular structure where the last node links back to the first node.

---

## 🌀 What is a Circular Linked List?

A **Circular Linked List (CLL)** is a variant of a singly linked list where the **last node does not point to `null`, but instead to the head node**, forming a closed loop.

### 🔄 Visual Representation:


```
    ┌────────────┐
    ↓            │
 [10] → [20] → [30]
    ↑            ↓
    └────── ← ───┘
```


> In a Circular Linked List, we can loop through the list starting from any node and eventually return to that node.

---

## 📦 Features

✅ Insert at head  
✅ Insert at tail  
✅ Insert at specific index  
✅ Delete from head  
✅ Delete from tail  
✅ Delete at specific index  
✅ Get node by index  
✅ Search by value  
✅ Traverse and display circular list  

---

## 📂 Folder Structure

```bash
CircularLinkedList/
├── LinkedList.java    # Core implementation
└── Main.java          # Demonstration and testing
````

---

## 🚀 Getting Started

### 🔧 Compile and Run

```bash
javac CircularLinkedList/*.java
java CircularLinkedList.Main
```

---

## ✍️ Sample Output

```
10 -> 20 -> 25 -> 30 -> 40 -> (back to head)
Deleted First: 10
Deleted Last: 40
Deleted at index 1: 25
20 -> 30 -> (back to head)
Found: 30
```

---

## 🧠 Core Methods

| Method                       | Description                        |
| ---------------------------- | ---------------------------------- |
| `insertFirst(int val)`       | Add node at the beginning.         |
| `insertLast(int val)`        | Add node at the end.               |
| `insert(int val, int index)` | Insert node at specific position.  |
| `deleteFirst()`              | Remove the first node.             |
| `deleteLast()`               | Remove the last node.              |
| `delete(int index)`          | Delete node at index.              |
| `get(int index)`             | Get the node at a position.        |
| `find(int val)`              | Search node by value.              |
| `display()`                  | Print the list in circular format. |

---

## ⚙️ Time & Space Complexity

| Operation        | Time Complexity |
| ---------------- | --------------- |
| Insert Head/Tail | O(1)            |
| Insert at Index  | O(n)            |
| Delete Head/Tail | O(1) / O(n)     |
| Delete at Index  | O(n)            |
| Traverse/Display | O(n)            |
| Find/Search      | O(n)            |

---

## 💼 Use Cases

* Multiplayer turn-based games (e.g., card rotation)
* Round-robin CPU scheduling
* Circular buffers in audio/video streaming
* Token-passing in networks

---

## ⚠️ Edge Case Handling

* Handles empty list insert/delete
* Handles single-node circularity correctly
* Ensures `tail.next` always points to `head`

---

## 🧪 Example Usage in `Main.java`

```java
LinkedList cll = new LinkedList();

cll.insertFirst(20);
cll.insertFirst(10);
cll.insertLast(30);
cll.insert(25, 2);  // Insert at index 2

cll.display();      // 10 -> 20 -> 25 -> 30 -> (back to head)

cll.deleteFirst();
cll.deleteLast();
cll.delete(1);      // Deletes 25

cll.display();      // 20 -> 30 -> (back to head)
System.out.println("Found: " + cll.find(30).value);
```

---

