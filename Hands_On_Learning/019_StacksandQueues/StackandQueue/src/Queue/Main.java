package Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();               // Output: Queue: 10 20 30
        System.out.println(q.peek());  // Output: 10
        q.dequeue();
        q.display();               // Output: Queue: 20 30
    }
}
