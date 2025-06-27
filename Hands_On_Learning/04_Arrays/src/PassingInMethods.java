import java.util.Arrays;

public class PassingInMethods {
    public static void main(String[] args) {

        // --------------------------- MEMORY ALLOCATION DETAILS ---------------------------

        // 1. int[] nums = {1 , 3, 5, 6, 7, 9};
        //    - At compile time: the reference variable `nums` is created in the stack.
        //    - At runtime: the array object {1, 3, 5, 6, 7, 9} is created in heap memory.
        //    - The `nums` variable holds a reference (memory address) that points to this array object in the heap.

        int[] nums = {1 , 3, 5, 6, 7, 9};

        // 2. Method call: change(nums);
        //    - Java passes object references **by value** (i.e., it passes a **copy of the reference**, not the actual object).
        //    - So, inside the method `change`, the parameter `arr` is a copy of the reference `nums`.
        //    - Both `arr` and `nums` now point to the **same array object** in the heap.
        //    - Any modification through `arr` affects the original object pointed to by `nums`.

        change(nums);

        // 3. Arrays.toString(nums) will now print the modified array.
        //    - Since the array was mutated via the method, the change is reflected here.

        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        // 4. arr[0] = 99;
        //    - This modifies the first element of the **heap-allocated array**.
        //    - Since `arr` and `nums` both point to the same array in heap, this change is visible outside the method.
        arr[0] = 99;
    }
}
