
---

# 🌲 AVL Tree Implementation in Java

This repository provides a complete implementation of an **AVL Tree** — a self-balancing Binary Search Tree (BST). The AVL Tree maintains its balance by performing **rotations** during insertion, ensuring logarithmic height.

---


## 🌳 **1. Height of a Binary Tree**

### ✅ **Definition:**

The **height** of a tree (or a subtree rooted at any node) is the **maximum number of edges** from that node down to a leaf.

### 💡 For clarity:

* A **leaf node** has a height of `0`.
* An **empty tree** (i.e., `null` node) has a height of `-1`.

### 📌 **Recursive Formula:**

For any node `n`:

```java
height(n) = 1 + max(height(n.left), height(n.right))
```

### 🧠 **Example Tree:**

```
        10
       /  \
      5   20
         /
        15
```

* Height of node `15` = `0`
* Height of node `20` = `1`
* Height of root `10` = `1 + max(1, 0)` = `2`

---

## ⚖️ **2. Balance Factor**

### ✅ **Definition:**

The **balance factor** of a node is:

```
BalanceFactor = height(left subtree) - height(right subtree)
```

### 📌 **Permissible Values in AVL Tree:**

| Balance Factor | Meaning                      | Balanced? |
| -------------- | ---------------------------- | --------- |
| `-1`           | Right subtree is taller by 1 | ✅ Yes     |
| `0`            | Left and right are equal     | ✅ Yes     |
| `+1`           | Left subtree is taller by 1  | ✅ Yes     |
| `< -1 or > 1`  | Tree is unbalanced           | ❌ No      |

### 🧠 **Example:**

```
        30
       /  \
     20    40
           /
         35
```

* height(20) = 0
* height(40) = 1
* height(30) = 1 + max(0,1) = 2
* **Balance factor of node `30` = 0 - 1 = -1** → ✅ Balanced.

---

## ⚠️ Why is Balance Factor Important?

In an **AVL Tree**, after **every insertion or deletion**, the balance factor is checked at every node on the path back to the root. If the balance factor becomes **greater than 1 or less than -1**, it indicates an **imbalance**, and **rotations are required** to restore the AVL property.

---



## 🧠 Summary

| Concept            | Formula                                | Notes                    |       |                                |
| ------------------ | -------------------------------------- | ------------------------ | ----- | ------------------------------ |
| Height of node     | `1 + max(height(left), height(right))` | Leaf = 0, Null = -1      |       |                                |
| Balance Factor     | `height(left) - height(right)`         | AVL allows only -1, 0, 1 |       |                                |
| Balanced Tree Rule | \`                                     | balanceFactor            | ≤ 1\` | Otherwise, tree needs rotation |



## 📌 What is an AVL Tree?

An **AVL Tree** is a self-balancing Binary Search Tree in which the **difference of heights** between the left and right subtrees (balance factor) is **no more than 1** at any node.

Named after its inventors **Adelson-Velsky and Landis**, the AVL Tree guarantees:
- 🔺 **O(log n)** time complexity for `insert`, `delete`, and `search`
- 🔺 Balance via **rotations**
- ✅ Maintains **height balance property**

---

## 🚦 How to Approach AVL Tree Problems

1. **Understand BST rules**: AVL follows the BST structure — all left descendants < node < right descendants.
2. **Track height**: Maintain height of each node for balancing.
3. **Check balance factor**: If it's beyond `[-1, 0, 1]`, the tree is unbalanced.
4. **Trigger rotations**:
    - LL → Right Rotation
    - RR → Left Rotation
    - LR → Left Rotation + Right Rotation
    - RL → Right Rotation + Left Rotation
5. **Use recursion**: All insertions are recursive; balance and height updates are handled bottom-up via recursion and the **call stack**.

---

## 🔁 AVL Tree Rotations Explained

| Case         | Condition                              | Rotation       |
|--------------|-----------------------------------------|----------------|
| Left-Left    | Left subtree of left child is heavier   | Single Right   |
| Right-Right  | Right subtree of right child is heavier | Single Left    |
| Left-Right   | Right subtree of left child is heavier  | Left + Right   |
| Right-Left   | Left subtree of right child is heavier  | Right + Left   |

---

## 🧠 Call Stack Behavior

- Every insertion bubbles **up the recursive call stack**.
- After inserting at the leaf, each parent node is checked for **balance** and height is updated.
- Rotations are **applied upward** during unwinding of recursion.

---

## ⚙️ Core Features of This Implementation

- ✅ Recursive `insert` with automatic balancing
- ✅ Height maintenance for every node
- ✅ Left, right, and double rotations
- ✅ Pretty `display()` for tree structure
- ✅ `populate(int[])` and `populatedSorted(int[])` for random or balanced input
- ✅ Tree `balanced()` checker
- ✅ Support for AVL height and balance factor validation

---

## 📦 Code Structure Breakdown

### 🔸 Node Structure

```java
class Node {
    int value;
    Node left, right;
    int height;

    Node(int value) {
        this.value = value;
    }
}
````

Each node tracks its own `height`, which is essential for computing the balance factor.

---

### 🔸 Insert Operation

```java
public void insert(int value) {
    root = insert(value, root);
}

private Node insert(int value, Node node) {
    if (node == null) return new Node(value);

    if (value < node.value) node.left = insert(value, node.left);
    else if (value > node.value) node.right = insert(value, node.right);

    node.height = max(height(node.left), height(node.right)) + 1;
    return rotate(node);
}
```

* Inserts like a normal BST.
* On recursive backtrack, updates height and applies rotations if needed.

---

### 🔸 Rotations

#### ✅ Right Rotation (LL Case)

```java
Node rightRotate(Node p) {
    Node c = p.left;
    p.left = c.right;
    c.right = p;
    updateHeights(p, c);
    return c;
}
```

#### ✅ Left Rotation (RR Case)

```java
Node leftRotate(Node c) {
    Node p = c.right;
    c.right = p.left;
    p.left = c;
    updateHeights(c, p);
    return p;
}
```

#### ✅ Composite Rotations (LR, RL)

Automatically handled in the `rotate()` method by checking subtree imbalance patterns.

---

### 🔸 Display Method

```java
public void display() {
    display(root, "Root Node: ");
}
```

Prints tree nodes recursively in human-readable format:

```
Root Node: 30
Left child of 30 : 20
Right child of 30 : 40
```

---

## 🚀 Example Usage

```java
public class Main {
    public static void main(String[] args) {
        AVL tree = new AVL();
        tree.populate(new int[]{10, 20, 30, 40, 50, 25});
        tree.display();

        System.out.println("Is Balanced: " + tree.balanced());
        System.out.println("Tree Height: " + tree.height());
    }
}
```

---

## 📈 Real-World Applications

| Area              | Usage                                           |
| ----------------- | ----------------------------------------------- |
| Database Indexes  | Ensures fast lookup in B-Trees (variant of AVL) |
| Memory Management | Fast access in compilers & interpreters         |
| Network Routing   | Routing tables using AVL Trees for fast search  |
| Filesystems       | Metadata trees using balanced BSTs              |

---

## 🧮 Performance

| Operation | Time Complexity |
| --------- | --------------- |
| Insert    | O(log n)        |
| Delete    | O(log n)        |
| Search    | O(log n)        |
| Space     | O(n)            |

---

