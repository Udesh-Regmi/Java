package Singly_Linked_List;


    public class Main {
        public static void main(String[] args) {
            System.out.println("Linked List Examples ");
            LinkedList ll= new LinkedList();
            ll.insertFirst(20);
            ll.insertFirst(30);
            ll.insertFirst(50);
            ll.insertFirst(0);
            ll.insertFirst(70);
            ll.display();
            ll.deleteFirst();
            ll.find(1);
            ll.display();
            ll.insertLast(111);
            ll.insertLast(2323);
            ll.insert(1, 4);
            ll.deleteLast();
            ll.delete(2);
            ll.display();


        }
    }

