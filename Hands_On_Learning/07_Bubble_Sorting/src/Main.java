import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------- Bubble Sort / Sinking Sort / Exchange Sort -----------------");
        System.out.println("With every pass, the largest unsorted element 'sinks' to its correct position.");
        System.out.println("So we reduce the range of comparison with each pass.");

        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Sorted Array:   " + Arrays.toString(arr));
    }

    // Bubble sort implementation with optimization
    private static void bubbleSort(int[] arr) {
        boolean swapped;

        for (int i = 0; i < arr.length ; i++) {//  for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;

            for (int j = 1; j < arr.length - i; j++) { //  for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j - 1]) { //                 if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1]; //                     arr[j] = arr[j + 1];

                    arr[j - 1] = temp; //                     arr[j + 1] = temp;


                    swapped = true;
                }
            }

            // Print array after each pass (optional for learning)
            System.out.println("After pass " + (i + 1) + ": " + Arrays.toString(arr));

            // If no two elements were swapped, array is sorted
            if (!swapped) break;
        }
    }
}
