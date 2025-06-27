import java.util.Scanner;

public class Conditional_And_Loops {
    public static void main(String[] args) {
        System.out.println("Hello From conditional and loops from Video no 2");
        System.out.println("Enter the number of values you want to enter:");

        Scanner input = new Scanner(System.in);
        int noOfTimes = input.nextInt();

        int[] numbers = new int[noOfTimes];
        int sum = 0;

        System.out.println("Enter " + noOfTimes + " numbers:");
// for loop for when the conditional is known
        for (int i = 0; i < noOfTimes; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        if(sum>100){
            System.out.println("Sum of the numbers is: " + sum + "which is greater than 100");
        } else if (sum>0) {
            System.out.println("Sum of numbers is :" + sum + "which is less than 100");
        }
        else{
            System.out.println("Sum is betweeen 100 i.e "+ sum );
        }
        // while loop when condition is unknown.
        // do-while when we need to run the loop at least for one time.

    }
}
