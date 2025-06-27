import java.util.Arrays;
import java.util.Scanner;

public class arrayofObject {
    public static void main(String[] args) {

        // --------------------------- MEMORY ALLOCATION DETAILS ---------------------------

        // 1. String[] str = new String[5];
        //    - At compile time: a reference variable `str` is declared and stored in stack memory.
        //    - At runtime: `new String[5]` creates an array object in heap memory capable of holding 5 references to String objects.
        //    - Initially, all 5 elements in the array are set to `null`.
        //    - The variable `str` in stack points to this array in the heap.

        String[] str = new String[5];

        // 2. Scanner in = new Scanner(System.in);
        //    - A reference variable `in` is created in the stack.
        //    - `new Scanner(System.in)` creates a Scanner object in heap memory.
        //    - `in` points to this Scanner object.

        Scanner in = new Scanner(System.in);

        // 3. The loop fills each index of the array with a String input.
        //    - For each iteration, `in.nextLine()` reads a line of input and creates a new String object in the heap.
        //    - That String object's reference is then assigned to the respective index in the `str` array (which is also in the heap).
        //    - So the array in heap now contains 5 references, each pointing to individual String objects in the heap.

        for (int i = 0; i < str.length; i++) {
            str[i] = in.nextLine();
        }

        // 4. Arrays.toString(str) is a utility call that creates a new String representation of the array contents.
        //    - This output string is created in the heap and printed to console.
        System.out.println(Arrays.toString(str));
    }
}
