package CircularLinkedList;

/**
 * Circular Linked List implementation in Java.
 * Last node's next points to head, forming a cycle.
 */
public class LinkedList {
    private Node head;
    private Node tail;
    private int SIZE;

    public LinkedList() {
        this.SIZE = 0;
    }

    // Insert node at the beginning
    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
        } else {
            node.next = head;
            head = node;
            tail.next = head;
        }
        SIZE++;
    }

    // Insert node at the end
    public void insertLast(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        tail.next = head;
        SIZE++;
    }

    // Insert at specific index
    public void insert(int val, int index) {
        if (index < 0 || index > SIZE) return;
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == SIZE) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        SIZE++;
    }

    // Delete first node
    public int deleteFirst() {
        if (head == null) throw new IllegalStateException("List is empty");

        int val = head.value;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }

        SIZE--;
        return val;
    }

    // Delete last node
    public int deleteLast() {
        if (SIZE <= 1) {
            return deleteFirst();
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        int val = tail.value;
        tail = temp;
        tail.next = head;
        SIZE--;
        return val;
    }

    // Delete at specific index
    public int delete(int index) {
        if (index < 0 || index >= SIZE) throw new IndexOutOfBoundsException();

        if (index == 0) return deleteFirst();
        if (index == SIZE - 1) return deleteLast();

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        int val = temp.next.value;
        temp.next = temp.next.next;
        SIZE--;
        return val;
    }

    // Find node by value
    public Node find(int val) {
        if (head == null) return null;

        Node temp = head;
        do {
            if (temp.value == val) return temp;
            temp = temp.next;
        } while (temp != head);

        return null;
    }

    // Get node by index
    public Node get(int index) {
        if (index < 0 || index >= SIZE) return null;

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Display the list in circular fashion
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    // Internal Node class
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
