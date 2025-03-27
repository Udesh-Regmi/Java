// While loop in Java
// A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.
// The while loop can be thought of as a repeating if statement.
// The while loop syntax is as follows:
// while (condition) {
//     // code to be executed
// }
// The condition is evaluated before executing the code inside the loop. If the condition is true, the code inside the loop is executed. If the condition is false, the code inside the loop is not executed.
// The while loop is used when you want to execute a block of code repeatedly based on a condition.
// Example: Program to print numbers from 1 to 5 using a while loop
//
public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
