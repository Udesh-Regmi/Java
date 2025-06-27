import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------Bubble Sort / Sinking Sort / Exchange Sort----------------- ");
        int [] arr = { 5, 4, 3, 2, 1 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped ;
        // The for loop can be used in 2 ways either -1 or only from length
        for (int i = 0; i < arr.length; i++) { //  for (int i = 0; i < arr.length - 1; i++) {

            swapped = false;
            // If j is  used from 1 then -1 is not needed but if initialized j from 0 ,  -1  is needed .
            for (int j = 1; j < arr.length - i ; j++) {//for (int j = 0; j < arr.length - i - 1; j++) {

                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}