import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of elements: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Must enter at least one number.");
            return;
        }

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int largest = numbers[0];
        for (int i = 1; i < n; i++) {
//             one line solution which is optimized approach for complexity
               largest = Math.max(largest, numbers[i]);
//             typical appraoch
//            if (numbers[i] > largest) {
//                largest = numbers[i];
//            }
        }

        System.out.println("Largest number is: " + largest);
    }
}
