public class RowSumIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 3, 9},
                {2, 9,199,  8},
                {3, 12, 19}
        };
        int highest = maxSum(arr);
        System.out.println(highest);
    }

    private static int maxSum(int[][] arr) {
        int maxRowSum = Integer.MIN_VALUE;
        for (int[] rowValues : arr) {
            int sum = 0;
            for (int singleValue : rowValues) {
                sum = sum + singleValue;
            }
            if (maxRowSum < sum) {
                maxRowSum = sum;
            }
        }
        return maxRowSum;
    }
}
