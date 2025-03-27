// Nested for loop
// A nested for loop is a loop inside another loop. The inner loop is executed multiple times for each iteration of the outer loop.
// The syntax for a nested for loop is as follows:
// for (initialization; condition; increment/decrement) {
//     for (initialization; condition; increment/decrement) {
//         // code to be executed
//     }
// }
// Nested for loops are used when you want to repeat a block of code multiple times, with each repetition containing another set of repetitions.
// Example: Program to print all possible combinations of two numbers from 1 to 3
public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
