

## 🧵 What is Multithreading in Java?

Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. Each part is called a **thread**.

It's part of Java's **java.lang** package and is a critical feature for building **scalable**, **responsive**, and **real-time** applications.

---

## 🚦 Types of Multithreading in Java

| Type               | Description |
|--------------------|-------------|
| **User-level threads** | Managed by the JVM. Fast and lightweight. |
| **Kernel-level threads** | Managed by OS. Java threads can be mapped to these depending on the OS. |
| **Preemptive Multithreading** | JVM decides when to switch threads. Default in Java. |
| **Cooperative Multithreading** | Threads yield control voluntarily. Not default in Java. |

---

## 🏗️ Thread Lifecycle

```
New → Runnable → Running → Blocked/Waiting → Terminated
```

| State | Trigger |
|-------|---------|
| New | Thread object created |
| Runnable | `.start()` called |
| Running | JVM picks thread for execution |
| Blocked/Waiting | Thread waits for resources or signals |
| Terminated | Thread completes or is killed |

---

## 🧵 How to Create Threads

### 🔸 1. Extending `Thread` class

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName());
    }
}
MyThread t = new MyThread();
t.start();
```

### 🔸 2. Implementing `Runnable` interface

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName());
    }
}
Thread t = new Thread(new MyRunnable());
t.start();
```

### 🔸 3. Using Lambda (Functional approach)

```java
Thread t = new Thread(() -> System.out.println("Lambda thread"));
t.start();
```

---

## 🔃 Creating Multiple Threads

```java
for (int i = 0; i < 5; i++) {
    new Thread(() -> {
        System.out.println("Running: " + Thread.currentThread().getName());
    }).start();
}
```

---

## 🧠 The `main` Thread

- Every Java program starts in a `main` thread.
- JVM creates it automatically.
- Other threads spawn from it.
- `Thread.currentThread().getName()` returns `"main"` inside `main()`.

---

## 🎚️ Thread Priorities

Java thread priorities range from 1 to 10:
- `Thread.MIN_PRIORITY` = 1
- `Thread.NORM_PRIORITY` = 5 (default)
- `Thread.MAX_PRIORITY` = 10

```java
Thread t = new Thread();
t.setPriority(Thread.MAX_PRIORITY); // 10
```

Note: JVM *may* use these to schedule threads, but behavior is OS-dependent.

---

## 🧰 Synchronization in Java

To prevent race conditions when multiple threads access shared resources, use synchronization.

### 🔐 `synchronized` keyword

```java
public synchronized void increment() {
    count++;
}
```

Or for a block:

```java
synchronized (lockObject) {
    // critical section
}
```

### Static synchronized

Locks on the **class**, not the object:

```java
public static synchronized void method() {}
```

---

## 🔄 Inter-thread Communication

### Methods:
- `wait()` – pause thread and release lock
- `notify()` – resume a waiting thread
- `notifyAll()` – resume all waiting threads

```java
synchronized(lock) {
    while(!condition) lock.wait();
    // work
    lock.notify();
}
```

> 🧩 **Use Case**: Producer-Consumer problem

---

## ⚙️ Runnable vs Thread Class

| Aspect | Thread Class | Runnable Interface |
|--------|--------------|--------------------|
| Inheritance | Uses single inheritance (extends Thread) | Allows multiple interface inheritance |
| Reusability | Less reusable | Highly reusable |
| Separation of concerns | Task and thread combined | Separation between task and thread |
| Preferred for | Simple use cases | Scalable, real-world systems |

---

## 🚀 Use Cases of Multithreading

| Application | Threads Used |
|-------------|--------------|
| Web servers (e.g. Apache Tomcat) | One thread per request |
| Chat/Messaging apps | Thread per client |
| Video games | Game loop, AI, physics, rendering – all threads |
| Background tasks | Logging, async file writes |
| Real-time monitoring | IOT sensors, machine data feeds |
| GUI apps | Avoid UI freeze using background threads |

---

## 🧰 Advanced Concurrency APIs

| API | Purpose |
|-----|---------|
| `ExecutorService` | Thread pooling |
| `Callable` / `Future` | Return values from threads |
| `ScheduledExecutorService` | Timed thread execution |
| `ReentrantLock` | Advanced locking with timeout and fairness |
| `Semaphore`, `CountDownLatch`, `CyclicBarrier` | Thread coordination |
| `AtomicInteger` | Lock-free thread-safe operations |

---

## ❌ Common Mistakes

- Calling `.run()` instead of `.start()` (runs on same thread).
- Not using `join()` to wait for thread completion.
- Ignoring thread exceptions – always wrap `run()` in `try-catch`.
- Accessing shared resources without synchronization.

---

## 📋 Summary

```markdown
+------------------------+------------------------------+
| Feature                | API / Class                  |
+------------------------+------------------------------+
| Basic Threading        | Thread, Runnable             |
| Thread with result     | Callable, Future             |
| Thread Pooling         | ExecutorService              |
| Scheduled Tasks        | ScheduledExecutorService     |
| Thread-Safe Data       | ConcurrentHashMap, CopyOnWriteArrayList |
| Manual Locking         | ReentrantLock                |
| Coordination           | wait/notify/notifyAll        |
+------------------------+------------------------------+
```

---

## 🛠️ Sample Real-World Snippet (ExecutorService)

```java
ExecutorService executor = Executors.newFixedThreadPool(5);
for (int i = 0; i < 10; i++) {
    executor.execute(() -> {
        System.out.println("Task in: " + Thread.currentThread().getName());
    });
}
executor.shutdown();
```

---

## 🔚 Final Note

Multithreading is not just a skill — it's a **superpower**. Done right, it dramatically improves performance and scalability. Done wrong, it leads to **deadlocks**, **race conditions**, and **nightmare debugging**.

