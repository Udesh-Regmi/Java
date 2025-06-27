public class Swap {
    public static void main(String[] args) {
        System.out.println("Swap two numbers using a temporary variable and non  temporary variable");
        IntegerSwapandDisplay(10, 20);
        System.out.println("-----------------------------");
        IntegerSwapWithoutTemporary(1890, 1830);

    }

    static void IntegerSwapandDisplay(int a, int b){
        System.out.println("Before swaping a is " + a  + " and b is " + b);
        int temp =a;
        a= b;
        b= temp;
        System.out.println("After swaing a is " + a  + " and b is " + b);
    }
    static void IntegerSwapWithoutTemporary( int a, int b){
        System.out.println("Without temporary variable ");

        System.out.println("Before swaping a is " + a  + " and b is " + b);

        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("After swapping a  is " + a  + " b is " + b);
    }
}
