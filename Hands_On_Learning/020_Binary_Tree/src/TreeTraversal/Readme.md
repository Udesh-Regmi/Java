
---

# 🌲 Tree Traversal in Binary Trees

Tree traversal is a method of visiting **each node** in a tree data structure, **exactly once**, in a particular order. Traversals are fundamental for performing **searches, inserts, deletions**, or even **serializing trees**.

---

## 📖 What is Tree Traversal?

In any traversal, the goal is to **visit each node** in the tree **systematically**. Unlike linear data structures (arrays, lists), trees have multiple branching paths — so we must define an order.

There are two main categories:

| Category          | Types                                  |
|------------------|----------------------------------------|
| **Depth-First**   | Preorder, Inorder, Postorder           |
| **Breadth-First** | Level Order (uses queue, not recursion)|

This README focuses on **Depth-First Traversal** methods.

---

## 🔁 Types of Depth-First Traversals

Each traversal method is defined by the **order in which nodes are visited**:  
**Root (R), Left Subtree (L), Right Subtree (R)**

| Traversal     | Order       | Use Case Example                        |
|---------------|-------------|-----------------------------------------|
| Preorder      | R → L → R   | Copying a tree, Prefix expressions      |
| Inorder       | L → R → R   | Sorted output in BST                    |
| Postorder     | L → R → R   | Deleting tree, Postfix expressions      |

---

## 🔷 Preorder Traversal (Root → Left → Right)

### 🔹 Description:
- Visit the root node
- Traverse the left subtree
- Traverse the right subtree

### 🧠 Use Case:
- Useful when you want to **clone a tree**
- Converts tree to **prefix notation**

### 📌 Recursive Java Code:
```java
void preorder(Node node) {
    if (node == null) return;
    System.out.print(node.value + " ");
    preorder(node.left);
    preorder(node.right);
}
````

### 🌳 Example Tree:

```
        10
       /  \
      5   20
         /  \
        15  30
```

### ✅ Output:

```
10 5 20 15 30
```

---

## 🔷 Inorder Traversal (Left → Root → Right)

### 🔹 Description:

* Traverse the left subtree
* Visit the root node
* Traverse the right subtree

### 🧠 Use Case:

* In a **Binary Search Tree (BST)**, this prints elements in **sorted order**

### 📌 Recursive Java Code:

```java
void inorder(Node node) {
    if (node == null) return;
    inorder(node.left);
    System.out.print(node.value + " ");
    inorder(node.right);
}
```

### ✅ Output for the above tree:

```
5 10 15 20 30
```

---

## 🔷 Postorder Traversal (Left → Right → Root)

### 🔹 Description:

* Traverse the left subtree
* Traverse the right subtree
* Visit the root node

### 🧠 Use Case:

* Ideal for **deleting** or **freeing memory** (deallocating children before parent)
* Used in **expression tree evaluation (postfix)**

### 📌 Recursive Java Code:

```java
void postorder(Node node) {
    if (node == null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.value + " ");
}
```

### ✅ Output for the above tree:

```
5 15 30 20 10
```

---

## 🎓 Comparison Table

| Traversal | Order     | Printed Output (for sample tree) |
| --------- | --------- | -------------------------------- |
| Preorder  | R → L → R | 10 5 20 15 30                    |
| Inorder   | L → R → R | 5 10 15 20 30                    |
| Postorder | L → R → R | 5 15 30 20 10                    |

---

## 🧪 Sample Node Class for Traversals

```java
class Node {
    int value;
    Node left, right;
    Node(int value) {
        this.value = value;
    }
}
```

---

## 💡 How to Choose a Traversal

| Scenario                                | Use Traversal |
| --------------------------------------- | ------------- |
| Evaluate expressions                    | Postorder     |
| Clone/Copy a tree                       | Preorder      |
| Print values in sorted order (BST only) | Inorder       |
| Safely delete entire tree (bottom-up)   | Postorder     |
| Serialize/Deserialize tree              | Preorder      |

---


