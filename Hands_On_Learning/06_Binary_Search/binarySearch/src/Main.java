import static java.util.Arrays.binarySearch;

public class Main {
    public static void main(String[] args) {
        System.out.println("Binary Search Algorithm ");
        int [] arr = {-90, -80, -10, 1,2, 3, 5, 99, 102, 106, 190, 204, 909};
        int target = -6;
        // It will only work in when the target is in the array otherwise it works differently by seeing where the value could be and give new index in negative
        int index = binarySearch(arr, target);
        if(index < 0) {
            System.out.println("Element not found using built-in binary search.");
        } else {
            System.out.println("Element found at index: " + index);
        }


        int targetIndex = userDefinedBinarySearch(arr, target);
        System.out.println(targetIndex);
    }

    private static int userDefinedBinarySearch(int[] arr, int target) {
        int start = 0 ;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}