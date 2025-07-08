package Doubly_Linked_List;


public class LinkedList {
    private Node head;
    private Node tail;
    private int SIZE;

    public LinkedList() {
        this.SIZE = 0;
    }

    // Inserts node at the beginning
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }
        head = node;

        if (tail == null) {
            tail = head;
        }
        SIZE++;
    }

    // Inserts node at the end
    public void insertLast(int val) {
        Node node = new Node(val);
        node.prev = tail;
        node.next = null;

        if (tail != null) {
            tail.next = node;
        }
        tail = node;

        if (head == null) {
            head = tail;
        }
        SIZE++;
    }

    // Inserts node at a given index
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
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;

        SIZE++;
    }

    // Deletes node from beginning
    public int deleteFirst() {
        if (head == null) throw new IllegalStateException("List is empty");

        int val = head.value;
        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null; // list became empty
        }
        SIZE--;
        return val;
    }

    // Deletes node from end
    public int deleteLast() {
        if (tail == null) throw new IllegalStateException("List is empty");

        int val = tail.value;
        tail = tail.prev;

        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        SIZE--;
        return val;
    }

    // Deletes node at given index
    public int delete(int index) {
        if (index < 0 || index >= SIZE) throw new IndexOutOfBoundsException("Invalid index");

        if (index == 0) return deleteFirst();
        if (index == SIZE - 1) return deleteLast();

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        int val = temp.value;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        SIZE--;
        return val;
    }

    // Returns node at given index
    public Node get(int index) {
        if (index < 0 || index >= SIZE) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Finds and returns node by value
    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.value == val) return node;
            node = node.next;
        }
        return null;
    }

    // Displays list from head to tail
    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " <-> ");
            node = node.next;
        }
        System.out.println("END");
    }

    // Displays list in reverse from tail to head
    public void displayReverse() {
        Node node = tail;
        while (node != null) {
            System.out.print(node.value + " <-> ");
            node = node.prev;
        }
        System.out.println("START");
    }

    // Internal node class
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
