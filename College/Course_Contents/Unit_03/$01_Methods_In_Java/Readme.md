# 🔥 **Methods in Java: The Ultimate Guide**  

A **method** in Java is a **block of code** that performs a **specific task**. It helps in **code reusability, modularity, and organization**.  

---

# 📌 **1. What is a Method in Java?**  
A **method** is a function inside a Java class that contains **logic to perform a specific task**.  
A method is defined using the following syntax:  

### ✅ **Basic Syntax of a Method**
```java
returnType methodName(parameters) {
    // Code inside the method
    return value;  // If returnType is not void
}
```

### ✅ **Example: Simple Method**
```java
public class Example {
    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(5, 10);  // Calling the method
        System.out.println("Sum: " + sum);
    }
}
```
**💡 Output:**  
```
Sum: 15
```

---

# 🟢 **2. Types of Methods in Java**  

## 🔹 **1. Built-in Methods (Predefined Methods)**
Java provides many built-in methods such as:
```java
String str = "Java";
System.out.println(str.length());  // Output: 4
System.out.println(Math.sqrt(16)); // Output: 4.0
```

## 🔹 **2. User-Defined Methods**
Methods created by programmers to **perform specific tasks**.

---

# 🟢 **3. Different Types of User-Defined Methods**  

### 🟡 **1. Method with No Parameters and No Return Type**
```java
public class HelloWorld {
    // A simple method that prints a message
    public static void sayHello() {
        System.out.println("Hello, Java!");
    }

    public static void main(String[] args) {
        sayHello();  // Calling the method
    }
}
```
**💡 Output:**  
```
Hello, Java!
```

### 🟡 **2. Method with Parameters and No Return Type**
```java
public class Greet {
    // Method with a parameter
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greetUser("Alice");  // Passing argument
    }
}
```
**💡 Output:**  
```
Hello, Alice!
```

### 🟡 **3. Method with Parameters and Return Type**
```java
public class SquareCalculator {
    // Method to calculate the square of a number
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int result = square(5);
        System.out.println("Square of 5: " + result);
    }
}
```
**💡 Output:**  
```
Square of 5: 25
```

### 🟡 **4. Method Overloading (Multiple Methods with Same Name but Different Parameters)**
```java
public class MethodOverloading {
    // Overloaded method - 1
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Overloaded method - 2
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(multiply(3, 4));      // Calls int version
        System.out.println(multiply(3.5, 2.0));  // Calls double version
    }
}
```
**💡 Output:**  
```
12
7.0
```

---

# 🟢 **4. Method Scope in Java**  

### 🟡 **Local Variables inside Methods**
```java
public class ScopeExample {
    public static void printNumber() {
        int number = 10;  // Local variable
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        printNumber();
    }
}
```
**💡 Output:**  
```
Number: 10
```

---

# 🟢 **5. Pass by Value in Java Methods**  
Java **passes arguments by value**, meaning changes inside the method **do not affect the original variable**.

### ✅ **Example: Pass by Value**
```java
public class PassByValueExample {
    public static void changeValue(int num) {
        num = 20;  // This change won't reflect in main
    }

    public static void main(String[] args) {
        int x = 10;
        changeValue(x);
        System.out.println("Value of x: " + x);  // Still 10
    }
}
```
**💡 Output:**  
```
Value of x: 10
```

---

# 🟢 **6. Recursion in Java (Method Calling Itself)**  

A **recursive method** is a method that **calls itself** to solve a problem.

### ✅ **Example: Factorial Using Recursion**
```java
public class FactorialExample {
    public static int factorial(int n) {
        if (n == 0) return 1; // Base case
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
```
**💡 Output:**  
```
Factorial of 5: 120
```

---

# 🟢 **7. Method References in Java (Java 8 Feature)**  

**Method references** allow us to **pass a method as an argument** to another method.

### ✅ **Example: Using Method Reference**
```java
import java.util.Arrays;

public class MethodReferenceExample {
    public static void printMessage(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        String[] messages = {"Hello", "Java", "Methods"};
        
        // Using method reference
        Arrays.stream(messages).forEach(MethodReferenceExample::printMessage);
    }
}
```
**💡 Output:**  
```
Hello
Java
Methods
```

---

# 🚀 **Key Takeaways**
✅ **Methods improve code reusability and readability.**  
✅ **Java uses Pass-by-Value, meaning method arguments do not affect the original variable.**  
✅ **Overloading allows multiple methods with the same name but different parameters.**  
✅ **Recursion enables methods to call themselves for solving complex problems.**  
✅ **Method References (Java 8+) simplify method calls using lambda expressions.**  

---

## 🎯 **When to Use Methods?**
✔ When the same logic is used **multiple times** in a program.  
✔ To **modularize** a program into smaller parts.  
✔ To **reduce redundancy** and **increase code efficiency**.  

📌 **Mastering methods is a must for clean, maintainable, and scalable Java applications! 🚀**  

