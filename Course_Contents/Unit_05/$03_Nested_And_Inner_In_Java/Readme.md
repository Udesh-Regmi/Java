# 📚 **Nested and Inner Classes in Java**

In Java, **nested classes** are classes defined within other classes. These nested classes are divided into two main categories:

1. **Static Nested Classes**: These do not depend on an instance of the enclosing class.
2. **Inner Classes**: These depend on an instance of the enclosing class and can access its instance members (variables and methods).

Nested classes help improve code organization, encapsulation, and can be useful in situations where one class needs to interact closely with another class. Let’s break down the types of nested classes in detail:

---

# 🟢 **1. Static Nested Classes**

A **static nested class** is a class defined inside another class with the `static` keyword. A static nested class behaves like a regular static member of the enclosing class. It can access only the **static members** of the enclosing class.

### ✅ **Characteristics of Static Nested Classes**:
- It does not have a reference to an instance of the enclosing class.
- It can only access the static members (fields and methods) of the enclosing class.
- It is associated with the class rather than an instance of the class.

### **Example of Static Nested Class**:

```java
class OuterClass {
    static int outerStaticVar = 10;

    static class StaticNestedClass {
        void display() {
            System.out.println("Outer Static Variable: " + outerStaticVar); // Access static variable
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // You can create an instance of the static nested class without creating an instance of OuterClass
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.display();  // Output: Outer Static Variable: 10
    }
}
```

**💡 Output:**
```
Outer Static Variable: 10
```

Here, `StaticNestedClass` is a static nested class. It can access the static member `outerStaticVar` of `OuterClass`, but it cannot access instance members directly.

---

# 🟢 **2. Inner Classes (Non-Static Nested Classes)**

An **inner class** is a class defined inside another class that is **non-static**. An inner class has access to all members (static and non-static) of its enclosing class, even the private ones. To create an instance of an inner class, you need an instance of the enclosing class.

### ✅ **Characteristics of Inner Classes**:
- It can access both **instance** and **static** members of the enclosing class.
- It needs an instance of the outer class to be created (cannot be instantiated without it).
- It can access private members of the enclosing class.

### **Example of Inner Class**:

```java
class OuterClass {
    private int outerInstanceVar = 20;

    class InnerClass {
        void display() {
            System.out.println("Outer Instance Variable: " + outerInstanceVar); // Access instance variable
        }
    }

    void createInnerClass() {
        InnerClass innerObj = new InnerClass();
        innerObj.display();
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();  // Creating an instance of the outer class
        outerObj.createInnerClass();  // Accessing the inner class through the outer class
    }
}
```

**💡 Output:**
```
Outer Instance Variable: 20
```

In this example, `InnerClass` is an instance (non-static) nested class. It can access the private `outerInstanceVar` of `OuterClass`, and it requires an instance of `OuterClass` to be created.

---

# 🟢 **3. Local Inner Classes**

A **local inner class** is defined within a method of the enclosing class. These classes are typically used when a class is needed only within a specific method.

### ✅ **Characteristics of Local Inner Classes**:
- Defined within a method of the enclosing class.
- Can access the final local variables and parameters of the method.
- Cannot have access to the enclosing class's instance variables directly (unless passed).

### **Example of Local Inner Class**:

```java
class OuterClass {
    private int outerVar = 100;

    void display() {
        class LocalInnerClass {
            void print() {
                System.out.println("Outer Variable: " + outerVar);  // Can access outer instance variable
            }
        }
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.print();
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.display();  // Prints: Outer Variable: 100
    }
}
```

**💡 Output:**
```
Outer Variable: 100
```

In this example, `LocalInnerClass` is defined inside the `display()` method. It can access the instance variable `outerVar` of the enclosing `OuterClass`. Local inner classes can only be instantiated within the method in which they are defined.

---

# 🟢 **4. Anonymous Inner Classes**

An **anonymous inner class** is a local inner class without a name. It is often used to instantiate objects of classes or interfaces in a concise manner. Anonymous inner classes are commonly used for event handling in GUI applications.

### ✅ **Characteristics of Anonymous Inner Classes**:
- It does not have a class name.
- It is used when you need to create an object with certain modifications without explicitly defining a new class.
- Typically used for one-time operations like implementing interfaces or extending classes.

### **Example of Anonymous Inner Class**:

```java
interface Greeting {
    void greet();
}

public class Main {
    public static void main(String[] args) {
        // Creating an anonymous inner class that implements the Greeting interface
        Greeting greeting = new Greeting() {
            public void greet() {
                System.out.println("Hello, Anonymous Inner Class!");
            }
        };
        greeting.greet();  // Prints: Hello, Anonymous Inner Class!
    }
}
```

**💡 Output:**
```
Hello, Anonymous Inner Class!
```

In this example, we are creating an anonymous inner class that implements the `Greeting` interface and providing an implementation of the `greet()` method.

---

# 🟢 **5. Nested Interfaces**

An interface can also be nested inside a class or another interface. Nested interfaces are typically used when the interface is only relevant to the enclosing class or interface.

### **Example of Nested Interface**:

```java
class OuterClass {
    interface NestedInterface {
        void display();
    }

    class InnerClass implements NestedInterface {
        public void display() {
            System.out.println("Implementing Nested Interface");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();  // Create an instance of inner class
        inner.display();  // Prints: Implementing Nested Interface
    }
}
```

**💡 Output:**
```
Implementing Nested Interface
```

Here, the interface `NestedInterface` is nested inside `OuterClass`, and the `InnerClass` implements this interface.

---

# 🚀 **Key Takeaways:**
1. **Static Nested Classes**: These are declared with the `static` keyword and can only access the static members of the enclosing class.
2. **Inner Classes**: Non-static classes that can access both static and instance members of the enclosing class.
3. **Local Inner Classes**: Classes defined inside methods; they can access local variables that are `final` or **effectively final**.
4. **Anonymous Inner Classes**: Used for implementing interfaces or extending classes in a concise manner.
5. **Nested Interfaces**: Interfaces defined within a class or another interface, often used for encapsulating interface definitions that are only relevant to the enclosing class.

---

