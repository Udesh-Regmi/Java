# 📚 **Inheritance in Java**

Inheritance is one of the fundamental concepts of **Object-Oriented Programming (OOP)** in Java. It allows a class (called the **child class** or **subclass**) to inherit fields and methods from another class (called the **parent class** or **superclass**). This enables **code reuse**, making it easier to build upon existing functionality without having to rewrite code.

### 🟢 **Basic Concept of Inheritance:**

- The subclass **inherits** the properties (fields) and behaviors (methods) of the superclass.
- It allows for **method overriding**, where the subclass can provide a specific implementation of a method that is already defined in the superclass.
- **Single Inheritance**: In Java, a class can inherit from only one superclass (single inheritance), but a class can implement multiple interfaces (which provides a form of multiple inheritance).

---

# 🟢 **1. Syntax of Inheritance in Java**

To create an inheritance relationship, you use the `extends` keyword.

```java
class ParentClass {
    // Parent class members
}

class ChildClass extends ParentClass {
    // Child class inherits from ParentClass
}
```

In this example, `ChildClass` extends `ParentClass`, meaning `ChildClass` inherits the fields and methods of `ParentClass`.

---

# 🟢 **2. Example of Inheritance in Java**

```java
class Animal {  // Parent class
    String name;
    int age;

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {  // Child class inherits from Animal
    String breed;

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";  // Inherited from Animal class
        dog.age = 3;         // Inherited from Animal class
        dog.breed = "Golden Retriever";
        
        dog.eat();           // Inherited method from Animal class
        dog.sleep();         // Inherited method from Animal class
        dog.bark();          // Method defined in Dog class
    }
}
```

**💡 Output:**
```
Buddy is eating.
Buddy is sleeping.
Buddy is barking.
```

### Key Points:
- **Animal** is the **superclass** (parent class).
- **Dog** is the **subclass** (child class) that inherits from `Animal`.
- The `Dog` class has its own method (`bark()`) in addition to the inherited methods (`eat()` and `sleep()`).

---

# 🟢 **3. Types of Inheritance in Java**

## a. **Single Inheritance**

In **single inheritance**, a subclass inherits from one superclass. This is the simplest form of inheritance in Java.

```java
class Vehicle {  // Parent class
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {  // Child class
    void drive() {
        System.out.println("Car is driving.");
    }
}
```

## b. **Multilevel Inheritance**

In **multilevel inheritance**, a class inherits from another class, and then another class inherits from that class, forming a chain of inheritance.

```java
class Vehicle {  // Parent class
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {  // Child class
    void drive() {
        System.out.println("Car is driving.");
    }
}

class ElectricCar extends Car {  // Grandchild class
    void charge() {
        System.out.println("Electric car is charging.");
    }
}
```

## c. **Hierarchical Inheritance**

In **hierarchical inheritance**, multiple subclasses inherit from a single superclass.

```java
class Vehicle {  // Parent class
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {  // Child class 1
    void drive() {
        System.out.println("Car is driving.");
    }
}

class Bike extends Vehicle {  // Child class 2
    void ride() {
        System.out.println("Bike is riding.");
    }
}
```

## d. **Multiple Inheritance (through Interfaces)**

Java does not support multiple inheritance directly (i.e., a class cannot inherit from multiple classes). However, Java supports **multiple inheritance** through interfaces. A class can implement multiple interfaces.

```java
interface Vehicle {
    void start();
}

interface Engine {
    void run();
}

class Car implements Vehicle, Engine {  // Multiple interfaces
    public void start() {
        System.out.println("Car is starting.");
    }

    public void run() {
        System.out.println("Car engine is running.");
    }
}
```

---

# 🟢 **4. Method Overriding in Inheritance**

Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in the superclass. This allows the subclass to customize or extend the behavior of the superclass method.

### ✅ **Example of Method Overriding**:

```java
class Animal {  // Parent class
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {  // Child class
    @Override  // Overriding the method in the parent class
    public void sound() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();  // Animal makes a sound.

        Dog dog = new Dog();
        dog.sound();  // Dog barks.
    }
}
```

**💡 Output:**
```
Animal makes a sound.
Dog barks.
```

### Key Points:
- The `sound()` method is overridden in the `Dog` class.
- The `@Override` annotation is used to indicate that a method is being overridden, though it is not mandatory.

---

# 🟢 **5. The `super` Keyword in Inheritance**

The `super` keyword in Java is used to refer to the **parent class**. It can be used to:

- **Access parent class constructors**.
- **Access parent class methods**.
- **Access parent class fields**.

### ✅ **Example of Using `super`**:

```java
class Animal {  // Parent class
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {  // Child class
    public Dog(String name) {
        super(name);  // Calling the parent class constructor
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat();  // Calling method from Animal class
        dog.bark(); // Calling method from Dog class
    }
}
```

**💡 Output:**
```
Buddy is eating.
Buddy is barking.
```

In this example:
- The `super(name)` in the `Dog` constructor calls the parent class (`Animal`) constructor to initialize the `name` field.
- The `eat()` method is inherited from `Animal`, and `bark()` is specific to the `Dog` class.

---

# 🚀 **Key Takeaways:**
1. **Inheritance** allows a subclass to inherit fields and methods from a superclass, promoting **code reuse**.
2. **Method overriding** enables the subclass to define its own version of a method that is already defined in the superclass.
3. The `super` keyword is used to access **parent class constructors, methods, and fields**.
4. Java supports multiple inheritance **through interfaces**, but not directly through classes.

---

