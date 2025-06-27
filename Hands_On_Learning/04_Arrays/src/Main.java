public class Main {
    public static void main(String[] args) {
        // In Java, an array is a fixed-size data structure that stores elements of the same data type.
        // Arrays provide a way to group related values together under a single variable name and
        // are useful for handling collections of data efficiently.

        // Syntax:
        // Preferred style:
        // dataType[] arrayName = new dataType[size];

        // Less preferred but still valid style:
        // dataType arrayName[] = new dataType[size];

        // Example:
        int[] numbers = new int[5]; // Declares an array of integers with size 5
        // Leftpart happens at compile time |||| Right part happens at run time. (also called Dynamic memory allocation)
        /*
        Flow of how memory is created in stack and heap .
        int [] numbers;  Declaration of array. it is getting defined in stack through reference variable numbers and it is pointing to heap after initialization .
        numbers = new int[5]; Initialization : actual object is  created in heap.
         */

        // Initializing values in the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing and displaying array elements
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // Note:
        // In java internally,  the array may not be continuous like in other languages C, C++. In java the array objects are in heap and the Java specification language tells that the memory allocated in heap may not be continuous. so , it depends upon JVM as the run time.

        // - Arrays in Java are zero-indexed.
        // - Once created, their size is fixed.
        // - Attempting to access an invalid index will throw ArrayIndexOutOfBoundsException.
        // Explainataion is in .md file so check that out on Main.md
        // Arrays are mutuable so change in array from one part will reflect on other parts.
        // For array context:  The new keyword is used to create an object in heap memory of array size. It happens at run time.
    }
}
