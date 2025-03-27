//What is Class?
// A class is a blueprint for the object. We can think of class as a sketch (prototype) of a house. It contains all the details about the floors, doors, windows, etc. Based on these descriptions we build the house. House is the object.
// A class is a user-defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type.
// In general, a class definition includes the following:   
// 1. Fields: These are variables that represent the state of the object.
// 2. Methods: These are functions that represent the behavior of the object.
// 3. Constructors: These are special methods that are called when an object is created.
// 4. Access modifiers: These are keywords that define the visibility of the class, fields, and methods.
// 5. Other modifiers: These are keywords that define other properties of the class, fields, and methods.
// The class is a keyword in Java, which is used to create a class. The class keyword is followed by the class name and the class body enclosed by curly braces.
// Syntax:
// class ClassName {
//     // fields
//     // methods
// }
// Example:

// What is object?
// An object is an instance of a class. It is a real-world entity that has a state and behavior. An object has three characteristics:
// 1. State: It represents the data (value) of an object.
// 2. Behavior: It represents the behavior (functionality) of an object such as deposit, withdraw, etc.
// 3. Identity: It is a unique value that distinguishes an object from other objects.
// An object is created using the new keyword followed by the class name. The new keyword allocates memory for the object and returns a reference to the object.
// Syntax:
// ClassName objectName = new ClassName();
// Example:

class Student {
    int id;
    String name;
}
public class ClassObject {
    public static void main(String[] args) {
        // Creating an object of the class
        Student s1 = new Student();
        // Initializing object
        s1.id = 101;
        s1.name = "John";
        // Printing data
        System.out.println(s1.id + " " + s1.name);
    }
}
