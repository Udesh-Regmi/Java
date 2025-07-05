import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 20, 903, 1, 11, 90, 80};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Quick Sort using Middle Element as Pivot
     */
    static void quickSort(int[] nums, int low, int high) {
        if (low >= high) return;

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        // Partitioning logic
        while (start <= end) {
            // Find first element from left greater than or equal to pivot
            while (nums[start] < pivot) start++;

            // Find first element from right less than or equal to pivot
            while (nums[end] > pivot) end--;

            // Swap elements if start <= end
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // Recursive calls to sort partitions
        quickSort(nums, low, end);   // Left partition
        quickSort(nums, start, high); // Right partition
    }
}
