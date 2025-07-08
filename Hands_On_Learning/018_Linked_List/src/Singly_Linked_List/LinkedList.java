package Singly_Linked_List;

public class LinkedList {

    private Node head;
    private Node tail;
    private int SIZE;

    public LinkedList() {
        this.SIZE = 0;
    }

    // Inserts a node at the beginning of the list
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        SIZE++;
    }

    // Deletes the first node and returns its value
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        SIZE--;
        return val;
    }

    // Deletes the last node and returns its value
    public int deleteLast(){
        if (SIZE <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(SIZE - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        SIZE--;
        return val;
    }

    // Deletes a node at a given index
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == SIZE - 1){
            return deleteLast();
        }
        Node prevNode = get(index - 1);
        int val = prevNode.next.value;
        prevNode.next = prevNode.next.next;
        SIZE--;
        return val;
    }

    // Returns the node at a specific index
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Finds and returns the node containing the given value
    public Node find(int val){
        Node node = head;
        while (node != null) {
            if (node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // Inserts a node at the end of the list
    public void insertLast(int val){
        Node node = new Node(val);
        if (tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        SIZE++;
    }

    // Inserts a node at a given index
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == SIZE){
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

    // Displays the list in human-readable format
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Internal class representing a node
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
