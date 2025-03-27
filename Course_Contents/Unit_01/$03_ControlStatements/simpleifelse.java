
public class simpleifelse {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        if (a > b) {
            System.out.println("a is greater than b");
        } 
        else if (a == b ) {
            System.out.println("a is equal to b");
         
            if (c > d) {
                System.out.println("a is greater than b");
            }
            else if(c == d) {
                System.out.println("b is greater than a");
            }
            else{
                System.out.println("c is greater than d");
            }
            
        }
        else {
            System.out.println("b is greater than a");
        }
    }
}
