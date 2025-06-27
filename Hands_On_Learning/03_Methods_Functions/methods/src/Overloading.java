public class Overloading {
    public static void main(String[] args) {
        fun(20);
        fun("On a random Saturday");
       boolean isFun =  fun();
        System.out.println(isFun);

    }
    // Method Overloading is a concept where the name of the methods may be same but have different parameters or return type. The parameter numbers can also be same but the number may be different.
    // How does this work ? How does it determines which method to call.?
    // This works on compile time , it sees the parameter passed is integer so the integer method is called . Likewise for all other things
    static boolean fun(){
        return true;
    }
    static void fun(int a ){
        System.out.println("Fun is " + a);
    }
    static void fun(String name){
        System.out.println("Fun is " + name);
    }
}
