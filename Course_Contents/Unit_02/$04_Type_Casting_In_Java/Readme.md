### 🔄 **Typecasting in Java**  

Typecasting in Java is the process of **converting one data type into another**. It is mainly used when dealing with different numeric types or converting objects within an inheritance hierarchy. Java provides two types of typecasting:  

---

## ✅ **1. Widening (Implicit) Typecasting**  
🔹 **Automatically done by Java** when a smaller data type is converted into a larger one.  
🔹 No data loss occurs.  

**📝 Example:**  
```java
public class WideningExample {
    public static void main(String[] args) {
        int num = 10;
        double convertedNum = num;  // Implicit conversion from int to double
        System.out.println("Converted Number: " + convertedNum);
    }
}
```
**💡 Output:**  
```
Converted Number: 10.0
```
**✔ Widening Conversion Order:**  
`byte → short → int → long → float → double`  

---

## ✅ **2. Narrowing (Explicit) Typecasting**  
🔹 **Manually performed by the programmer** when a larger data type is converted into a smaller one.  
🔹 **Data loss may occur** if the value cannot be stored in the smaller type.  

**📝 Example:**  
```java
public class NarrowingExample {
    public static void main(String[] args) {
        double num = 10.99;
        int convertedNum = (int) num;  // Explicit conversion from double to int
        System.out.println("Converted Number: " + convertedNum);
    }
}
```
**💡 Output:**  
```
Converted Number: 10  // Fractional part is lost
```
**✔ Narrowing Conversion Order:**  
`double → float → long → int → short → byte`  

---

## 🎯 **Typecasting with Objects (Upcasting & Downcasting)**  

### ✅ **Upcasting (Implicit)**
🔹 Converting a **subclass object** into its **superclass type**.  
🔹 Automatically performed when referring to a subclass object with a superclass reference.  

**📝 Example:**  
```java
class Parent {}
class Child extends Parent {}

public class UpcastingExample {
    public static void main(String[] args) {
        Parent obj = new Child();  // Upcasting
        System.out.println("Upcasting done successfully!");
    }
}
```
✔ **Upcasting ensures flexibility in polymorphism!**  

---

### ✅ **Downcasting (Explicit)**
🔹 Converting a **superclass reference** back to its **subclass type**.  
🔹 **Requires explicit casting** and should be done with caution to avoid `ClassCastException`.  

**📝 Example:**  
```java
class Parent {}
class Child extends Parent {}

public class DowncastingExample {
    public static void main(String[] args) {
        Parent obj = new Child();  // Upcasting
        Child childObj = (Child) obj;  // Downcasting
        System.out.println("Downcasting done successfully!");
    }
}
```
⚠ **If the object is not originally of the subclass type, downcasting will fail!**  

---

## 🚀 **When to Use Typecasting?**  
✔ Handling **numeric conversions** (e.g., double to int).  
✔ **Working with polymorphism** (Upcasting & Downcasting).  
✔ **Converting data from different sources** (e.g., parsing a String to an int).  

---

## 🔥 **Conclusion**  
Typecasting is an essential concept in Java for handling different data types and working efficiently with object hierarchies. **Understanding when to use implicit vs. explicit typecasting helps prevent errors and ensures smooth application performance.** 🚀  

