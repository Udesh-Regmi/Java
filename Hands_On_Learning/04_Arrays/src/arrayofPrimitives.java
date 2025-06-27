import java.util.Arrays;
import java.util.Scanner;

public class arrayofPrimitives {

    public static void main(String[] args) {
        System.out.println("Basics of array");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of items");
        int numberofItemsinArray = in.nextInt();

        int[] arr = new int[numberofItemsinArray];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        // This is enhanched form of for loop. The syntax is
        /*
        for(datatype variable_name: array_name){
        variable_name // This prints all elements of that array
        }
         */
        for (int j : arr) {
            System.out.println("Element is " + j);
        }
        // Printing array by converting to string
        System.out.println(Arrays.toString(arr));
    }
}
