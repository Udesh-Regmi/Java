import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2, 4, 6,7,3};
        swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int source, int destination){
        int temp = arr[source];
        arr[source] = arr[destination];
        arr[destination] = temp;
    }
}
