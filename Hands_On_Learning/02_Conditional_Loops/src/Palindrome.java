import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0 ;
        while(number>0){
            int rem = number %10;
            sum = sum*10 + rem;
            number = number/10;
        }
        System.out.println("Palindrome is " + sum );
    }
}
