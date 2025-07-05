import java.util.Arrays;
// Simplest Way .
public class MergeSort_Easy_Way {
    public static void main(String[] args) {
        System.out.println("Merge Sort");

        // Merge Sort works by:
        // 1. Dividing the array into two halves,
        // 2. Sorting each half recursively,
        // 3. Merging the sorted halves.

        int[] arr = {5, 4, 3, 2, 1};

        // Calling the recursive mergeSort function and reassigning the sorted array
        arr = mergeSort(arr);

        // Display the final sorted array
        System.out.println("Merge sort sorted array is " + Arrays.toString(arr));
    }

    // Recursive merge sort function
    private static int[] mergeSort(int[] arr) {
        // Base case: if array contains only one element, it's already sorted
        if (arr.length == 1) {
            return arr;
        }

        // Divide the array into two halves
        int mid = arr.length / 2;

        // Recursively sort the left half
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));

        // Recursively sort the right half
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the sorted halves and return the result
        return merge(left, right);
    }

    // Function to merge two sorted arrays into one sorted array
    private static int[] merge(int[] first, int[] second) {
        // The resulting array will have a length equal to the sum of both input arrays
        int[] mix = new int[first.length + second.length];

        int i = 0; // pointer for first array
        int j = 0; // pointer for second array
        int k = 0; // pointer for mix (merged) array

        // Merge elements from both arrays in sorted order
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // If there are remaining elements in the first array, copy them
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // If there are remaining elements in the second array, copy them
        // 🔧 FIXED: originally `i++` was incorrectly incremented instead of `j++`
        while (j < second.length) {
            mix[k] = second[j];
            j++; // FIXED
            k++;
        }

        // Return the merged and sorted array
        return mix;
    }
}
