public class WrapperClass {
    public static void main(String[] args) {
        // Primitive type: stored directly in stack memory, faster access, less memory
        int a = 10;

        // Wrapper class (Integer): object stored in heap, reference in stack
        Integer num = 10;  // Autoboxing: primitive 10 is converted to Integer object

        // Using compareTo(): available only in wrapper classes (not in primitives)
        // Returns 0 if equal, >0 if greater, <0 if smaller
        System.out.println(num.compareTo(a));  // Output: 0


        // final keyword: This has to be initialized when created and also cannot be changed after intitialized .
        
    }
}
