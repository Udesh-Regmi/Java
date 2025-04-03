
public class ExceptionDemo {
    public static void main(String[] args) {
        int d, a; 
        try {
            d=0; 
            a=42;
            double c = a/d; 
            System.out.println("This will not execute" + c);
            
        } catch ( ArithmeticException e) {
            System.out.println("Division by zero. Exception: " + e);
        }
        finally{
            System.out.println("This will execute whether try or catch. ");
        }
    }
}
