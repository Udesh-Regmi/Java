public class StringBuilders {
    public static void main(String[] args) {
        System.out.println("StringBuilder Demo");

        // Create an empty StringBuilder
        StringBuilder builder = new StringBuilder();

        // Append strings to builder (mutable - modifies the same object)
        builder.append("Hello");
        builder.append(" ");
        builder.append("World");

        System.out.println("After append: " + builder);

        // Method chaining - concise and readable
        builder.append("!").append(" Welcome").append(" to Java.");
        System.out.println("After chaining: " + builder);

        // Insert at specific index
        builder.insert(6, "Beautiful ");
        System.out.println("After insert: " + builder);

        // Replace a portion of the string
        builder.replace(6, 15, "Amazing");
        System.out.println("After replace: " + builder);

        // Delete a portion of the string
        builder.delete(6, 14);
        System.out.println("After delete: " + builder);

        // Reverse the string
        builder.reverse();
        System.out.println("After reverse: " + builder);

        // Reverse back
        builder.reverse();

        // Access characters
        System.out.println("Character at index 0: " + builder.charAt(0));

        // Set a character
        builder.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + builder);

        // Length and capacity
        System.out.println("Length: " + builder.length());
        System.out.println("Capacity: " + builder.capacity()); // default is 16 + string length (auto grows)

        // Trim capacity to size
        builder.trimToSize();
        System.out.println("Capacity after trimToSize(): " + builder.capacity());

        // Convert to String
        String finalString = builder.toString();
        System.out.println("Final string: " + finalString);
    }
}
