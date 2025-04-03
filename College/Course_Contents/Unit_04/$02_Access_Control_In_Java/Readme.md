# 🔥 **Access Control in Java: A Comprehensive Guide**  

In Java, **access control** refers to the mechanism that restricts access to classes, methods, fields, and constructors in order to protect the integrity of the data and to implement the principle of **encapsulation**. Java provides four main access modifiers that control the level of access to the members of a class.

---

# 📌 **1. What is Access Control?**

Access control in Java is enforced using **access modifiers**. These modifiers define the scope of accessibility for classes, variables, methods, and constructors, i.e., where they can be accessed from.

### **Java Access Modifiers:**
1. **`public`**
2. **`protected`**
3. **`private`**
4. **default (package-private)**

Each access modifier defines a different level of access, ranging from unrestricted access (`public`) to highly restricted access (`private`).

---

# 🟢 **2. Types of Access Modifiers in Java**

### ✅ **1. `public` Access Modifier**

- **Access level**: The `public` modifier provides **unrestricted access**.
- **Where it can be accessed**: Anywhere, from any class, inside or outside the package.
- **Use case**: This modifier is used when you want the members of a class (fields or methods) to be accessible universally.

### Example:
```java
class Car {
    public String brand; // Public field
    public void drive() { // Public method
        System.out.println("Driving the car...");
    }
}
```

**💡** In the above example, the field `brand` and method `drive()` can be accessed from any class.

---

### ✅ **2. `protected` Access Modifier**

- **Access level**: The `protected` modifier allows access within the **same package** and by **subclasses** (even if they are in different packages).
- **Where it can be accessed**: 
  - Within the same package.
  - By subclasses (even if the subclass is in a different package).
- **Use case**: It is typically used when you want to allow subclasses to access certain fields or methods while restricting access from other classes.

### Example:
```java
class Vehicle {
    protected String model; // Protected field

    protected void start() { // Protected method
        System.out.println("Vehicle started...");
    }
}

class Car extends Vehicle {
    public void showModel() {
        System.out.println("Car model: " + model); // Accessing protected field
    }
}
```

**💡** Here, the `start()` method and `model` field can be accessed within the same package and by subclasses, like `Car`.

---

### ✅ **3. `private` Access Modifier**

- **Access level**: The `private` modifier provides the **most restrictive access**.
- **Where it can be accessed**: Only within the **same class**.
- **Use case**: It is used to ensure that the internal data of a class is not directly accessible or modifiable from outside the class. This is crucial for implementing **encapsulation**, ensuring data integrity.

### Example:
```java
class Person {
    private String name; // Private field

    private void displayName() { // Private method
        System.out.println("Name: " + name);
    }

    public void setName(String name) { // Public method to access private field
        this.name = name;
    }
}

class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John");
        // p.displayName(); // Error: displayName() has private access
    }
}
```

**💡** The `name` field and the `displayName()` method are private, meaning they cannot be accessed from outside the `Person` class directly. However, the public `setName()` method is used to set the private field's value.

---

### ✅ **4. Default (Package-Private) Access Modifier**

- **Access level**: If no access modifier is specified, the default modifier is applied, often called **package-private**.
- **Where it can be accessed**: It is accessible only **within the same package**.
- **Use case**: Use the default access level when you want the members to be visible only to other classes within the same package and not outside of it.

### Example:
```java
class Bike {
    String brand; // Default access (package-private)

    void run() { // Default access method
        System.out.println("Bike is running...");
    }
}
```

**💡** The `brand` field and `run()` method can be accessed only within the same package.

---

# 🟢 **3. Summary of Access Levels**

| **Modifier**   | **Same Class** | **Same Package** | **Subclass** | **Other Packages** |
|----------------|----------------|------------------|--------------|--------------------|
| `public`       | Yes            | Yes              | Yes          | Yes                |
| `protected`    | Yes            | Yes              | Yes          | Yes (only subclasses) |
| `private`      | Yes            | No               | No           | No                 |
| default (package-private) | Yes   | Yes              | No           | No                 |

---

# 🟢 **4. Access Control in Practice**

### Example 1: Using Different Access Modifiers in One Class
```java
class Person {
    public String name; // Public field
    protected int age;  // Protected field
    private String ssn; // Private field

    public Person(String name, int age, String ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    // Public method to access private field
    public String getSSN() {
        return ssn;
    }

    protected void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```

### Example 2: Accessing Fields in Another Class (In the Same Package)
```java
class Employee {
    public static void main(String[] args) {
        Person p = new Person("John", 30, "123-45-6789");

        // Accessing public field
        System.out.println("Name: " + p.name);

        // Accessing protected field within the same package
        System.out.println("Age: " + p.age);

        // Accessing private field is not allowed directly, so we use the public method
        System.out.println("SSN: " + p.getSSN());

        // Calling protected method from same package
        p.display();
    }
}
```

**💡 Output:**  
```
Name: John
Age: 30
SSN: 123-45-6789
Name: John
Age: 30
```

In this example, the `name` field is **public**, the `age` field is **protected**, and the `ssn` field is **private**. The `getSSN()` method is used to access the private `ssn` field, while the `display()` method is accessed because it's protected and we are within the same package.

---

# 🟢 **5. Why Use Access Modifiers?**

Access modifiers are important for:
1. **Encapsulation**: Restrict access to data so that internal state can be changed only through controlled methods.
2. **Security**: Ensures sensitive data and methods are not exposed unnecessarily.
3. **Code Maintainability**: By limiting access to members, you make sure that other parts of the code don't rely on internal implementation details.

---

# 🚀 **Key Takeaways:**

- **Public**: Members are accessible everywhere.
- **Protected**: Members are accessible within the same package and by subclasses.
- **Private**: Members are accessible only within the same class.
- **Default**: Members are accessible only within the same package.

---

## 🎯 **When to Use Each Modifier?**
- **`public`**: When you need unrestricted access to class members.
- **`protected`**: When you want to allow access within the same package and by subclasses.
- **`private`**: When you want to hide implementation details and protect data.
- **default (package-private)**: When the member should only be accessible within the same package.

📌 **Master access control to write more secure, maintainable, and well-encapsulated Java code! 🚀**

