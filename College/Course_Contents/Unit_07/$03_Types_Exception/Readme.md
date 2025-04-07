In Java, **exceptions** are a fundamental part of error handling, allowing developers to manage errors gracefully during the execution of a program. Java provides a range of predefined exceptions that are part of the standard Java API. These exceptions are defined in the `java.lang` package, and they are used to handle common error scenarios.

### **Types of Predefined Exceptions in Java**

#### 1. **Checked Exceptions**
Checked exceptions are exceptions that are checked at compile-time. The compiler requires that these exceptions be either caught in a `try-catch` block or declared in the method signature using the `throws` keyword. These exceptions typically represent recoverable conditions.

Some of the most commonly used checked exceptions in Java are:

- **IOException**  
  Represents errors related to Input/Output operations, such as file reading/writing errors or network issues.
  
  ```java
  try {
      FileReader file = new FileReader("nonexistentfile.txt");
  } catch (IOException e) {
      System.out.println("File not found!");
  }
  ```

- **SQLException**  
  Represents database access errors. It is thrown when a database operation fails.
  
  ```java
  try {
      // Code for database connection
  } catch (SQLException e) {
      System.out.println("Database connection failed!");
  }
  ```

- **ClassNotFoundException**  
  Thrown when the Java Virtual Machine (JVM) cannot find a class during runtime.
  
  ```java
  try {
      Class.forName("com.example.MyClass");
  } catch (ClassNotFoundException e) {
      System.out.println("Class not found!");
  }
  ```

- **FileNotFoundException**  
  A subclass of `IOException` that is thrown when an attempt to open a file fails.
  
  ```java
  try {
      FileInputStream file = new FileInputStream("nonexistentfile.txt");
  } catch (FileNotFoundException e) {
      System.out.println("File not found!");
  }
  ```

---

#### 2. **Unchecked Exceptions**
Unchecked exceptions are exceptions that occur during runtime and are not checked at compile time. These exceptions are often due to programming errors or unexpected conditions. They are subclasses of `RuntimeException` and can occur anywhere in the program.

Some common unchecked exceptions include:

- **ArithmeticException**  
  This exception is thrown when an illegal arithmetic operation occurs, such as dividing by zero.
  
  ```java
  try {
      int result = 10 / 0;
  } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero!");
  }
  ```

- **NullPointerException**  
  This exception is thrown when the application attempts to use `null` where an object is required.
  
  ```java
  String str = null;
  try {
      int length = str.length(); // Will throw NullPointerException
  } catch (NullPointerException e) {
      System.out.println("Null object reference!");
  }
  ```

- **ArrayIndexOutOfBoundsException**  
  This exception is thrown when an attempt is made to access an array with an invalid index (either negative or beyond the array’s size).
  
  ```java
  int[] arr = {1, 2, 3};
  try {
      System.out.println(arr[5]); // IndexOutOfBoundsException
  } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid array index!");
  }
  ```

- **IllegalArgumentException**  
  Thrown when a method receives an illegal or inappropriate argument.
  
  ```java
  try {
      int result = Integer.parseInt("abc"); // Will throw IllegalArgumentException
  } catch (IllegalArgumentException e) {
      System.out.println("Invalid argument passed!");
  }
  ```

- **ClassCastException**  
  This exception occurs when trying to cast an object to a subclass that it is not an instance of.
  
  ```java
  try {
      Object obj = new String("Hello");
      Integer num = (Integer) obj; // Will throw ClassCastException
  } catch (ClassCastException e) {
      System.out.println("Class casting failed!");
  }
  ```

---

#### 3. **Errors**
Errors are not typically caught by Java programs. These represent serious issues that occur during the execution of a program, and they are usually not recoverable. Errors are subclassed from `Error` class and are generally related to the environment the program is running in.

Some common errors include:

- **OutOfMemoryError**  
  Thrown when the JVM runs out of memory.
  
  ```java
  try {
      int[] arr = new int[Integer.MAX_VALUE]; // Will throw OutOfMemoryError
  } catch (OutOfMemoryError e) {
      System.out.println("Not enough memory!");
  }
  ```

- **StackOverflowError**  
  This error occurs when the stack of a thread overflows, usually due to deep recursion.
  
  ```java
  public static void recursion() {
      recursion(); // StackOverflowError will occur
  }

  public static void main(String[] args) {
      try {
          recursion();
      } catch (StackOverflowError e) {
          System.out.println("Stack overflow error!");
      }
  }
  ```

- **VirtualMachineError**  
  This is a superclass for errors that occur within the JVM, such as `OutOfMemoryError` and `StackOverflowError`.

---

### **Creating Custom Exceptions**
In addition to the predefined exceptions, you can create your own custom exceptions by extending the `Exception` class or `RuntimeException` class. A custom exception might look like this:

```java
// Custom checked exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Custom unchecked exception
class InvalidNameException extends RuntimeException {
    public InvalidNameException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new InvalidAgeException("Age cannot be negative");
        } catch (InvalidAgeException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        try {
            throw new InvalidNameException("Name cannot be empty");
        } catch (InvalidNameException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }
}
```



### **Conclusion**
Java provides a rich set of predefined exceptions to handle various error scenarios in the program. Using these predefined exceptions allows developers to write robust, error-resistant code. You can also create custom exceptions to handle specific cases that are unique to your application.

- **Checked Exceptions**: Errors that occur at compile-time (e.g., `IOException`, `SQLException`).
- **Unchecked Exceptions**: Errors that occur at runtime (e.g., `NullPointerException`, `ArithmeticException`).
- **Errors**: Serious issues that cannot be recovered from (e.g., `OutOfMemoryError`, `StackOverflowError`).

