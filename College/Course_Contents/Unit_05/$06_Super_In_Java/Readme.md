# 📚 **`super` Keyword in Java**

In Java, the `super` keyword is a reference variable used to refer to the **parent class** (superclass) object. It is primarily used within a subclass to access members (methods and variables) of its superclass.

### 🟢 **Key Uses of `super` in Java:**

1. **Accessing Parent Class Methods**
2. **Accessing Parent Class Constructors**
3. **Accessing Parent Class Fields**

---

### 🟢 **1. Accessing Parent Class Methods**

The `super` keyword allows a subclass to call a method from its superclass. This is particularly useful when a method is overridden in the subclass but you still want to call the method from the parent class.

### **Example: Accessing Parent Class Method with `super`**

```java
class Animal {  // Parent class
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {  // Child class
    void sound() {
        System.out.println("Dog barks.");
    }

    void callSuperSound() {
        super.sound();  // Calling the parent class method using 'super'
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();           // Dog barks.
        dog.callSuperSound();  // Animal makes a sound.
    }
}
```

**💡 Output:**
```
Dog barks.
Animal makes a sound.
```

- The `sound()` method is overridden in the `Dog` class.
- Using `super.sound()` in the `callSuperSound()` method calls the `sound()` method from the `Animal` class (the parent class).

---

### 🟢 **2. Accessing Parent Class Constructors**

The `super` keyword can also be used to invoke a constructor of the **parent class**. This is particularly useful if the parent class has constructors that need to be called from the subclass.

### **Example: Calling Parent Class Constructor with `super`**

```java
class Animal {  // Parent class
    String name;

    // Parent class constructor
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called. Name: " + name);
    }
}

class Dog extends Animal {  // Child class
    String breed;

    // Child class constructor
    public Dog(String name, String breed) {
        super(name);  // Calling parent class constructor using 'super'
        this.breed = breed;
        System.out.println("Dog constructor called. Breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
    }
}
```

**💡 Output:**
```
Animal constructor called. Name: Buddy
Dog constructor called. Breed: Golden Retriever
```

- The `super(name)` in the `Dog` constructor invokes the constructor of the `Animal` class, which takes the `name` parameter.
- This allows proper initialization of fields from the superclass.

---

### 🟢 **3. Accessing Parent Class Fields**

The `super` keyword can be used to refer to instance variables (fields) of the superclass. This is helpful when there is a **name conflict** between the superclass and subclass variables (i.e., both classes have fields with the same name).

### **Example: Accessing Parent Class Fields with `super`**

```java
class Animal {  // Parent class
    String name = "Animal";

    void showName() {
        System.out.println("Parent name: " + name);
    }
}

class Dog extends Animal {  // Child class
    String name = "Dog";

    void showName() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);  // Accessing parent class field
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.showName();
    }
}
```

**💡 Output:**
```
Child name: Dog
Parent name: Animal
```

- The `name` field is defined in both the `Animal` class (parent) and the `Dog` class (child).
- `super.name` is used to access the `name` field of the `Animal` class, bypassing the `name` field in the `Dog` class.

---

# 🚀 **Key Takeaways about `super`:**

1. **Accessing Parent Class Methods**: The `super` keyword allows a subclass to invoke a method from its superclass.
2. **Accessing Parent Class Constructors**: `super()` can be used to call a constructor from the superclass, typically for initialization purposes.
3. **Accessing Parent Class Fields**: If there is a field in the superclass that is shadowed by a field in the subclass, `super` can be used to refer to the superclass's field.

---

