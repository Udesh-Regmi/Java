package Stacks;

public class Stack {
    int[] data ;
    private static final int  SIZE = 10;
    int ptr = -1;
    public Stack(){
        this(SIZE);
    }
    public Stack(int size){
        this.data = new int[size];
    }
    public boolean Push(int item){
        if(isFull()){
            System.out.println("Stack Overflow");
            return false;
        }
        ptr ++;
        data[ptr] = item;
        return  true;
    }
    public int Pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack Underflow");
        }
        int item = data[ptr];
        data[ptr] =0;
        ptr--;
        return  item;
    }

    public int[] display(){
        return data;
    }
    public boolean isFull() {
        return ptr == data.length - 1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
    public int Peek() throws Exception{
        if(isEmpty()){
            throw new Exception("No Item in stack ");
        }
        return data[ptr];
    }

}
