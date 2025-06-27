import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        System.out.println(" Comparing strings ");

        Scanner input = new Scanner(System.in);
        String fruitName = input.next();

        if(fruitName.equals("Mango")){
            System.out.println("Mango is the king of fruits ");
        }
    }
}
