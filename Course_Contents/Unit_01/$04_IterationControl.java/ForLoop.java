// A for loop is a control structure that allows you to repeat a block of code a number of times.
// The for loop has three parts:
// 1. Initialization: The loop variable is initialized with a value. The initialization statement is executed only once.
// 2. Condition: The condition is evaluated. If the condition is true, the code inside the loop is executed. If the condition is false, the code inside the loop is not executed.
// 3. Increment/Decrement: The loop variable is incremented or decremented. The increment/decrement statement is executed after the code inside the loop is executed.
// The for loop syntax is as follows:
// for (initialization; condition; increment/decrement) {
//     // code to be executed
// }
// The for loop is used when you know the number of times you want to execute a block of code.

// Example: Program to print numbers from 1 to 5 using a for loop

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
