// Arithmetric Compound Operator
// The compound assignment operators are shorthand for simple assignment operators.
// They perform the operation on the two operands before assigning the result to the first operand.
// The compound assignment operators are:
// +=, -=, *=, /=, %=, &=, |=, ^=, >>=, >>>=, <<=.
//
// Example:
// a += b is equivalent to a = a + b
// a -= b is equivalent to a = a - b
// a *= b is equivalent to a = a * b    
// a /= b is equivalent to a = a / b
// a %= b is equivalent to a = a % b
// a &= b is equivalent to a = a & b
// a |= b is equivalent to a = a | b
// a ^= b is equivalent to a = a ^ b
// a >>= b is equivalent to a = a >> b  
public class ArithmetricCompoundOperator {
    public static void main(String[] args) {
        int a = 12; 
        int b = 12; 
        int c = 5;
        int d = 2;
        System.out.println("a += c = " + (a += c));
        System.out.println("b -= d = " + (b -= d));
        System.out.println("c *= a = " + (c *= a));
        System.out.println("d /= b = " + (d /= b));
        System.out.println("a %= c = " + (a %= c));
    }
}
