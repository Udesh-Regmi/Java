public class IsOdd {
    public static void main(String[] args) {
        System.out.println("Bitwise Operator to find if the given number is odd or not ");
        int n = 99;
        System.out.println("The give number is odd : " + isOdd(n));
    }
    static boolean isOdd(int num){
        return (num & 1) == 1 ;

//         same
//        if((num &1) ==1){
//            return true
//        }

    }
}
