# 🔥 **Method Overloading in Java: The Complete Guide**  

**Method Overloading** is a feature in Java that allows **multiple methods** in the same class to have **the same name but different parameters**.  

It is an example of **Compile-time Polymorphism (Static Binding)**, meaning the method call is resolved **at compile time**.  

---

# 📌 **1. What is Method Overloading?**  

When multiple methods in the same class **share the same name but differ in:**  
✔ **Number of parameters**  
✔ **Type of parameters**  
✔ **Order of parameters**  

Then, it is called **Method Overloading**.  

### ✅ **Example of Method Overloading**
```java
class MathOperations {
    // Method 1: Adding two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adding three integers (Overloaded)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adding two double values (Overloaded)
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.add(5, 10));        // Calls Method 1
        System.out.println(math.add(5, 10, 15));    // Calls Method 2
        System.out.println(math.add(5.5, 10.2));    // Calls Method 3
    }
}
```
**💡 Output:**  
```
15
30
15.7
```
📌 **Here, three methods with the same name `add()` are overloaded based on different parameters.**  

---

# 🟢 **2. Rules for Method Overloading**  
1️⃣ Methods **must have the same name**.  
2️⃣ The **parameter list must be different** (number, type, or order of parameters).  
3️⃣ **Return type is NOT considered for overloading** (i.e., only changing return type does NOT overload a method).  
4️⃣ **Access modifiers (public, private, etc.) can be different**.  
5️⃣ **Methods can be overloaded in the same class or in a subclass (through inheritance).**  

---

# 🟢 **3. Different Ways to Overload Methods**  

### 🔹 **1. Overloading by Changing the Number of Parameters**
```java
class Printer {
    // Print method with one parameter
    public void print(String message) {
        System.out.println("Message: " + message);
    }

    // Overloaded method with two parameters
    public void print(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Message: " + message);
        }
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print("Hello!");          // Calls the first method
        p.print("Hello!", 3);       // Calls the second method
    }
}
```
**💡 Output:**  
```
Message: Hello!
Message: Hello!
Message: Hello!
Message: Hello!
```

---

### 🔹 **2. Overloading by Changing Data Types of Parameters**
```java
class Display {
    public void show(int num) {
        System.out.println("Integer: " + num);
    }

    public void show(double num) { // Overloaded
        System.out.println("Double: " + num);
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Display d = new Display();
        d.show(10);     // Calls int version
        d.show(10.5);   // Calls double version
    }
}
```
**💡 Output:**  
```
Integer: 10
Double: 10.5
```

---

### 🔹 **3. Overloading by Changing the Order of Parameters**
```java
class OrderExample {
    public void show(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void show(int age, String name) { // Overloaded
        System.out.println("Age: " + age + ", Name: " + name);
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        OrderExample obj = new OrderExample();
        obj.show("Alice", 25);
        obj.show(30, "Bob");
    }
}
```
**💡 Output:**  
```
Name: Alice, Age: 25
Age: 30, Name: Bob
```

---

# 🟢 **4. Return Type Does NOT Affect Overloading**
A method **cannot be overloaded only by changing the return type**.  

### ❌ **Incorrect Example (Compilation Error)**
```java
class InvalidOverload {
    public int test() {
        return 10;
    }

    // ❌ This method is NOT an overload (only return type is different)
    public double test() { 
        return 10.5;
    }
}
```
🔴 **Error: Method signature must be different; return type alone doesn't differentiate methods.**

---

# 🟢 **5. Method Overloading with Type Promotion**
If no exact match is found for the method, Java **promotes smaller types to larger types** when calling an overloaded method.

### ✅ **Example: Type Promotion in Method Overloading**
```java
class TypePromotionExample {
    public void display(int a) {
        System.out.println("Integer: " + a);
    }

    public void display(double a) { // Overloaded
        System.out.println("Double: " + a);
    }

    public static void main(String[] args) {
        TypePromotionExample obj = new TypePromotionExample();
        obj.display(10);      // int -> exact match found
        obj.display(10.5);    // double -> exact match found
        obj.display('A');     // char is promoted to int
    }
}
```
**💡 Output:**  
```
Integer: 10
Double: 10.5
Integer: 65
```
📌 `'A'` is automatically promoted to its **ASCII value (65)** and calls the `display(int)` method.

---

# 🟢 **6. Real-World Example of Method Overloading**
### ✅ **Example: Overloading `calculateArea()` Method**
```java
class Shape {
    // Calculate area of a square
    public int calculateArea(int side) {
        return side * side;
    }

    // Calculate area of a rectangle
    public int calculateArea(int length, int width) {
        return length * width;
    }

    // Calculate area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class OverloadingRealWorldExample {
    public static void main(String[] args) {
        Shape shape = new Shape();

        System.out.println("Square Area: " + shape.calculateArea(5));
        System.out.println("Rectangle Area: " + shape.calculateArea(5, 10));
        System.out.println("Circle Area: " + shape.calculateArea(7.5));
    }
}
```
**💡 Output:**  
```
Square Area: 25
Rectangle Area: 50
Circle Area: 176.71458676442586
```
📌 **Method overloading helps to create flexible and reusable code!**  

---

# 🚀 **Key Takeaways**
✅ **Method Overloading allows multiple methods with the same name but different parameters.**  
✅ **It improves code reusability, readability, and maintainability.**  
✅ **Methods can be overloaded by changing the number, type, or order of parameters.**  
✅ **Return type alone does NOT differentiate overloaded methods.**  
✅ **Java promotes smaller types to larger types when no exact match is found.**  

---

## 🎯 **When to Use Method Overloading?**
✔ When methods **perform similar tasks but require different inputs**.  
✔ When you want to **increase code flexibility and readability**.  
✔ When designing **utility classes** that handle different data types (e.g., `Math.abs(int)`, `Math.abs(double)`).  

📌 **Mastering method overloading is key to writing efficient Java code! 🚀**  

