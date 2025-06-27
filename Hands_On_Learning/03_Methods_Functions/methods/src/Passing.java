import java.lang.reflect.Array;
import java.util.Arrays;

public class Passing {
    public static void main(String[] args) {
        int a= 01;
        int b= 22;

        change(a, b);
        // Here it wont change because the java only passes by value for primitive datatypes

        System.out.println(a + " "+ b );

        // For object and non primitive datatypes it passes by value also with its reference variable.
        int[] arr = {2, 4, 5, 6,7, 8,9, 20};
        System.out.println(Arrays.toString(arr));
        changeArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int a ,int b ){
        int temp = a;
        a=b;
        b= temp;
    }
    static void changeArray(int[] array ){
        array[0] = 200;// here it will change the main value because it is also pointing to the same reference variable.

    }
}
