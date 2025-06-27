public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12 , 34, 22, 15, 89, 9, 10, 999, 69};
        int target = 999;
        int startIndex = 5;
        int endIndex = 8;
        System.out.println(  searchInRangeWithIndex(arr, target, startIndex, endIndex));
    }

    static boolean searchInRangeWithIndex(int[] arr, int target, int start, int end){
        if(arr.length ==0 ){
            return false;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if(element == target){
                return true;
            }
        }
        return false;
    }
}
