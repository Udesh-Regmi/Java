import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
       int[][] arr = {
               {0, 2, 3},
               {1, 4, 5, 7, 9, 100000},
               {90, 99, 999, 90909, 899, 69, 79, 49, 39},

       };
       int target = 99 ;
       int[] index = searchIndex(arr, target);
        System.out.println(Arrays.toString(index));
        int maximum = findMax(arr);
        System.out.println(maximum);

    }
    static int [] searchIndex(int [][] arr , int target){
        if(arr.length ==0 ){
            return new int[] {-1, -1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target == arr[i][j]){
                    return new int[]{i, j};
                }
            }
        }
        return new int [] {-1 , -1};

    }
    static int findMax(int[][] arr){
        int maxValue = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (maxValue < anInt) {
                    maxValue = anInt;
                }
            }
        }
        return maxValue;
    }
}
