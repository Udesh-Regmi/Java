package Doubly_Linked_List;

public class Main {
    public static void main(String[] args) {
        LinkedList dll = new LinkedList();

        System.out.println("➡ Inserting at head:");
        dll.insertFirst(10);
        dll.insertFirst(20);
        dll.insertFirst(30);
        dll.display();  // 30 <-> 20 <-> 10 <-> END

        System.out.println("➡ Inserting at tail:");
        dll.insertLast(99);
        dll.insertLast(100);
        dll.display();  // 30 <-> 20 <-> 10 <-> 99 <-> 100 <-> END

        System.out.println("➡ Inserting at position 2 (value: 55):");
        dll.insert(55, 2);
        dll.display();  // 30 <-> 20 <-> 55 <-> 10 <-> 99 <-> 100 <-> END

        System.out.println("➡ Deleting first element:");
        dll.deleteFirst();
        dll.display();  // 20 <-> 55 <-> 10 <-> 99 <-> 100 <-> END

        System.out.println("➡ Deleting last element:");
        dll.deleteLast();
        dll.display();  // 20 <-> 55 <-> 10 <-> 99 <-> END

        System.out.println("➡ Deleting at position 2:");
        dll.delete(2);
        dll.display();  // 20 <-> 55 <-> 99 <-> END

        System.out.println("➡ Display in reverse:");
        dll.displayReverse();  // 99 <-> 55 <-> 20 <-> START

        System.out.println("✅ All operations executed.");
    }
}
