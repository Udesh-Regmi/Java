

# 🛤️ Queue (FIFO Data Structure)

A **Queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle — the first element inserted is the first one to be removed.

This Java implementation uses a **static array-based queue** with proper boundary checks and operations.

---

## 🚀 Features

- Custom or default-sized queue
- Supports standard queue operations:
  - `enqueue(item)`
  - `dequeue()`
  - `peek()`
  - `isEmpty()`
  - `isFull()`
  - `display()`
- Exception handling for overflow and underflow
- Modular design ready for extension to circular or dynamic queues

---

## 🛠️ Implementation Overview

### 🔹 Queue Initialization

```java
int[] data;
int front = 0;
int rear = -1;
private static final int SIZE = 10;

public Queue() {
    this(SIZE);
}

public Queue(int size) {
    this.data = new int[size];
}
````

---

### 🔹 Enqueue Operation

Adds an element at the rear of the queue.

```java
public boolean enqueue(int item) {
    if (isFull()) {
        System.out.println("Queue Overflow");
        return false;
    }
    data[++rear] = item;
    return true;
}
```

---

### 🔹 Dequeue Operation

Removes and returns the front element. Throws exception if queue is empty.

```java
public int dequeue() throws Exception {
    if (isEmpty()) {
        throw new Exception("Queue Underflow");
    }
    int item = data[front++];
    return item;
}
```

---

### 🔹 Peek Operation

Returns the front element without removing it.

```java
public int peek() throws Exception {
    if (isEmpty()) {
        throw new Exception("Queue is empty");
    }
    return data[front];
}
```

---

### 🔹 isEmpty

```java
public boolean isEmpty() {
    return front > rear;
}
```

---

### 🔹 isFull

```java
public boolean isFull() {
    return rear == data.length - 1;
}
```

---

### 🔹 Display Queue

```java
public void display() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return;
    }
    for (int i = front; i <= rear; i++) {
        System.out.print(data[i] + " ");
    }
    System.out.println();
}
```

---

## 🎯 Real-World Applications of Queue

| Application Area       | Use Case Example                      |
| ---------------------- | ------------------------------------- |
| **OS Scheduling**      | CPU task queues, job schedulers       |
| **Networking**         | Packet transmission queues            |
| **I/O Buffers**        | Input/Output stream buffering         |
| **Customer Service**   | Call center queues, ticketing systems |
| **Simulation Systems** | Queues in logistics, banks, hospitals |
| **Tree Traversal**     | Level-order traversal using queue     |

---

## 🧠 Strategy for Solving Queue Problems

1. **Track Indices**: Be clear about `front` and `rear`. For static queues, always check for wrap-around/circular overflow.
2. **Avoid Shifting**: Don't shift elements in array-based queues; instead, manage front and rear intelligently.
3. **Circular Queue**: If your problem involves wrap-around, use modulo arithmetic to handle circular queues.
4. **Two-Stack Queue**: Many interview questions ask you to implement a queue using two stacks.
5. **Real-time Systems**: Think of queues as a pipeline—elements must flow through in order.

---

## 🧪 Sample Usage

```java
public class Main {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();           // Output: 10 20 30

        System.out.println(q.peek());  // 10
        q.dequeue();
        q.display();           // Output: 20 30
    }
}
```

---

## 🔁 Test Case Examples

| Operation    | Queue State         |
| ------------ | ------------------- |
| enqueue(10)  | \[10]               |
| enqueue(20)  | \[10, 20]           |
| peek()       | returns `10`        |
| dequeue()    | removes `10`        |
| isEmpty()    | false               |
| dequeue() x3 | Underflow Exception |

---


--- 

---

# 🔄 Circular Queue (Ring Buffer FIFO)

A **Circular Queue** is a linear data structure that follows **FIFO (First In, First Out)**, but unlike a regular queue, the last position connects back to the first to form a **circle**. This allows **efficient memory usage** by reusing empty spaces left by dequeued elements.

---

## 🚀 Key Features

✅ Space-efficient memory reuse  
✅ Fixed-size array implementation  
✅ Supports:
- `enqueue(item)`
- `dequeue()`
- `peek()`
- `isEmpty()`
- `isFull()`
- `display()`

✅ Optimized for constant time insertion and deletion  
✅ Ideal for buffer, scheduling, and hardware-level queue operations

---

## 🔧 Core Concepts

- **Front**: Points to the position of the element to dequeue  
- **Rear**: Points to the last inserted element  
- **Empty condition**: `front == -1`  
- **Full condition**: `(rear + 1) % size == front`

---

## 🛠️ Implementation Overview

### 🔹 Initialization

```java
int[] data;
int front = -1;
int rear = -1;
private static final int SIZE = 10;

public CircularQueue() {
    this(SIZE);
}

public CircularQueue(int size) {
    this.data = new int[size];
}
````

---

### 🔹 Enqueue Operation

```java
public boolean enqueue(int item) {
    if (isFull()) {
        System.out.println("Queue Overflow");
        return false;
    }

    if (isEmpty()) {
        front = 0;
    }

    rear = (rear + 1) % data.length;
    data[rear] = item;
    return true;
}
```

---

### 🔹 Dequeue Operation

```java
public int dequeue() throws Exception {
    if (isEmpty()) {
        throw new Exception("Queue Underflow");
    }

    int item = data[front];

    if (front == rear) {
        front = rear = -1;  // Queue becomes empty
    } else {
        front = (front + 1) % data.length;
    }

    return item;
}
```

---

### 🔹 Peek Operation

```java
public int peek() throws Exception {
    if (isEmpty()) {
        throw new Exception("Queue is empty");
    }
    return data[front];
}
```

---

### 🔹 isEmpty & isFull

```java
public boolean isEmpty() {
    return front == -1;
}

public boolean isFull() {
    return (rear + 1) % data.length == front;
}
```

---

### 🔹 Display Queue

```java
public void display() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return;
    }

    int i = front;
    System.out.print("Queue: ");
    while (true) {
        System.out.print(data[i] + " ");
        if (i == rear) break;
        i = (i + 1) % data.length;
    }
    System.out.println();
}
```

---

## 📚 Real-World Applications

| Domain                | Application                                     |
| --------------------- | ----------------------------------------------- |
| **OS & Scheduling**   | CPU time slice rotation, round-robin schedulers |
| **Networking**        | Circular buffers in routers                     |
| **Hardware Buffers**  | Streaming audio/video buffer queues             |
| **Embedded Systems**  | Event loops, command buffers                    |
| **Fixed-size Queues** | When bounded size and reuse are required        |

---

## 🧠 Problem-Solving Strategy

1. **Modulo Arithmetic**: Handle wrap-around using `(index + 1) % size`.
2. **Boundary Cases**: Check when queue becomes empty again (`front == rear`).
3. **Avoid Element Shifting**: Unlike a normal queue, circular queues **reuse slots**.
4. **Simulate Buffers**: Use for fixed-size data streams.
5. **Visualize Wrap-Around**: It helps to draw a circular buffer on paper.

---

## 📊 Circular Queue Diagram (Conceptual)

```
   [4] [5] [6] [ ] [1] [2] [3]
          ↑     ↑
        rear   front
```

* Data wraps around in a ring-like manner.
* Useful when queue head moves ahead but space is available at the start.

---

## 🧪 Sample Usage

```java
public class Main {
    public static void main(String[] args) throws Exception {
        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display(); // Output: 10 20 30 40

        q.dequeue();
        q.dequeue();
        q.enqueue(50);
        q.enqueue(60);
        q.display(); // Output: 30 40 50 60
    }
}
```

---

## ⚠️ Edge Case Examples

| Operation            | State (front, rear) | Queue Content  |
| -------------------- | ------------------- | -------------- |
| enqueue(10)          | (0,0)               | \[10]          |
| enqueue(20,30,40)    | (0,3)               | \[10 20 30 40] |
| dequeue(), dequeue() | (2,3)               | \[30 40]       |
| enqueue(50,60)       | (2,0)               | Wraps around   |
| enqueue(70)          | Overflows (full)    | ❌ Error        |

---


---

# 🥇 Priority Queue in Java

A **Priority Queue** is an abstract data structure where **each element has a priority**, and elements with higher priority are dequeued before elements with lower priority.

Unlike standard queues (FIFO), priority queues **order elements based on importance**, not arrival time.

---

## 🚀 Key Features

- Dynamic priority-based ordering
- Java array-based implementation
- Supports:
  - `insert(item, priority)`
  - `remove()`
  - `peek()`
  - `isEmpty()`
  - `isFull()`
  - `display()`
- Adaptable to min-heap or max-heap
- Easily extended to support custom objects (via Comparators)

---

## 📦 Real-World Applications

| Domain                  | Example                                           |
|--------------------------|---------------------------------------------------|
| **OS Scheduling**         | CPU jobs scheduled based on process priority     |
| **Networking**            | Packet routing based on urgency or QoS           |
| **Pathfinding Algorithms**| Dijkstra’s / A* algorithms                       |
| **Event Simulation**      | Events handled in order of occurrence time       |
| **AI Systems**            | Decision queues ranked by utility/urgency        |
| **Data Compression**      | Huffman Coding (Min-Heap PQ)                    |

---

## 🔍 Implementation Overview

### 🔹 Data Structure

```java
class Node {
    int value;
    int priority;

    public Node(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }
}
````

```java
class PriorityQueue {
    private Node[] data;
    private int size;
    private final int capacity;

    public PriorityQueue(int capacity) {
        this.capacity = capacity;
        this.data = new Node[capacity];
        this.size = 0;
    }
}
```

---

## 🧠 Behavior & Ordering

* For **max-priority queue**, the highest priority (larger number) is dequeued first.
* For **min-priority queue**, the lowest priority (smaller number) is dequeued first.
* This example assumes **higher number = higher priority**.

---

## 🔧 Priority Queue Operations

### ✅ Insert Operation

```java
public boolean insert(int value, int priority) {
    if (isFull()) {
        System.out.println("Queue Overflow");
        return false;
    }
    Node node = new Node(value, priority);
    int i = size - 1;
    while (i >= 0 && data[i].priority < priority) {
        data[i + 1] = data[i];  // shift lower-priority elements
        i--;
    }
    data[i + 1] = node;
    size++;
    return true;
}
```

---

### ✅ Remove Highest Priority Element

```java
public Node remove() throws Exception {
    if (isEmpty()) {
        throw new Exception("Queue Underflow");
    }
    return data[--size];
}
```

---

### ✅ Peek Top Priority Element

```java
public Node peek() throws Exception {
    if (isEmpty()) {
        throw new Exception("Queue is empty");
    }
    return data[size - 1];
}
```

---

### ✅ Utility Methods

```java
public boolean isEmpty() {
    return size == 0;
}

public boolean isFull() {
    return size == capacity;
}

public void display() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return;
    }
    for (int i = size - 1; i >= 0; i--) {
        System.out.println("Value: " + data[i].value + ", Priority: " + data[i].priority);
    }
}
```

---

## 🧪 Sample Usage

```java
public class Main {
    public static void main(String[] args) throws Exception {
        PriorityQueue pq = new PriorityQueue(5);

        pq.insert(10, 2);
        pq.insert(20, 4);
        pq.insert(30, 1);
        pq.insert(40, 5);

        pq.display();

        System.out.println("Removed: " + pq.remove().value); // 40
        System.out.println("Top Priority: " + pq.peek().value); // 20
    }
}
```

---

## 📈 Priority Queue Structure (Max-Heap Logic)

```
Insertions:
(40, 5) → (20, 4) → (10, 2) → (30, 1)

Priority Order (Top -> Bottom):
[40, 20, 10, 30]
```

---

## 🧠 Algorithmic Strategies

| Tip               | Explanation                                                |
| ----------------- | ---------------------------------------------------------- |
| **Heap-based PQ** | Use Java’s `PriorityQueue` with custom comparators         |
| **Binary Heap**   | Optimal for dynamic inserts/removals (O(log n))            |
| **Indexed PQ**    | Use when position/index lookup is needed                   |
| **Tie-breaking**  | For equal priorities, use secondary keys (e.g., timestamp) |
| **Min vs Max**    | Min = smallest number is highest priority (e.g., Dijkstra) |

---

## ⚙️ Advanced Extensions

* ✅ Generic Priority Queue: `PriorityQueue<T>`
* ✅ Custom Comparators for complex object ranking
* ✅ Thread-safe variants using `PriorityBlockingQueue`
* ✅ Graph-based implementations (e.g., for A\* / Dijkstra)

---

## 💡 Java Built-in Option

```java
PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min-Heap
pq.add(10);
pq.add(5);
System.out.println(pq.poll()); // 5
```

For max-heap:

```java
PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
```

