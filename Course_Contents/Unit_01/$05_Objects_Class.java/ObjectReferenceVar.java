// Description: ObjectReference class to demonstrate object reference in Java.
class Box {
    int length;
    int breadth;
    int height;
}
// ObjectReferenceVar class to demonstrate object reference in Java.
public class ObjectReferenceVar  {
    public static void main(String[] args) {
        // Creating an object of class ObjectReference
        Box obj1 = new Box();
        Box obj2 = obj1; // Creating a reference variable of class ObjectReference
        obj1.length = 10;
        obj1.breadth = 20;
        obj1.height = 30;
        System.out.println("Length of the box is: " + obj2.length); // Printing the length of the box
        System.out.println("Breadth of the box is: " + obj2.breadth); // Printing the breadth of the box
        System.out.println("Height of the box is: " + obj2.height); // Printing the height of the box
        System.out.println("Object Reference: " + obj2);
        System.out.println("Object Reference: " + obj1);
        // Printing the object reference
        
    }
    
}
