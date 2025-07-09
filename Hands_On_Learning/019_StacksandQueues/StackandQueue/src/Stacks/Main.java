package Stacks;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Stack Implementation using Array ");
        Stack st = new Stack();
        st.Push(32);
        st.Push(321);
        st.Push(89);
        st.Pop();
        st.Push(23);
        st.Pop();
        st.Push(430934);
        st.Pop();
        int tos = st.Peek();
        System.out.println(tos);
        System.out.println(Arrays.toString(st.display()));

    }
}
