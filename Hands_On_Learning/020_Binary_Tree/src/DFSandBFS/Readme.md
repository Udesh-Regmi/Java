
# 🔍 Graph & Tree Traversals: DFS vs BFS

This guide explains the two most fundamental algorithms used in **graph** and **tree traversal**:

- **DFS (Depth-First Search)**
- **BFS (Breadth-First Search)**

Whether you're working with **binary trees**, **general graphs**, or **pathfinding**, these traversal techniques are critical to master.

---

## 🧠 What is Traversal?

Traversal is the process of **visiting each node** in a data structure (e.g., tree or graph) **once** to either **search**, **analyze**, or **modify** it.

---

## 🔹 Depth-First Search (DFS)

### 📌 Definition:

DFS explores as **deep** as possible down one path before backtracking. It's a **recursive** or **stack-based** approach.

### 🔁 Traversal Order:
```

Root → Left (or Neighbor) → Left's Left → ... → Backtrack

````

### ✅ Use Cases:
| Scenario                       | Why DFS Works Well                   |
|--------------------------------|--------------------------------------|
| Tree traversals (Inorder, etc.)| Naturally depth-first                |
| Topological sorting            | Explore all dependencies             |
| Maze Solving                   | Follows a complete path              |
| Connected components           | DFS can mark visited areas easily    |

---

### 🛠️ DFS: Java (Graph - Adjacency List)

```java
void dfs(int node, boolean[] visited, List<List<Integer>> graph) {
    visited[node] = true;
    System.out.print(node + " ");
    for (int neighbor : graph.get(node)) {
        if (!visited[neighbor]) {
            dfs(neighbor, visited, graph);
        }
    }
}
````

---

### 📊 DFS Characteristics

| Feature             | Value                     |
| ------------------- | ------------------------- |
| **Data Structure**  | Stack (or recursion)      |
| **Space**           | O(V)                      |
| **Time**            | O(V + E)                  |
| **Can go infinite** | Yes (if cycles untracked) |

---

## 🔹 Breadth-First Search (BFS)

### 📌 Definition:

BFS explores all **neighbors** of a node first before moving to the next level. It uses a **queue**.

### 🔁 Traversal Order:

```
Root → All Children → Grandchildren → ...
```

### ✅ Use Cases:

| Scenario                   | Why BFS Works Well                    |
| -------------------------- | ------------------------------------- |
| Shortest Path (Unweighted) | Visits nodes level by level           |
| Finding levels in tree     | Natural fit for level-order traversal |
| Peer-to-peer broadcasting  | Spreads equally in all directions     |
| Cycle detection in graph   | Effective for undirected graphs       |

---

### 🛠️ BFS: Java (Graph - Adjacency List)

```java
void bfs(int start, List<List<Integer>> graph) {
    boolean[] visited = new boolean[graph.size()];
    Queue<Integer> queue = new LinkedList<>();
    visited[start] = true;
    queue.offer(start);

    while (!queue.isEmpty()) {
        int node = queue.poll();
        System.out.print(node + " ");
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                queue.offer(neighbor);
            }
        }
    }
}
```

---

### 📊 BFS Characteristics

| Feature             | Value                     |
| ------------------- | ------------------------- |
| **Data Structure**  | Queue                     |
| **Space**           | O(V)                      |
| **Time**            | O(V + E)                  |
| **Can go infinite** | Yes (if cycles untracked) |

---

## 🔄 DFS vs BFS: Comparison Table

| Feature            | DFS                           | BFS                         |
| ------------------ | ----------------------------- | --------------------------- |
| **Strategy**       | Depth-first (deep path first) | Breadth-first (level-wise)  |
| **Data Structure** | Stack / Recursion             | Queue                       |
| **Best for**       | Topology, paths, components   | Shortest paths (unweighted) |
| **Memory Usage**   | Less in wide graphs           | Less in deep/narrow graphs  |
| **Recursive?**     | Naturally recursive           | Needs explicit queue        |
| **Shortest Path?** | No                            | Yes (in unweighted graphs)  |

---

## 🧪 Tree DFS Example

For the binary tree:

```
       1
     /   \
    2     3
   / \   / \
  4   5 6   7
```

| Traversal | Output        |
| --------- | ------------- |
| DFS (Pre) | 1 2 4 5 3 6 7 |
| BFS       | 1 2 3 4 5 6 7 |

---

## 💡 Tips for Using DFS/BFS

* ✅ Use **DFS** when:

    * You want to **explore all paths**
    * You need **topological sorting**
    * You want to use **less memory** in wide graphs

* ✅ Use **BFS** when:

    * You need **shortest paths**
    * You need **level-order output**
    * You work with **unweighted graphs**

---

## 🌐 Real-World Applications

| Domain          | Use Case                   | Algorithm |
| --------------- | -------------------------- | --------- |
| Maps / GPS      | Finding routes             | BFS       |
| Compilers       | Dependency resolution      | DFS       |
| Social Networks | Friend suggestion (levels) | BFS       |
| Game AI         | Decision trees             | DFS       |
| Web Crawling    | Page depth limit           | BFS       |

---

