public class OddOrEvenDigits {
    public static void main(String[] args) {
        int[] number = {12, 345, 2, 33, 44, 68, 90000, 6, 7896};

        // Using mathematical division method
        System.out.println("Even digit count (math method): " + findNumber(number));

        // Using string conversion method
        System.out.println("Even digit count (string method): " + findEvenDigitUsingString(number));
    }

    // Math-based digit counting
    static int findNumber(int[] numberArray) {
        int count = 0;
        for (int num : numberArray) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean hasEvenDigits(int num) {
        int digits = countDigits(num);
        return digits % 2 == 0;
    }

    private static int countDigits(int num) {
        if (num == 0) return 1;
        num = Math.abs(num); // Handle negative numbers safely
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    private static int countDigitsUsingLog(int num){
        return (int)(Math.log10(num) +1);
    }

    // String-based digit counting
    private static int findEvenDigitUsingString(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            int digitLength = String.valueOf(Math.abs(num)).length();
            if (digitLength % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
