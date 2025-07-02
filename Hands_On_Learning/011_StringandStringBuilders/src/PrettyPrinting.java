public class PrettyPrinting {
    public static void main(String[] args) {
        // Basic println usage - automatically adds a newline and converts values to String
        System.out.println("Using println:");
        int age = 25;
        double balance = 12345.6789;
        System.out.println("Age: " + age);
        System.out.println("Balance: " + balance);  // No formatting; prints full decimal

        System.out.println();

        // Using printf for formatted output
        System.out.println("Using printf:");

        // %d - integer, %f - floating-point, %.2f - floating point with 2 decimal places
        System.out.printf("Age: %d\n", age);
        System.out.printf("Balance: %.2f\n", balance);  // Rounded to 2 decimal places

        // Width and alignment examples
        // - → Left-align the text within the specified width
        System.out.println("\nFormatted Table:");
        System.out.printf("%-15s | %-10s | %-10s\n", "Name", "Age", "Balance");
        System.out.println("-------------------------------");
        System.out.printf("%-15s | %-10d | $%-9.2f\n", "Alice", 30, 5230.50);
        System.out.printf("%-15s | %-10d | $%-9.2f\n", "Bob", 28, 2981.75);
        System.out.printf("%-15s | %-10d | $%-9.2f\n", "Charlie", 35, 13489.33);

        // Scientific notation
        System.out.println("\nScientific notation:");
        System.out.printf("Scientific: %e\n", balance);

        // Boolean and character formatting
        boolean isActive = true;
        char grade = 'A';
        System.out.printf("Status: %b, Grade: %c\n", isActive, grade);

        // Hexadecimal and Octal formatting
        int number = 255;
        System.out.printf("Decimal: %d, Hex: %x, Octal: %o\n", number, number, number);

        // Note: printf does not automatically move to a new line unless \n is added manually.
    }
}
