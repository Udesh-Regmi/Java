import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        /*
                    123
                    456
                    789
         */
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][];// We need to specify the row but column is optional.

        System.out.println(arr.length);// it will return the no of rows in that multidimensional array.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        // Enhanched for each loop for that array.

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println(" ");
        }
    }
}
