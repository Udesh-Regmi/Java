
# 🌳 Tree Traversals: BFT vs DFT in Binary Trees

Understanding how to traverse a tree is fundamental in computer science. Two core strategies exist:

- **BFT (Breadth-First Traversal)** — also called Level Order Traversal  
- **DFT (Depth-First Traversal)** — includes Preorder, Inorder, Postorder

This document breaks down both concepts, illustrates when to use them, and includes code and visuals.

---

## 🧭 What is Tree Traversal?

Tree traversal means **visiting every node in a tree** exactly once in a structured order to perform some operation (e.g., print, search, transform).

Unlike linear structures, trees have branching — so multiple traversal orders are possible.

---

## 🔷 Breadth-First Traversal (BFT)

### 📌 Definition:
Visit all nodes **level by level**, starting from the root, then moving down to children of each level.

Also known as: **Level Order Traversal**

### 📊 Strategy:
Use a **Queue** to store nodes at each level.

### ✅ Use Cases:
- Print tree level by level
- Shortest path from root (if uniform weight)
- Serialization for storage/networking
- Hierarchical systems (e.g., org charts)

### 🧠 Traversal Order:

For this tree:
```

```
    1
   / \
  2   3
 / \   \
4   5   6
```

```

🔁 BFT Output:
```

1 2 3 4 5 6

````

### 🧪 Java Code:
```java
void levelOrder(Node root) {
    if (root == null) return;

    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
        Node current = queue.poll();
        System.out.print(current.value + " ");

        if (current.left != null) queue.offer(current.left);
        if (current.right != null) queue.offer(current.right);
    }
}
````

---

## 🔷 Depth-First Traversal (DFT)

### 📌 Definition:

Explore one branch (depth) **fully before backtracking**.

DFT includes:

* **Preorder (Root → Left → Right)**
* **Inorder (Left → Root → Right)**
* **Postorder (Left → Right → Root)**

### ✅ Use Cases:

| Traversal | Purpose                       |
| --------- | ----------------------------- |
| Preorder  | Copying tree, prefix notation |
| Inorder   | Sorted output in BST          |
| Postorder | Deletion, postfix notation    |

### 🧠 Traversal Orders:

Given this tree:

```
        1
       / \
      2   3
     / \
    4   5
```

| Traversal | Output    |
| --------- | --------- |
| Preorder  | 1 2 4 5 3 |
| Inorder   | 4 2 5 1 3 |
| Postorder | 4 5 2 3 1 |

---

## 🧪 DFT Java Code Samples

### 🔹 Preorder:

```java
void preorder(Node node) {
    if (node == null) return;
    System.out.print(node.value + " ");
    preorder(node.left);
    preorder(node.right);
}
```

### 🔹 Inorder:

```java
void inorder(Node node) {
    if (node == null) return;
    inorder(node.left);
    System.out.print(node.value + " ");
    inorder(node.right);
}
```

### 🔹 Postorder:

```java
void postorder(Node node) {
    if (node == null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.value + " ");
}
```

---

## ⚖️ BFT vs DFT: Comparison Table

| Feature              | BFT (Level Order)      | DFT (Pre/In/Post)        |
| -------------------- | ---------------------- | ------------------------ |
| **Strategy**         | Visit by levels        | Visit by depth           |
| **Data Structure**   | Queue                  | Stack / Recursion        |
| **Shortest path?**   | Yes (unweighted trees) | No                       |
| **Memory usage**     | Higher on wide trees   | Higher on deep trees     |
| **Use Case**         | Level views, hierarchy | Tree cloning, expression |
| **Time Complexity**  | O(n)                   | O(n)                     |
| **Space Complexity** | O(n)                   | O(h) (height of tree)    |

---

## 🧮 When to Use What?

| Goal                               | Use This Traversal |
| ---------------------------------- | ------------------ |
| Printing levels                    | BFT (Level Order)  |
| Sorted values (BST only)           | Inorder            |
| Memory-safe deletion               | Postorder          |
| Building tree from prefix sequence | Preorder           |
| Checking completeness              | BFT                |

---
