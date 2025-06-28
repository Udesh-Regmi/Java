import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Selection Sort (Descending Order)");

        int[] arr = {5, 3, 6, 87, 90, 0, 1, 4};
        selectionSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // Selection Sort: Places max at the end in each iteration
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;

        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
