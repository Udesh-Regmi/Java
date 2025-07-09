
---

# 📦 Stack (LIFO Data Structure)

A **Stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle — the last item added is the first one to be removed.

This Java implementation uses a **fixed-size array-based** approach, offering core stack operations with full boundary checks.

---

## 🚀 Features

- Custom or default-sized stack
- Supports standard stack operations:
  - `Push(item)`
  - `Pop()`
  - `Peek()`
  - `isEmpty()`
  - `isFull()`
  - `display()`
- Exception handling for underflow & overflow

---

## 🛠️ Implementation Overview

### 🔹 Stack Initialization

```java
int[] data;
private static final int SIZE = 10;
int ptr = -1;

public Stack() {
    this(SIZE);  // default size
}
public Stack(int size) {
    this.data = new int[size]; // custom size
}
````

---

### 🔹 Push Operation

Adds an element to the top of the stack.

```java
public boolean Push(int item) {
    if (isFull()) {
        System.out.println("Stack Overflow");
        return false;
    }
    data[++ptr] = item;
    return true;
}
```

---

### 🔹 Pop Operation

Removes and returns the top element. Throws exception if stack is empty.

```java
public int Pop() throws Exception {
    if (isEmpty()) {
        throw new Exception("Stack Underflow");
    }
    return data[ptr--];
}
```

---

### 🔹 Peek Operation

Returns the top element without removing it.

```java
public int Peek() throws Exception {
    if (isEmpty()) {
        throw new Exception("No Item in stack");
    }
    return data[ptr];
}
```

---

### 🔹 Check if Empty

```java
public boolean isEmpty() {
    return ptr == -1;
}
```

---

### 🔹 Check if Full

```java
public boolean isFull() {
    return ptr == data.length - 1;
}
```

---

### 🔹 Display Stack

Returns all elements in the stack.

```java
public int[] display() {
    return data;
}
```

---

## 💡 Real-World Applications of Stack

| Application Area       | Use Case Example                       |
| ---------------------- | -------------------------------------- |
| **Compilers**          | Function call tracking via call stacks |
| **Browser Navigation** | Back/Forward button operations         |
| **Undo/Redo Features** | Text editors, graphics software        |
| **Expression Parsing** | Infix to postfix/prefix conversion     |
| **DFS Traversal**      | In graphs and trees                    |
| **Syntax Validation**  | Balanced parentheses, brackets, etc.   |
| **Memory Management**  | Stack memory allocation                |

---

## 🧠 Strategy for Solving Stack-Based Problems

When approaching stack problems:

1. **Trace the flow manually**:

  * Use pen & paper to simulate stack push/pop operations.

2. **Identify reversal or backtracking patterns**:

  * Stack is perfect for these types of problems.

3. **Use auxiliary stacks if needed**:

  * Many problems like *Next Greater Element* use 2 stacks.

4. **Use Stack for Expression Evaluation**:

  * Very useful in converting and evaluating postfix/prefix expressions.

5. **Look for recursive equivalence**:

  * Stack often simulates recursion in iterative solutions.

---

## 📦 Sample Usage

```java
public class Main {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(5);

        stack.Push(10);
        stack.Push(20);
        stack.Push(30);

        System.out.println(Arrays.toString(stack.display())); // [10, 20, 30, 0, 0]
        System.out.println("Top element: " + stack.Peek());   // 30

        stack.Pop();
        System.out.println(Arrays.toString(stack.display())); // [10, 20, 0, 0, 0]
    }
}
```

---

## 🧪 Test Case Examples

| Operation    | Stack Status               |
| ------------ | -------------------------- |
| Push(5)      | \[5]                       |
| Push(10)     | \[5, 10]                   |
| Peek()       | returns `10`               |
| Pop()        | returns `10`, stack = \[5] |
| isEmpty()    | false                      |
| Pop(), Pop() | Underflow Exception        |

---

