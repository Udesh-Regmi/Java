public class Main {
    public static void main(String[] args) {
        // -----------------------------------------------
        // What is Recursion?
        // -----------------------------------------------
        // Recursion is a programming technique where a method calls itself
        // to solve smaller instances of the same problem.
        // It continues until it reaches a defined stopping condition called the base case.

        // When not to use recursion ?
//      //Use recursion when the problem structure is naturally recursive (e.g., trees,        //graphs, combinatorics). Otherwise, prefer iteration if memory is a concern —         //recursion uses the call stack, and too many calls can lead to                        //StackOverflowError.

        // -----------------------------------------------
        // Why Recursion?
        // -----------------------------------------------
        // 1. Solves problems that can be broken into similar sub-problems.
        // 2. Makes the code cleaner and more elegant for problems like:
        //    - Tree traversals
        //    - Backtracking (e.g., N-Queens, Sudoku)
        //    - Divide and Conquer (e.g., Merge Sort, Quick Sort)
        //    - Dynamic Programming (with memoization)

        // -----------------------------------------------
        // Base Condition in Recursion:
        // -----------------------------------------------
        // This is the condition that stops the recursion from continuing infinitely.
        // Without it, the function would keep calling itself and eventually cause a StackOverflowError.

        // Sample Example: Factorial
        int num = 5;
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }

    // Recursive function to calculate factorial
    static int factorial(int n) {
        // -----------------------------------------------
        // Base Condition
        // -----------------------------------------------
        // If n == 0 or n == 1, factorial is 1
        if (n == 0 || n == 1) {
            return 1;
        }

        // -----------------------------------------------
        // Recursive Call
        // -----------------------------------------------
        // Factorial(n) = n * Factorial(n-1)
        // Each call adds a new frame to the call stack.

        // Stack Trace Example for factorial(3):
        // factorial(3)
        //   → 3 * factorial(2)
        //         → 2 * factorial(1)
        //               → returns 1 (base case)
        //         → returns 2 * 1 = 2
        //   → returns 3 * 2 = 6

        return n * factorial(n - 1);

        // -----------------------------------------------
        // Time Complexity: O(n)
        // Space Complexity: O(n) due to call stack usage
        // Each call adds one frame to the stack until base case is hit
        // So for factorial(5), memory used is 5 stack frames
    }
}
