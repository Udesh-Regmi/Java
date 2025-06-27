import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        // ------------------------ ArrayList Fundamentals ------------------------

        // ArrayList is a part of Java's Collection Framework.
        // It's a resizable array implementation (dynamic array) unlike primitive arrays.
        // It can grow or shrink at runtime and offers flexible memory management.
        // Here, we are creating an ArrayList of Integer objects (not int primitives).
        // Initial capacity is 10 (optional but useful for performance if size is known).
        ArrayList<Integer> listofInteger = new ArrayList<>(10);

        // Check if the ArrayList is empty (size == 0)
        if (listofInteger.isEmpty()) {
            System.out.println("ArrayList is empty");
        }

        // Adding elements to the list
        listofInteger.add(45);    // Auto-boxing: primitive int is converted to Integer
        listofInteger.add(33);

        // ❌ This line will throw a compilation error:
        // listofInteger.addFirst(01);
        // Reason: ArrayList does not have an addFirst() method. It's only available in LinkedList.
        // ✅ Instead, use:
        listofInteger.add(0, 1); // Inserts 1 at index 0, shifting the rest

        // Printing the contents of the ArrayList
        System.out.println("Current list: " + listofInteger); // Output: [1, 45, 33]

        // toArray() creates a new Object[] with the contents of the list
        Object[] array = listofInteger.toArray();
        System.out.println("Converted to array: " + Arrays.toString(array));

//        listofInteger[0] We cannot do things like this  for getting value at index we use .get(index) method.
        System.out.println(listofInteger.get(2));

        // Update something using set
        listofInteger.set(0, 89);
        System.out.println(listofInteger);

    }
}
