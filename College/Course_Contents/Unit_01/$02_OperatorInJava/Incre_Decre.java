// package Unit_01.02_OperatorInJava;
// Increment and Decrement Operator in Java
// Increment and Decrement operators are used to increase or decrease the value of an operand by 1.
// The increment operator is used to increase the value of the variable by 1 and the decrement operator is used to decrease the value of the variable by 1.
// The increment operator is denoted by ++ and the decrement operator is denoted by --.
// The increment and decrement operators can be used in two ways:
// 1. Pre-Increment and Pre-Decrement
// 2. Post-Increment and Post-Decrement
// Pre-Increment and Pre-Decrement
// In pre-increment and pre-decrement, the value of the variable is first incremented or decremented and then used in the expression.
// Syntax:
// ++variable;
// --variable;
// Example:
// int a = 10;
// int b = 10;
// System.out.println("a++ = " + a++);
// System.out.println("++b = " + ++b);
// System.out.println("a = " + a);
// System.out.println("b = " + b);
// In the above example, the value of a is first printed and then incremented by 1. The value of b is first incremented by 1 and then printed.
// Post-Increment and Post-Decrement    
// In post-increment and post-decrement, the value of the variable is first used in the expression and then incremented or decremented.
// Syntax:
// variable++;
// variable--;
// Example:
// int a = 10;
// int b = 10;
// System.out.println("a++ = " + a++);
// System.out.println("++b = " + ++b);
// System.out.println("a = " + a);
// System.out.println("b = " + b);
// In the above example, the value of a is first printed and then incremented by 1. The value of b is first incremented by 1 and then printed.


public class Incre_Decre {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println("a++ = " + a++);
        System.out.println("++b = " + ++b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
}
