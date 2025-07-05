import java.util.Arrays;

public class Merge_Start_Middle_End_Way {
    public static void main(String[] args) {
        System.out.println("Quick Sort using Start, Middle, and End");
        int[] arr = { 5, 4, 3, 2, 1, 0, 90};
        mergeSort(arr, 0,  arr.length );
        System.out.println(Arrays.toString(arr));

    }
    private static void mergeSort(int[] arr, int s, int e) {
        // Base case: if sub-array has one element, return
        if (e - s <= 1) return;

        int mid = s + (e - s) / 2;

        // Recursively sort the two halves
        mergeSort(arr, s, mid);
        mergeSort(arr, mid, e);

        // Merge sorted halves
        merge(arr, s, mid, e);
    }


    // Function to merge two sorted arrays into one sorted array
    private static void merge(int[] arr, int s, int mid , int e) {
        int[] mix = new int[e-s];

        int i = s; // pointer for first array
        int j = mid; // pointer for second array
        int k = 0; // pointer for mix (merged) array

        // Merge elements from both arrays in sorted order
        while (i <mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // If there are remaining elements in the first array, copy them
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        // If there are remaining elements in the second array, copy them
        // 🔧 FIXED: originally `i++` was incorrectly incremented instead of `j++`
        while (j < e) {
            mix[k] = arr[j];
            j++; // FIXED
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
            
        }
    }
}
