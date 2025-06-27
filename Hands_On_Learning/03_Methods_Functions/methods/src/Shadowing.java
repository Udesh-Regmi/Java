public class Shadowing {
    static int x= 20;

    public static void main(String[] args) {
        System.out.println(x);// Here it will be 20
        int x = 90;
        System.out.println(x );// Here it will be 90 as the previous x will be shadowed by this line .
        fun();

    }
    static  void fun(){
        System.out.println(x); // Here it will print 20.
    }
}
