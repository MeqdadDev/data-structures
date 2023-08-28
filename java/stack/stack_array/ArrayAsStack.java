package DataStructures;

public class ArrayAsStack {

    private final int[] stack = new int[100];
    int top;

    public ArrayAsStack() {
        this.top = -1;
        System.out.println("Stack initialized, MaxSize=100");
    }

    public void push(int item){
        top++;
        try {
            stack[top] = item;
            int percent = top + 1;
            System.out.println("Used Space = " + percent + "%");
        }catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Stack is full");
            top--;
        }
    }

    public void pop(){
        top--;
        if (top < 0){
            return;
        }
    }

    public int getTop(){
        if (top > -1)
            return stack[top];
        else
            return top;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
