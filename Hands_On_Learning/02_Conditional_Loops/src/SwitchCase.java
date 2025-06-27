import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the operator: ");
        char operator = input.next().trim().charAt(0);
        System.out.println("Enter 1st number");
        float num1= input.nextFloat();
        System.out.println("Enter 2nd number");
        float num2= input.nextFloat();
//        This is enhanced form of switch case statement.

//        switch (operator) {
//            case '+' -> System.out.println("Sum of " + num1 + " and " + num2 + "is " + num1 + num2);
//            case '-' -> System.out.println("Difference of " + num1 + " and " + num2 + "is " + (num1 - num2));
//            case '*' -> System.out.println("Multiplication of " + num1 + " and " + num2 + "is " + num1 * num2);
//            case '/' -> System.out.println("Division of " + num1 + " and " + num2 + "is " + num1 / num2);
//            case '%' -> System.out.println("Remainder of " + num1 + " and " + num2 + "is " + num1 % num2);
//            default -> System.out.println("Enter valid credentials");
//        }
        switch (operator){
            case '+':
                System.out.println("Sum of " + num1 + " and " + num2 + " is " + num1+num2  );
                break;
            case '-':
                System.out.println("Difference of " + num1 + " and " + num2 + " is " + (num1 -num2 ) );
                break;
            case '*':
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + num1*num2  );
                break;
            case '/':
                System.out.println("Division of " + num1 + " and " + num2 + " is " + num1/num2  );
                break;
            case '%':
                System.out.println("Remainder of " + num1 + " and " + num2 + " is " + num1%num2  );
                break;
            default:
                System.out.println("Enter valid credentials");
                break;

        }

    }
}
