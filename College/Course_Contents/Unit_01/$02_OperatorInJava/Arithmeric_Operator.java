public class Arithmeric_Operator{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Using Integer");
        System.out.println("Addition of a and b is: " + c);
        c = a - b;
        System.out.println("Subtraction of a and b is: " + c);
        c = a * b;
        System.out.println("Multiplication of a and b is: " + c);
        c = a / b;
        System.out.println("Division of a and b is: " + c);
        c = a % b;
        System.out.println("Modulus of a and b is: " + c);

        //Arithmetic using double
        double d = 10.5;
        double e = 20.5;
        double f = d + e;
        System.out.println("Using Double");
        System.out.println("Addition of d and e is: " + f);
        f = d - e;
        System.out.println("Subtraction of d and e is: " + f);
        f = d * e;
        System.out.println("Multiplication of d and e is: " + f);
        f = d / e;
        System.out.println("Division of d and e is: " + f);
        f = d % e;
        System.out.println("Modulus of d and e is: " + f);  

    }
}