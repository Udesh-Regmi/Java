import java.util.Scanner;

public class PrimeOrComposite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        boolean isPrime = PrimeCheck(userInput);
        if(isPrime){
            System.out.println("The given input is prime number");
        }
        else{
            System.out.println("The given input is composite number");
        }
    }
    static boolean PrimeCheck(int num){
        if(num<=1){
            return false;
        }
        int c = 2;
        while(c*c <= num ){
            if(num % c ==0){
                return false;
            }
            c++;
        }
        return c * c >= num;
    }
}
