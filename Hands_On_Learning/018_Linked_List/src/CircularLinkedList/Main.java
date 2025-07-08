package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList cll = new LinkedList();

        cll.insertFirst(20);
        cll.insertFirst(10);
        cll.insertLast(30);
        cll.insertLast(40);
        cll.insert(25, 2);  // Insert 25 at index 2

        cll.display();  // Expected: 10 -> 20 -> 25 -> 30 -> 40 -> (back to head)

        System.out.println("Deleted First: " + cll.deleteFirst());
        System.out.println("Deleted Last: " + cll.deleteLast());
        System.out.println("Deleted at index 1: " + cll.delete(1));

        cll.display();  // Expected: 20 -> 30 -> (back to head)

        System.out.println("Found: " + cll.find(30));
    }
}
