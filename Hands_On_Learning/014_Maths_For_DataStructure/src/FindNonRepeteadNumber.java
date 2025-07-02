public class FindNonRepeteadNumber {

    public static void main(String[] args) {
        System.out.println("🔍 To find the number that is not repeated in the array:");

        int[] arr = {1, 2, 3, 4, 6, 4, 3, 2, 1}; // 6 is the non-repeated element
        System.out.println("Non-repeated number: " + unique(arr));
    }
    // Works only when the repeated is only upto twice times.
    private static int unique(int[] arr) {
        int unique = 0;

        // XOR Principle:
        // - a ^ a = 0
        // - a ^ 0 = a
        // - XOR is commutative and associative, so order doesn't matter
        //
        // So, if we XOR all elements, duplicates cancel out and only the unique one remains.

        for (int num : arr) {
            unique ^= num;
        }

        return unique;
    }
}
