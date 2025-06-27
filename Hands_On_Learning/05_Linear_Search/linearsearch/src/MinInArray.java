public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {1, 90, -4, -90,-120 ,  0, 4, 55, 89 , 92};
        System.out.println(Min(arr));
    }
    static int Min(int[] arr){
        if(arr.length == 0 ){
            return 0;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
