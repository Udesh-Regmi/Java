public class OrderAgnosticBinarySearch {
    // When we don't know whether the array is sorted in ascending or descending order.
    public static void main(String[] args) {
//        int[] arr = { 12, 13, 18, 190, 909, 10000};
        int[] arr = {99, 98, 97, 96, 95, 44, 33, 22, 18, 11, 10, 9, 8, 7, 6, -2};
        int target = 18;
        int index = orderAgnosticBS(arr, target);
        System.out.println("Index of target is " + index);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0 ;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];
        while(start <=  end){
            int mid = start + (end- start ) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAscending){
                if(arr[mid] > target){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(arr[mid] < target){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }


        }
        return -1;
    }
}
