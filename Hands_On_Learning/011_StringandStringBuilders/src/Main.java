public class Main {
    public static void main(String[] args) {
        System.out.println("String and String Builders in Java ");
        String val1 = "Udesh";
        String val2 = "Udesh";

        // When two variables are created using the above method then the values goes into string pool and refernce variable points to the same object.

        // == shows true when two reference variable points to same object..
        System.out.println(val2 == val1);

        // .equals() method only compares two object values if same return true otherwise false. .
        System.out.println(val2.equals(val1));
    }
}