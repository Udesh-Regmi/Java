import java.util.Scanner;

public class LinearSearchIndex {
    public static void main(String[] args) {
        System.out.println("Linear Search Algorithm ");
        // Time Complexity
        // Best Time Complexity: O(1) : When the element is at index 0 no matter what is the size of the array it is in the first poisition so only checks the first element and element is found at that index.
        // Worst Time Complexity : O(n) : When the element is not in the array, we will check each and every element till the last element and the element is not found so we have to iterate at each and every element.
        int[] arr= {12, 23, 44, 2, 5, 6, 8, 923, 393};
        System.out.println("Enter target : ");
        int target = new Scanner(System.in).nextInt();
       int indexValue=  LinerSearch(arr, target);
        System.out.println("Index is " + indexValue);
    }
    static int LinerSearch(int[] arr, int target){
        if(arr.length == -1) {return -1;}

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(target == element){
                return i;
            }
        }

        return -1;
    }
}
