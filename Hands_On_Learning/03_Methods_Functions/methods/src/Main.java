public class Main {

    public static void main(String[] args) {
        System.out.println("Functions or we say Methods in Java");
        greeting(); // Calls greeting method
        String message = welcome("Udesh"); // Gets the welcome message
        System.out.println(message); // Outputs the message
    }

    // Method with no return value (void)
    static void greeting() {
        System.out.println("Hello! Welcome to the Greeting Function.");
    }

    // Method that returns a personalized welcome message
    static String welcome(String name) {
        return "Welcome, " + name + "! We're glad you're here.";
    }
}
