// Do-While Loop
// The do-while loop is similar to the while loop, except that the condition is evaluated after executing the code inside the loop.
// The do-while loop syntax is as follows:
// do {
//     // code to be executed
// } while (condition);
// The code inside the loop is executed at least once, even if the condition is false.
// The do-while loop is used when you want to execute a block of code at least once and then repeat it based on a condition.
// Example: Program to print numbers from 1 to 5 using a do-while loop
//

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
