package Queue;

public class Queue {
    private int[] data;
    private int front;     // Points to the front element
    private int rear;      // Points to the last inserted element
    private int size;      // Current number of elements
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor
    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity) {
        data = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation
    public boolean enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return false;
        }
        rear++;
        data[rear] = item;
        size++;
        return true;
    }

    // Dequeue operation
    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue Underflow");
        }
        int item = data[front];
        front++;
        size--;
        return item;
    }

    // Peek front element
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return rear == data.length - 1;
    }

    // Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Get current size
    public int getSize() {
        return size;
    }
}
