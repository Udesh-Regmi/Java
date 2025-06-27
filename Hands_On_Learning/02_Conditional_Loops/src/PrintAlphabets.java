import java.util.Scanner;

public class PrintAlphabets {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the character ");
        String para = input.next();
        char ch = para.charAt(0);
        System.out.println("Characters before this are : ");
        System.out.println("In this loop we will see the typecasting using ASCII");

        // Here why while loop because the no of iteration is not fixed.

        while( ch != 'A'-1){
            System.out.println("Character from last is " + ch);
            ch--;
        }

    }
}
