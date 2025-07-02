import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("Various String Methods");

        String str = "Hello Welcome to Java";

        // Strings are immutable in Java — all methods return new objects instead of modifying the original
        System.out.println(Arrays.toString(str.toCharArray()));  // Converts string into a character array

        // Compares two strings for exact match (case-sensitive)
        System.out.println(str.equals("Hello WElcome to Java"));  // Returns true or false, 

        // Fetches the character at a specific index
        System.out.println(str.charAt(0));  // Returns 'H'

        // Finds the index of the first occurrence of the specified character or substring
        System.out.println(str.indexOf("l"));  // Returns index of first 'l'

        // Converts the string to all lowercase letters
        System.out.println(str.toLowerCase());  // Does not change original string

        // Converts the string to all uppercase letters
        System.out.println(str.toUpperCase());  // Again, original string stays the same

        // Checks if the string contains a given sequence of characters
        System.out.println(str.contains("elo"));  // Returns true if found

        // Joins (concatenates) the given string to the end
        System.out.println(str.concat(" Yes at last "));  // Adds text to the original and returns a new string

        // Splits the string into an array using space (" ") as the delimiter
        // Each word becomes a separate element in the array
        System.out.println(Arrays.toString(str.split(" ")));

    }
}
