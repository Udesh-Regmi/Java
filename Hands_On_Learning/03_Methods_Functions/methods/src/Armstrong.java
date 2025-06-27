import java.util.Scanner;

public class Armstrong {
    // Armstrong numbers are those numbers whose digit's cube's sum is equal to its original number. Eg: 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153 , so it is armstrong.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        checkArmstrong(userInput);

    }
    static void checkArmstrong(int num){
        int originalVal= num;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum += Math.pow(rem, 3);
            num= num/10;
        }
        if(sum == originalVal) System.out.println("The given is armstrong");
       else System.out.println("The given is not armstrong");
    }
}
