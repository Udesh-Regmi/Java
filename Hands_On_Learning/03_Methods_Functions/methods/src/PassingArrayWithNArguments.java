import java.util.Arrays;

public class PassingArrayWithNArguments {
    public static void main(String[] args) {
        sumofArrayItems(2,10);
        stringArray("Hari ", "Shyam", "Krishna", "Shiva");
        multipleWithname(2, 50 , "Product", "Price");

    }
    // They are also called variable arguments 'Vararg'
    // The Vararg must be at the last of the parameter and argument, otherwise it won't work.
    static void multipleWithname(int a, int b , String ...name){
        System.out.println(a*b);
    }
    static  void stringArray(String ...names){
        System.out.println(Arrays.toString(names));
    }
    static void sumofArrayItems(int ...nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println("Sum of items of array is " + sum );
    }
}
