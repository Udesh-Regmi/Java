# 🔍Index
* 📚 An introduction to binary trees
* 🧠 How to think about solving tree-related problems
* 📉 How the call stack behaves
* 🔍 Detailed explanation of the code
* 🔁 Traversal techniques (and what this implementation uses)
* ✅ Output format and usage
* 📌 Real-world applications

---

# 🌳 Binary Tree Implementation in Java

This project presents a **Binary Tree** implementation in Java that allows interactive user input for dynamic construction, and visually displays the tree in a clean, structured format using Unicode characters.

---

## 📖 What is a Binary Tree?

A **Binary Tree** is a hierarchical data structure in which each node has at most **two children**, referred to as the **left child** and the **right child**. It is one of the most fundamental data structures in computer science.

---

## 🧠 How to Approach Binary Tree Problems

When dealing with Binary Trees:

1. **Start small**: Understand what each node should contain (usually a value and references to left and right children).
2. **Think recursively**: Tree traversal and insertion often lend themselves to recursive approaches.
3. **Understand base and recursive cases**: Every recursive function must have a clear stopping condition.
4. **Use the call stack**: Binary trees work naturally with recursion due to the way the **call stack** stores function frames.
5. **Visualize the tree**: Sketch the structure or simulate the calls to understand how the tree evolves.

---

## 📦 Features

- 📥 Dynamic tree population using console input
- 📤 Pretty-printed sideways visual tree
- 💡 Recursive structure for both input and output
- 🧱 Foundation for tree traversals and search algorithms

---

## 🧬 Code Structure Explained

### 🔹 Class: `BinaryTree`

This is the main class containing:

- `Node` inner class to represent tree nodes
- `root` field as the entry point of the tree
- `populate()` method to build the tree recursively
- `display()` method to pretty-print the tree

---

### 🔹 Class: `Node`

```java
private static class Node {
    Node left;
    Node right;
    int value;
    public Node(int value) {
        this.value = value;
    }
}
````

Each node contains:

* An `int` value
* A left child reference
* A right child reference

---

### 🔹 Method: `populate(Scanner scanner)`

```java
public void populate(Scanner scanner) {
    System.out.println("Enter the root node");
    int value = scanner.nextInt();
    root = new Node(value);
    populate(scanner, root);
}
```

Starts populating the tree by:

* Asking the user for the root node value
* Recursively asking whether to insert left/right nodes for each node

---

### 🔹 Recursive Helper: `populate(Scanner scanner, Node node)`

```java
public void populate(Scanner scanner, Node node) {
    // Ask for left
    // If yes, read value and recurse
    // Ask for right
    // If yes, read value and recurse
}
```

* Uses **depth-first recursive input**.
* Call stack handles each node until its children are fully populated.
* After each recursive call returns, it moves to the next sibling node.

---

## 🔁 Tree Traversal in This Code

> **This implementation builds the tree in Pre-Order (NLR)** because:

* It visits the **current node first**
* Then recursively builds the **left subtree**
* Then the **right subtree**

---

## 🧠 How the Call Stack Works Here

For each recursive call to `populate()`:

* The current function call waits in the stack until the left subtree is fully constructed.
* Then it moves to the right subtree.
* After both left and right recursive calls are complete, the current function frame is popped from the stack.

This is the typical nature of **recursive tree construction** and **depth-first traversal**.

---

## 🎨 Visual Tree Output (`display()` method)

The tree is printed sideways using `└──`, `┌──`, and `│` to represent branches.

### Example Output:

For a tree:

```
        10
       /  \
      5   20
         /  \
        15  30
```

Console Output:

```
│       ┌── 30
│   ┌── 20
│   │   └── 15
└── 10
    └── 5
```

---

### 🔹 Pretty Display Logic

```java
private void printTree(Node node, String prefix, boolean isTail) {
    if (node == null) return;

    printTree(node.right, prefix + (isTail ? "│   " : "    "), false);
    System.out.println(prefix + (isTail ? "└── " : "┌── ") + node.value);
    printTree(node.left, prefix + (isTail ? "    " : "│   "), true);
}
```

---

## 🧪 Sample Usage

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();
    }
}
```

---

## 🌍 Real-World Applications of Binary Trees

| Application            | Use Case Example                     |
| ---------------------- | ------------------------------------ |
| **File Systems**       | Directory trees                      |
| **Expression Parsing** | Binary expression trees              |
| **Databases**          | Binary Search Trees (e.g., B+ Trees) |
| **Compiler Design**    | Syntax trees                         |
| **Networking**         | Routing trees                        |
| **Gaming/AI**          | Decision Trees, Min-Max Trees        |

---


