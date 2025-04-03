# 📚 **Packages in Java**

A **package** in Java is a **namespace** that organizes a set of related classes and interfaces. Conceptually, packages are like directories in a file system that group related files. In Java, packages help organize classes and interfaces into a namespace, preventing name conflicts, and making the code easier to manage, maintain, and reuse.

### 🟢 **Why Use Packages?**

- **Organization**: Packages help in logically grouping related classes and interfaces.
- **Access Control**: Packages provide access control and protection by restricting the visibility of classes, methods, and variables.
- **Reusability**: Packages make it easier to reuse code by providing access to libraries or modules.
- **Namespace Management**: They avoid class name conflicts by qualifying class names with the package name.

---

# 🟢 **1. Types of Packages in Java**

There are two types of packages in Java:

1. **Built-in Packages**
2. **User-defined Packages**

### 🟢 **a. Built-in Packages**

Java provides a set of predefined packages that contain useful classes and interfaces for performing common tasks like input/output operations, data structures, networking, etc. Some examples of built-in packages are:

- `java.lang` - Contains fundamental classes like `String`, `Math`, `Thread`, etc.
- `java.util` - Contains utility classes like `ArrayList`, `HashMap`, `Date`, etc.
- `java.io` - Contains classes for input and output operations like `File`, `InputStream`, `OutputStream`, etc.

Example:
```java
import java.util.Scanner;  // Importing Scanner class from java.util package

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
    }
}
```

### 🟢 **b. User-defined Packages**

In addition to built-in packages, you can create your own custom packages to organize classes according to the application requirements.

---

# 🟢 **2. Creating a User-defined Package**

### **Steps to Create a Package:**

1. **Define the Package**: Use the `package` keyword at the top of your Java file.
2. **Use the Package**: Use the `import` statement to use classes from other packages.

### **Example: Creating and Using a User-defined Package**

#### **Step 1: Define the Package**

Create a directory structure that represents the package name. For example, we can create a package called `com.myapp.utility`.

```java
// File: com/myapp/utility/Calculator.java

package com.myapp.utility;  // Define package

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
```

#### **Step 2: Use the Package**

Now, you can use the `Calculator` class from the `com.myapp.utility` package in another class.

```java
// File: Main.java

import com.myapp.utility.Calculator;  // Importing Calculator class from user-defined package

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(5, 3);
        int difference = calc.subtract(5, 3);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
```

**💡 Output:**
```
Sum: 8
Difference: 2
```

- In the `Main` class, we used the `import` statement to import the `Calculator` class from the `com.myapp.utility` package.
- The package name should match the directory structure. In this example, the file `Calculator.java` should be placed in the directory `com/myapp/utility`.

---

# 🟢 **3. Access Modifiers in Packages**

Java allows different levels of access control for classes and members within packages. The access levels are determined by access modifiers:

1. **`public`**: The class or member is accessible from anywhere.
2. **`protected`**: The class or member is accessible within the same package and subclasses (including subclasses in different packages).
3. **`default`** (no modifier): The class or member is accessible only within the same package.
4. **`private`**: The class or member is accessible only within the same class.

**Access Modifier Behavior Across Packages:**

| Access Modifier | Same Package | Subclass (Different Package) | Different Package |
|-----------------|--------------|------------------------------|-------------------|
| `public`        | Yes          | Yes                          | Yes               |
| `protected`     | Yes          | Yes                          | No (unless subclass) |
| `default`       | Yes          | No                           | No                |
| `private`       | No           | No                           | No                |

### **Example of Access Control in Packages**

```java
package com.myapp.utility;

public class Example {
    public String publicVar = "Public Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default Variable";
    private String privateVar = "Private Variable";

    public void printVars() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);
    }
}
```

```java
package com.myapp.main;

import com.myapp.utility.Example;

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println(obj.publicVar);  // Accessible
        System.out.println(obj.protectedVar);  // Not accessible (unless subclass)
        System.out.println(obj.defaultVar);  // Not accessible
        System.out.println(obj.privateVar);  // Not accessible
    }
}
```

- The `publicVar` is accessible from the `Main` class because it is declared `public`.
- The `protectedVar` and `defaultVar` are not accessible because the `Main` class is in a different package, and these variables are not `public`.
- The `privateVar` is not accessible because it is marked as `private`.

---

# 🟢 **4. Package Naming Conventions**

Here are some best practices for naming packages:

1. **Use lowercase letters**: Package names should be in lowercase to avoid conflict with class names.
2. **Use your domain name**: The convention is to use the reverse of your domain name for the root package (e.g., `com.example`).
3. **Organize packages logically**: Group related classes into packages that make sense, for example, grouping all classes related to `database` in a `com.example.database` package.

---

# 🟢 **5. Importing Classes from Packages**

- **Importing Single Class**:
    ```java
    import com.myapp.utility.Calculator;
    ```

- **Importing All Classes from a Package**:
    ```java
    import com.myapp.utility.*;  // Imports all classes from the utility package
    ```

- **Importing Static Members**:
    ```java
    import static com.myapp.utility.MathUtils.*;
    ```

---

# 🚀 **Key Takeaways about Packages in Java**:

1. **Packages help organize code** by grouping related classes, which improves maintainability and code management.
2. **Access control** can be enforced using access modifiers like `public`, `protected`, `default`, and `private`.
3. **User-defined packages** allow you to create custom namespaces, while **built-in packages** provide essential classes and utilities.
4. Packages promote **loose coupling** and allow classes to interact through interfaces and abstract methods, rather than knowing the implementation details of other classes.

---

