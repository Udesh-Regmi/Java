import java.util.Scanner;

public class CountNumberOfRepetition {
    public static void main(String[] args) {
        System.out.println("Enter a number to count digit repetition:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] digitCount = new int[10]; // index 0-9 for digits 0-9

        if (number == 0) {
            digitCount[0] = 1;
        } else {
            while (number > 0) {
                int rem = number % 10;
                digitCount[rem]++;
                number /= 10;
            }
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < digitCount.length; i++) {
            if (digitCount[i] > 0) {
                System.out.println("Digit " + i + " occurs " + digitCount[i] + " times.");
            }
        }

        input.close();
    }
}
