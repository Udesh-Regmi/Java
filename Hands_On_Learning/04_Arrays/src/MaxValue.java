import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(maxFinder(arr));

    }
    static int maxFinder(int[] arr){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
}
